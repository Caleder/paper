package com.bingbing.paper.controller;

import com.bingbing.paper.common.CommonResult;
import com.bingbing.paper.model.PageModel;
import com.bingbing.paper.mybatis.entity.SchoolBegin;
import com.bingbing.paper.mybatis.entity.SchoolRepeat;
import com.bingbing.paper.service.SchoolRepeatService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/schoolRepeat")
public class SchoolRepeatController {

    @Autowired
    private SchoolRepeatService schoolRepeatService;

    @GetMapping(value = "/list")
    public CommonResult list(SchoolRepeat schoolRepeat, int current, int size) {
        Page<SchoolRepeat> page = new Page<SchoolRepeat>();
        page.setPageNum(current);
        page.setPageSize(size);
        page = schoolRepeatService.getSchoolRepeatPage(page, schoolRepeat);
        if(page == null){
            page = new Page<SchoolRepeat>();
        }
        Integer schoolRepeatCount = schoolRepeatService.getSchoolRepeatCount(schoolRepeat);
        PageModel<SchoolRepeat> pageModel = new PageModel<SchoolRepeat>();
        pageModel.setPage(page);
        pageModel.setPageTotal(schoolRepeatCount);
        return CommonResult.success(pageModel);
    }

    @PostMapping(value = "/addSchoolRepeat")
    public CommonResult addSchoolRepeat(@RequestBody SchoolRepeat schoolRepeat) {
        Boolean aBoolean = schoolRepeatService.addSchoolRepeat(schoolRepeat);
        if (!aBoolean) {
            return CommonResult.success("院校该学年复试信息已存在");
        } else {
            return CommonResult.success("新增院校复试信息成功");
        }
    }

    @PostMapping(value = "/updateSchoolRepeat")
    public CommonResult updateSchoolRepeat(@RequestBody SchoolRepeat schoolRepeat) {
        schoolRepeatService.updateSchoolRepeat(schoolRepeat);
        return CommonResult.success(true);
    }

    @GetMapping(value = "/getSchoolRepeat/{id}")
    public CommonResult getSchoolRepeat(@PathVariable("id") String id) {
        SchoolRepeat schoolRepeat = schoolRepeatService.getSchoolRepeat(id);
        return CommonResult.success(schoolRepeat);
    }

}
