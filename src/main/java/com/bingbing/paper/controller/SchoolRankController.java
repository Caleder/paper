package com.bingbing.paper.controller;

import cn.hutool.core.collection.CollectionUtil;
import com.bingbing.paper.Vo.SchoolRankVo;
import com.bingbing.paper.common.CommonResult;
import com.bingbing.paper.model.PageModel;
import com.bingbing.paper.mybatis.entity.Collect;
import com.bingbing.paper.mybatis.entity.SchoolRank;
import com.bingbing.paper.mybatis.entity.SchoolScore;
import com.bingbing.paper.mybatis.entity.User;
import com.bingbing.paper.service.CollectService;
import com.bingbing.paper.service.SchoolRankService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/schoolRank")
public class SchoolRankController {

    @Autowired
    private SchoolRankService schoolRankService;
    @Autowired
    private CollectService collectService;
    @Autowired(required = false)
    private RedisTemplate<String, Object> redisTemplate;

    @GetMapping(value = "/list")
    public CommonResult list(SchoolRankVo schoolRankVo, int current, int size) {
        Page<SchoolRank> page = new Page<SchoolRank>();
        page.setPageNum(current);
        page.setPageSize(size);
        page = schoolRankService.getSchoolRankPage(page, schoolRankVo);
        Integer schoolRankCount = schoolRankService.getSchoolRankCount(schoolRankVo);
        PageInfo<SchoolRank> pageInfo = new PageInfo<SchoolRank>();
        if (page == null) {
            pageInfo = new PageInfo<SchoolRank>();
        } else {
            List<SchoolRank> result = page.getResult();
            BeanUtils.copyProperties(page,pageInfo);
            List<SchoolRank> resultVo = new ArrayList<>();
            List<Collect> collectList = collectService.getCollectList(schoolRankVo.getUserId());
            List<String> getSchoolIdList = new ArrayList<>();
            if(CollectionUtil.isNotEmpty(collectList)) {
                getSchoolIdList = collectList.stream().map(e -> e.getSchoolId()).collect(Collectors.toList());
            }
            for (SchoolRank schoolRank : result) {
                if (getSchoolIdList.contains(schoolRank.getId())) {
                    schoolRank.setCollected(true);
                } else {
                    schoolRank.setCollected(false);
                }
                resultVo.add(schoolRank);
            }
            pageInfo.setList(resultVo);
        }
        PageModel<SchoolRank> pageModel = new PageModel<SchoolRank>();
        pageModel.setPageInfo(pageInfo);
        pageModel.setPageTotal(schoolRankCount);
        return CommonResult.success(pageModel);
    }

    @PostMapping(value = "/updateSchoolRank")
    public CommonResult updateSchoolRank(@RequestBody SchoolRank schoolRank) {
        schoolRankService.updateSchoolRank(schoolRank);
        return CommonResult.success(true);
    }

    @PostMapping(value = "/addSchoolRank")
    public CommonResult addSchoolRank(@RequestBody SchoolRank schoolRank) {
        Boolean aBoolean = schoolRankService.addSchoolRank(schoolRank);
        if (!aBoolean) {
            return CommonResult.success("该院校已存在");
        } else {
            return CommonResult.success("新增院校信息成功");
        }
    }

    @GetMapping(value = "/getSchoolRank/{id}")
    public CommonResult getSchoolRank(@PathVariable("id") String id) {
        SchoolRank schoolRank = schoolRankService.getSchoolRank(id);
        return CommonResult.success(schoolRank);
    }

}
