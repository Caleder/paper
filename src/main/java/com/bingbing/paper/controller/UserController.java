package com.bingbing.paper.controller;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.bingbing.paper.common.CommonResult;
import com.bingbing.paper.config.AuthCodeConfig;
import com.bingbing.paper.enumType.RedisBusEnum;
import com.bingbing.paper.model.PageModel;
import com.bingbing.paper.model.UserLoginParam;
import com.bingbing.paper.mybatis.entity.User;
import com.bingbing.paper.service.UserService;
import com.github.pagehelper.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Api(tags = "UserController", description = "后台用户管理")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Autowired(required = false)
    private RedisTemplate<String, Object> redisTemplate;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping(value = "/list")
    public CommonResult list(String name,String username,Boolean enabled,String mobile,String motto,int current,int size) {
        Page<User> page = new Page<User>();
        page.setPageNum(current);
        page.setPageSize(size);
        page = userService.getUserList(page,name,username,enabled,mobile,motto);
        Integer userListCount = userService.getUserListCount(name,username, enabled, mobile,motto);
        if(page == null){
            page = new Page<User>();
        }
        PageModel<User> pageModel = new PageModel<User>();
        pageModel.setPage(page);
        pageModel.setPageTotal(userListCount);
        return CommonResult.success(pageModel);
    }

    @ApiOperation(value = "用户注册")
    @PostMapping(value = "/register")
    public CommonResult<User> register(@RequestBody User userParam) {
        User user = userService.register(userParam);
        if (user == null) {
            return CommonResult.failed("用户已存在");
        }
        return CommonResult.success(user);
    }

    @ApiOperation(value = "登录以后返回token")
    @PostMapping(value = "/login")
    public CommonResult login(@RequestBody UserLoginParam userLoginParam) {
        if (userLoginParam == null) {
            return CommonResult.failed("参数异常");
        }
        if (StrUtil.isBlank(userLoginParam.getUsername())
                || StrUtil.isBlank(userLoginParam.getPassword())
                || StrUtil.isBlank(userLoginParam.getRandomStr())
                || StrUtil.isBlank(userLoginParam.getCode())) {
            return CommonResult.failed("参数异常");
        }
        Object object = redisTemplate.opsForValue().get(RedisBusEnum.PIC_VERIFICATION_CODE.name() +
                userLoginParam.getRandomStr());
        if (object == null) {
            return CommonResult.failed("验证码已过期");
        }
        String text = object.toString();
        if (!StrUtil.equalsIgnoreCase(text, userLoginParam.getCode())) {
            return CommonResult.failed("验证码不正确");
        }
        redisTemplate.delete(RedisBusEnum.PIC_VERIFICATION_CODE.name() + userLoginParam.getRandomStr());
        String token = userService.login(userLoginParam.getUsername(), userLoginParam.getPassword());
        if (token == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        User userByUsername = userService.getUserByUsername(userLoginParam.getUsername());
        Map<String, Object> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        tokenMap.put("headToken", tokenHead + " " + token);
        tokenMap.put("user", userLoginParam.getUsername());
        tokenMap.put("userRole", userByUsername.getRole());
        tokenMap.put("userId", userByUsername.getId());
        //tokenMap.put("userAll", JSONUtil.parse(userService.getUserByUsername(userLoginParam.getUsername())));
        redisTemplate.opsForValue().set("USER_PASSWORD::" + userLoginParam.getUsername(),
                passwordEncoder.encode(userLoginParam.getPassword()), 1, TimeUnit.DAYS);
        redisTemplate.opsForValue().set("USER_TOKEN::" + userLoginParam.getUsername(),
                tokenHead + " " + token, 1, TimeUnit.DAYS);
        redisTemplate.opsForValue().set("USERALL",userByUsername, 1, TimeUnit.DAYS);
        return CommonResult.success(tokenMap);
    }

    @GetMapping("/code/{randomStr}")
    public void createCode(@PathVariable String randomStr, HttpServletResponse response) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        String code = AuthCodeConfig.drawImg(output);
        redisTemplate.opsForValue().set(RedisBusEnum.PIC_VERIFICATION_CODE.name() + randomStr, code, 300,
                TimeUnit.SECONDS);
        try {
            ServletOutputStream out = response.getOutputStream();
            output.writeTo(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @GetMapping(value = "/userMsg/{username}")
    public CommonResult userMsg(@PathVariable("username") String username){
        if(StrUtil.isBlank(username)){
            return CommonResult.failed("参数异常");
        }
        User userByUsername = userService.getUserByUsername(username);
        return CommonResult.success(userByUsername);
    }

    @ApiOperation(value = "用户修改")
    @PostMapping(value = "/updateUser")
    public CommonResult<Object> updateUser(@RequestBody User userParam) {
        if (userParam == null) {
            return CommonResult.failed("参数异常");
        }
        userService.updateUser(userParam);
        return CommonResult.success(true);
    }

    @ApiOperation(value = "用户修改密码")
    @PostMapping(value = "/updateUserPwd")
    public CommonResult<Object> updateUserPwd(@RequestBody User userParam) {
        if (userParam == null) {
            return CommonResult.failed("参数异常");
        }
        String encodePassword = passwordEncoder.encode(userParam.getNewPassword());
        userParam.setPassword(encodePassword);
        userService.updateUser(userParam);
        redisTemplate.delete("USER_TOKEN::"+userParam.getUsername());
        redisTemplate.delete("USER_PASSWORD::"+userParam.getUsername());
        redisTemplate.delete("USERALL");
        return CommonResult.success(true);
    }

}
