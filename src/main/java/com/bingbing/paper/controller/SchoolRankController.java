package com.bingbing.paper.controller;

import com.bingbing.paper.Vo.SchoolRankVo;
import com.bingbing.paper.common.CommonResult;
import com.bingbing.paper.model.PageModel;
import com.bingbing.paper.mybatis.entity.Collect;
import com.bingbing.paper.mybatis.entity.SchoolRank;
import com.bingbing.paper.mybatis.entity.SchoolScore;
import com.bingbing.paper.service.CollectService;
import com.bingbing.paper.service.SchoolRankService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schoolRank")
public class SchoolRankController {

    @Autowired
    private SchoolRankService schoolRankService;
    @Autowired
    private CollectService collectService;

    @GetMapping(value = "/list")
    public CommonResult list(SchoolRankVo schoolRankVo, int current, int size) {
        Page<SchoolRank> page = new Page<SchoolRank>();
        page.setPageNum(current);
        page.setPageSize(size);
        page = schoolRankService.getSchoolRankPage(page, schoolRankVo);
        Integer schoolRankCount = schoolRankService.getSchoolRankCount(schoolRankVo);
        if(page == null){
            page = new Page<SchoolRank>();
        } else {
            List<SchoolRank> result = page.getResult();
            for (SchoolRank schoolRank : result) {
                Collect collect = collectService.getCollectBySchoolId(schoolRank.getId());
                if(collect == null){
                    schoolRank.setCollected(false);
                } else {
                    schoolRank.setCollected(true);
                }
            }
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

    @PostMapping(value = "/addSchoolRank")
    public CommonResult addSchoolRank(@RequestBody SchoolRank schoolRank){
        Boolean aBoolean = schoolRankService.addSchoolRank(schoolRank);
        if(!aBoolean){
            return CommonResult.success("该院校已存在");
        } else {
            return CommonResult.success("新增院校信息成功");
        }
    }

    @GetMapping(value = "/getSchoolRank/{id}")
    public CommonResult getSchoolRank(@PathVariable("id") String id){
        SchoolRank schoolRank = schoolRankService.getSchoolRank(id);
        return CommonResult.success(schoolRank);
    }

}
