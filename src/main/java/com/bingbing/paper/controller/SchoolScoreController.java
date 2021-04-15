package com.bingbing.paper.controller;

import com.bingbing.paper.Vo.SchoolScoreVo;
import com.bingbing.paper.common.CommonResult;
import com.bingbing.paper.model.PageModel;
import com.bingbing.paper.mybatis.entity.SchoolRank;
import com.bingbing.paper.mybatis.entity.SchoolScore;
import com.bingbing.paper.mybatis.entity.User;
import com.bingbing.paper.service.SchoolScoreService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/schoolScore")
public class SchoolScoreController {

    @Autowired
    private SchoolScoreService schoolScoreService;

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


}
