package com.bingbing.paper.controller;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.date.DateUtil;
import com.bingbing.paper.common.CommonResult;
import com.bingbing.paper.form.CollectForm;
import com.bingbing.paper.model.CollectModel;
import com.bingbing.paper.model.PageModel;
import com.bingbing.paper.mybatis.entity.Collect;
import com.bingbing.paper.mybatis.entity.SchoolRank;
import com.bingbing.paper.mybatis.entity.User;
import com.bingbing.paper.service.CollectService;
import com.bingbing.paper.service.SchoolRankService;
import com.bingbing.paper.service.UserService;
import com.github.pagehelper.Page;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/schoolCollect")
public class SchoolCollectController {

    @Autowired
    private CollectService collectService;
    @Autowired
    private SchoolRankService schoolRankService;
    @Autowired
    private UserService userService;

    @GetMapping(value = "/list")
    public CommonResult list(CollectForm collectForm) {
        Page<Collect> page = new Page<Collect>();
        page.setPageNum(collectForm.getCurrent());
        page.setPageSize(collectForm.getSize());
        page = collectService.getCollectPage(page, collectForm);
        Integer collectListCount = collectService.getCollectCount(collectForm);
        if (page == null) {
            page = new Page<Collect>();
        } else {
            List<Collect> result = page.getResult();
            for (Collect collect : result) {
                User user = userService.getUser(collect.getUserId());
                SchoolRank schoolRank = schoolRankService.getSchoolRank(collect.getSchoolId());
                CollectModel collectModel = new CollectModel();
                collectModel.setSchoolName(schoolRank.getSchoolName());
                collectModel.setSchoolContent(schoolRank.getSchoolContent());
                collectModel.setSchoolTel(schoolRank.getSchoolTel());
                collectModel.setSchoolWebUrl(schoolRank.getSchoolWebUrl());
                BeanUtils.copyProperties(collectModel, collect);
                collect.setUsername(user.getName());
                collect.setAffiliation(schoolRank.getAffiliation());
                collect.setGrade(schoolRank.getGrade());
                collect.setSchoolRank(schoolRank.getSchoolRank());
                collect.setCityName(schoolRank.getCityName());
            }
        }
        PageModel<Collect> pageModel = new PageModel<Collect>();
        pageModel.setPage(page);
        pageModel.setPageTotal(collectListCount);
        return CommonResult.success(pageModel);
    }

    @PostMapping(value = "/updateSchoolCollect")
    public CommonResult updateSchoolCollect(String id) {
        collectService.updateCollect(id);
        return CommonResult.success(true);
    }

    @PostMapping(value = "/addSchoolCollect")
    public CommonResult addSchoolCollect(String schoolId,String userId) {
        collectService.addCollect(schoolId,userId);
        return CommonResult.success(true);
    }

    @GetMapping(value = "/getSchoolCollect")
    public CommonResult getSchoolCollect(String id) {
        Collect collect = collectService.getCollect(id);
        return CommonResult.success(collect);
    }

    @GetMapping(value = "/getSchoolCollectList")
    public CommonResult getSchoolCollectList(String userId) {
        List<Collect> collectList = collectService.getCollectList(userId);
        Map<String, Object> map = new HashMap<>();
        if(CollectionUtil.isNotEmpty(collectList)){
            for (Collect collect : collectList) {
                String formDate = DateUtil.format(collect.getGmtCreate(), "yyyy-MM-dd");
                collect.setFormDate(formDate);
            }
            collectList = collectList.stream()
                    .sorted(Comparator.comparing(Collect::getGmtCreate)).collect(Collectors.toList());
            Map<String, List<Collect>> listMap = collectList.stream()
                    .collect(Collectors.groupingBy(Collect::getFormDate,LinkedHashMap::new,Collectors.toList()));
            List<String> keys = new ArrayList<>();
            List<Integer> values = new ArrayList<>();
            for (String formDate : listMap.keySet()) {
                List<Collect> collects = listMap.get(formDate);
                keys.add(formDate);
                values.add(CollectionUtil.isNotEmpty(collects) ? collects.size() : 0);
            }
            map.put("keys",keys);
            map.put("values",values);
        }
        return CommonResult.success(map);
    }
}
