package com.bingbing.paper.controller;

import com.bingbing.paper.common.CommonResult;
import com.bingbing.paper.form.CollectForm;
import com.bingbing.paper.model.CollectModel;
import com.bingbing.paper.model.PageModel;
import com.bingbing.paper.mybatis.entity.Collect;
import com.bingbing.paper.mybatis.entity.SchoolRank;
import com.bingbing.paper.service.CollectService;
import com.bingbing.paper.service.SchoolRankService;
import com.github.pagehelper.Page;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schoolCollect")
public class SchoolCollectController {

    @Autowired
    private CollectService collectService;
    @Autowired
    private SchoolRankService schoolRankService;

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
                SchoolRank schoolRank = schoolRankService.getSchoolRank(collect.getSchoolId());
                CollectModel collectModel = new CollectModel();
                collectModel.setSchoolName(schoolRank.getSchoolName());
                collectModel.setSchoolContent(schoolRank.getSchoolContent());
                collectModel.setSchoolRank(schoolRank.getSchoolRank());
                collectModel.setSchoolTel(schoolRank.getSchoolTel());
                collectModel.setSchoolWebUrl(schoolRank.getSchoolWebUrl());
                BeanUtils.copyProperties(collectModel, collect);
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
    public CommonResult addSchoolCollect(String schoolId) {
        collectService.addCollect(schoolId);
        return CommonResult.success(true);
    }

    @GetMapping(value = "/getSchoolCollect")
    public CommonResult getSchoolCollect(String id) {
        Collect collect = collectService.getCollect(id);
        return CommonResult.success(collect);
    }

}
