package com.bingbing.paper.controller;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.StrUtil;
import com.bingbing.paper.Vo.SchoolScoreVo;
import com.bingbing.paper.common.CommonResult;
import com.bingbing.paper.model.PageModel;
import com.bingbing.paper.mybatis.entity.SchoolRank;
import com.bingbing.paper.mybatis.entity.SchoolScore;
import com.bingbing.paper.mybatis.entity.User;
import com.bingbing.paper.service.SchoolRankService;
import com.bingbing.paper.service.SchoolScoreService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/schoolScore")
public class SchoolScoreController {

    @Autowired
    private SchoolScoreService schoolScoreService;

    @Autowired
    private SchoolRankService schoolRankService;

    @GetMapping(value = "/list")
    public CommonResult list(SchoolScoreVo schoolScoreVo, int current, int size) {
        Page<SchoolScore> page = new Page<SchoolScore>();
        page.setPageNum(current);
        page.setPageSize(size);
        page = schoolScoreService.getSchoolScorePage(page, schoolScoreVo);
        Integer schoolScoreCount = schoolScoreService.getSchoolScoreCount(schoolScoreVo);
        if(page == null){
            page = new Page<SchoolScore>();
        }
        PageModel<SchoolScore> pageModel = new PageModel<SchoolScore>();
        pageModel.setPage(page);
        pageModel.setPageTotal(schoolScoreCount);
        return CommonResult.success(pageModel);
    }

    @PostMapping(value = "/updateSchoolScore")
    public CommonResult updateSchoolScore(@RequestBody SchoolScore schoolScore){
        schoolScoreService.updateSchoolScore(schoolScore);
        return CommonResult.success(true);
    }

    @PostMapping(value = "/addSchoolScore")
    public CommonResult addSchoolScore(@RequestBody SchoolScore schoolScore){
        Boolean aBoolean = schoolScoreService.addSchoolScore(schoolScore);
        if(!aBoolean){
            return CommonResult.success("院校该学年已存在");
        } else {
            return CommonResult.success("新增院校信息成功");
        }
    }

    @GetMapping(value = "/schoolYearList")
    public CommonResult<Map<String,Object>> schoolYearList() {
        List<SchoolScore> schoolYearList = schoolScoreService.getSchoolYearList(null);
        Map<String,Object> map = new HashMap<>();
        if(CollectionUtil.isNotEmpty(schoolYearList)){
            Set<String> getSchoolYear = schoolYearList.stream()
                    .filter(e -> StrUtil.isNotBlank(e.getSchoolYear()))
                    .map(e -> e.getSchoolYear()).collect(Collectors.toSet());
            List<SchoolRank> schoolRankList = schoolRankService.getSchoolRankList(null);
            if(CollectionUtil.isNotEmpty(schoolRankList)){
                map.put("schoolRankList",schoolRankList);
            }
            ArrayList<String> strings = new ArrayList<>(getSchoolYear);
            Collections.sort(strings); // 升序排列
            map.put("getSchoolYear",strings);
        }
        return CommonResult.success(map);
    }

    @GetMapping(value = "/getSchoolScore/{id}")
    public CommonResult getSchoolScore(@PathVariable("id")String id) {
        SchoolScore schoolScore = schoolScoreService.getSchoolScore(id);
        return CommonResult.success(schoolScore);
    }

}
