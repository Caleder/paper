package com.bingbing.paper.controller;

import com.bingbing.paper.Vo.SchoolRankVo;
import com.bingbing.paper.common.CommonResult;
import com.bingbing.paper.form.CollectForm;
import com.bingbing.paper.mybatis.entity.SchoolBegin;
import com.bingbing.paper.mybatis.entity.SchoolRank;
import com.bingbing.paper.service.CollectService;
import com.bingbing.paper.service.SchoolRankService;
import com.bingbing.paper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private SchoolRankService schoolRankService;
    @Autowired
    private UserService userService;
    @Autowired
    private CollectService collectService;

    @GetMapping(value = "/list")
    public CommonResult list(String userId) {
        Integer schoolRankCount = schoolRankService.getSchoolRankCount(new SchoolRankVo());
        Integer userListCount = userService.getUserListCount("", "", true, "", "");
        CollectForm collectForm = new CollectForm();
        collectForm.setUserId(userId);
        int collectCount = collectService.getCollectCount(collectForm);
        Map<String,Object> map = new HashMap<>();
        map.put("schoolRankCount",schoolRankCount);
        map.put("userListCount",userListCount);
        map.put("collectCount",collectCount);
        return CommonResult.success(map);
    }

}
