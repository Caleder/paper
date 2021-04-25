package com.bingbing.paper.controller;

import com.bingbing.paper.common.CommonResult;
import com.bingbing.paper.model.PageModel;
import com.bingbing.paper.mybatis.entity.SchoolBegin;
import com.bingbing.paper.mybatis.entity.SchoolRank;
import com.bingbing.paper.service.SchoolBeginService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/schoolBegin")
public class SchoolBeginController {

    @Autowired
    private SchoolBeginService schoolBeginService;

    @GetMapping(value = "/list")
    public CommonResult list(SchoolBegin schoolBegin, int current, int size) {
        Page<SchoolBegin> page = new Page<SchoolBegin>();
        page.setPageNum(current);
        page.setPageSize(size);
        page = schoolBeginService.getSchoolBeginPage(page, schoolBegin);
        if (page == null) {
            page = new Page<SchoolBegin>();
        }
        Integer schoolBeginCount = schoolBeginService.getSchoolBeginCount(schoolBegin);
        PageModel<SchoolBegin> pageModel = new PageModel<SchoolBegin>();
        pageModel.setPage(page);
        pageModel.setPageTotal(schoolBeginCount);
        return CommonResult.success(pageModel);
    }

    @PostMapping(value = "/addSchoolBegin")
    public CommonResult addSchoolBegin(@RequestBody SchoolBegin schoolBegin) {
        Boolean aBoolean = schoolBeginService.addSchoolBegin(schoolBegin);
        if (!aBoolean) {
            return CommonResult.success("院校该学年初试信息已存在");
        } else {
            return CommonResult.success("新增院校初试信息成功");
        }
    }

    @PostMapping(value = "/updateSchoolBegin")
    public CommonResult updateSchoolBegin(@RequestBody SchoolBegin schoolBegin) {
        schoolBeginService.updateSchoolBegin(schoolBegin);
        return CommonResult.success(true);
    }

    @GetMapping(value = "/getSchoolBegin/{id}")
    public CommonResult getSchoolBegin(@PathVariable("id") String id) {
        SchoolBegin schoolBegin = schoolBeginService.getSchoolBegin(id);
        return CommonResult.success(schoolBegin);
    }

}
