package com.bingbing.paper.controller;

import com.bingbing.paper.Vo.SchoolRankVo;
import com.bingbing.paper.common.CommonResult;
import com.bingbing.paper.model.PageModel;
import com.bingbing.paper.mybatis.entity.SchoolRank;
import com.bingbing.paper.mybatis.entity.SchoolScore;
import com.bingbing.paper.service.SchoolRankService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/schoolRank")
public class SchoolRankController {

    @Autowired
    private SchoolRankService schoolRankService;

    @GetMapping(value = "/list")
    public CommonResult list(SchoolRankVo schoolRankVo, int current, int size) {
        Page<SchoolRank> page = new Page<SchoolRank>();
        page.setPageNum(current);
        page.setPageSize(size);
        page = schoolRankService.getSchoolRankPage(page, schoolRankVo);
        Integer schoolRankCount = schoolRankService.getSchoolRankCount(schoolRankVo);
        if(page == null){
            page = new Page<SchoolRank>();
        }
        PageModel<SchoolRank> pageModel = new PageModel<SchoolRank>();
        pageModel.setPage(page);
        pageModel.setPageTotal(schoolRankCount);
        return CommonResult.success(pageModel);
    }

    @PostMapping(value = "/updateSchoolRank")
    public CommonResult updateSchoolRank(@RequestBody SchoolRank schoolRank){
        schoolRankService.updateSchoolRank(schoolRank);
        return CommonResult.success(true);
    }

    @GetMapping(value = "/getSchoolRank/{id}")
    public CommonResult getSchoolRank(@PathVariable("id") String id){
        SchoolRank schoolRank = schoolRankService.getSchoolRank(id);
        return CommonResult.success(schoolRank);
    }

}
