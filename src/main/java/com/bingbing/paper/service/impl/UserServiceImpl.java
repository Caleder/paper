package com.bingbing.paper.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.core.util.StrUtil;
import com.bingbing.paper.common.util.JwtTokenUtil;
import com.bingbing.paper.mybatis.entity.User;
import com.bingbing.paper.mybatis.entity.UserExample;
import com.bingbing.paper.mybatis.mapper.UserMapper;
import com.bingbing.paper.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByUsername(String username) {
        UserExample userExample = new UserExample();
        userExample.createCriteria()
                .andEnabledEqualTo(true)
                .andUsernameEqualTo(username);
        List<User> userList = userMapper.selectByExample(userExample);
        if (CollectionUtil.isNotEmpty(userList)) {
            return userList.get(0);
        }
        return null;
    }

    @Override
    public User register(User userParam) {
        if(StrUtil.isBlank(userParam.getMobile()) ||
                !ReUtil.isMatch("^\\d{11}$", userParam.getMobile())){
            return null;
        }
        User user = new User();
        BeanUtils.copyProperties(userParam, user);
        user.setId(UUID.randomUUID().toString());
        user.setGmtCreate(new Date());
        user.setEnabled(true);
        user.setMotto(userParam.getMotto());
        user.setName(userParam.getName());
        user.setRole(userParam.getRole());
        //查询是否有相同用户名的用户
        UserExample example = new UserExample();
        example.createCriteria()
                .andEnabledEqualTo(true)
                .andUsernameEqualTo(user.getUsername());
        List<User> umsAdminList = userMapper.selectByExample(example);
        if (umsAdminList.size() > 0) {
            return null;
        }
        //将密码进行加密操作
        String encodePassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodePassword);
        userMapper.insert(user);
        user.setPassword("");
        return user;
    }

    @Override
    public String login(String username, String password) {
        String token = null;
        try {
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
            if (!passwordEncoder.matches(password, userDetails.getPassword())) {
                throw new BadCredentialsException("密码不正确");
            }
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            token = jwtTokenUtil.generateToken(userDetails);
        } catch (AuthenticationException e) {
            LOGGER.warn("登录异常:{}", e.getMessage());
        }
        return token;
    }

    @Override
    public Page<User> getUserList(Page<User> userPage,String name, String username, Boolean enabled,String mobile,String motto) {
        PageHelper.startPage(userPage.getPageNum(),userPage.getPageSize());
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        if(StrUtil.isNotBlank(name)){
            criteria.andNameLike(name);
        }
        if(StrUtil.isNotBlank(username)){
            criteria.andUsernameLike(username);
        }
        if(StrUtil.isNotBlank(mobile)){
            criteria.andMobileLike(mobile);
        }
        if(enabled != null){
            criteria.andEnabledEqualTo(enabled);
        }
        if(StrUtil.isNotBlank(motto)){
            criteria.andMottoLike(motto);
        }
        example.setOrderByClause("gmt_create DESC");
        List<User> users = userMapper.selectByExample(example);
        if(CollectionUtil.isNotEmpty(users)){
            return (Page<User>)users;
        }
        return null;
    }

    @Override
    public Integer getUserListCount(String name, String username, Boolean enabled,String mobile,String motto) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        if(StrUtil.isNotBlank(name)){
            criteria.andNameLike(name);
        }
        if(StrUtil.isNotBlank(username)){
            criteria.andUsernameLike(username);
        }
        if(StrUtil.isNotBlank(mobile)){
            criteria.andMobileLike(mobile);
        }
        if(enabled != null){
            criteria.andEnabledEqualTo(enabled);
        }
        if(StrUtil.isNotBlank(motto)){
            criteria.andMottoLike(motto);
        }
        int users = userMapper.countByExample(example);
        return users;
    }

    @Override
    public void updateUser(User user) {
        if(user == null){
            return;
        }
        userMapper.updateByPrimaryKeySelective(user);
    }

}
