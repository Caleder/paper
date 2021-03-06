package com.bingbing.paper.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.StrUtil;
import com.bingbing.paper.Vo.SchoolRankVo;
import com.bingbing.paper.mybatis.entity.SchoolRank;
import com.bingbing.paper.mybatis.entity.SchoolRankExample;
import com.bingbing.paper.mybatis.mapper.SchoolRankMapper;
import com.bingbing.paper.service.SchoolRankService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SchoolRankServiceImpl implements SchoolRankService {

    @Autowired
    private SchoolRankMapper schoolRankMapper;

    @Override
    public Page<SchoolRank> getSchoolRankPage(Page<SchoolRank> page, SchoolRankVo schoolRankVo) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        SchoolRankExample example = new SchoolRankExample();
        if (schoolRankVo != null) {
            SchoolRankExample.Criteria criteria = example.createCriteria();
            /*criteria.andEnabledEqualTo(true);*/
            //通过院校所在地查询
            if (StrUtil.isNotBlank(schoolRankVo.getCityName())) {
                criteria.andCityNameLike(schoolRankVo.getCityName());
            }
            //通过院校名称查询
            if (StrUtil.isNotBlank(schoolRankVo.getSchoolName())) {
                criteria.andSchoolNameLike(schoolRankVo.getSchoolName());
            }
            //通过院校联系方式查询
            if (StrUtil.isNotBlank(schoolRankVo.getSchoolTel())) {
                criteria.andSchoolTelEqualTo(schoolRankVo.getSchoolTel());
            }
            //通过院校研究生院网查询
            if (StrUtil.isNotBlank(schoolRankVo.getSchoolWebUrl())) {
                criteria.andSchoolWebUrlEqualTo(schoolRankVo.getSchoolWebUrl());
            }
            //通过院校排名查询
            if (schoolRankVo.getSchoolRank() != null) {
                criteria.andSchoolRankEqualTo(schoolRankVo.getSchoolRank());
            }
            //通过院校隶属查询
            if (schoolRankVo.getAffiliation() != null) {
                criteria.andAffiliationLike(schoolRankVo.getAffiliation());
            }
            //通过院校等级查询
            if (schoolRankVo.getGrade() != null) {
                criteria.andGradeLike(schoolRankVo.getGrade());
            }
        }
        example.setOrderByClause("school_rank");
        List<SchoolRank> schoolRanks = schoolRankMapper.selectByExample(example);
        if (CollectionUtil.isNotEmpty(schoolRanks)) {
            return (Page<SchoolRank>) schoolRanks;
        }
        return null;
    }

    @Override
    public Integer getSchoolRankCount(SchoolRankVo schoolRankVo) {
        SchoolRankExample example = new SchoolRankExample();
        if (schoolRankVo != null) {
            SchoolRankExample.Criteria criteria = example.createCriteria();
            /*criteria.andEnabledEqualTo(true);*/
            //通过院校所在地查询
            if (StrUtil.isNotBlank(schoolRankVo.getCityName())) {
                criteria.andCityNameLike(schoolRankVo.getCityName());
            }
            //通过院校名称查询
            if (StrUtil.isNotBlank(schoolRankVo.getSchoolName())) {
                criteria.andSchoolNameLike(schoolRankVo.getSchoolName());
            }
            //通过院校联系方式查询
            if (StrUtil.isNotBlank(schoolRankVo.getSchoolTel())) {
                criteria.andSchoolTelEqualTo(schoolRankVo.getSchoolTel());
            }
            //通过院校研究生院网查询
            if (StrUtil.isNotBlank(schoolRankVo.getSchoolWebUrl())) {
                criteria.andSchoolWebUrlEqualTo(schoolRankVo.getSchoolWebUrl());
            }
            //通过院校排名查询
            if (schoolRankVo.getSchoolRank() != null) {
                criteria.andSchoolRankEqualTo(schoolRankVo.getSchoolRank());
            }
            //通过院校隶属查询
            if (schoolRankVo.getAffiliation() != null) {
                criteria.andAffiliationLike(schoolRankVo.getAffiliation());
            }
            //通过院校等级查询
            if (schoolRankVo.getGrade() != null) {
                criteria.andGradeLike(schoolRankVo.getGrade());
            }
        }
        example.setOrderByClause("school_rank");
        int countByExample = schoolRankMapper.countByExample(example);
        return countByExample;
    }

    @Override
    public SchoolRank getSchoolRankByTel(String tel) {
        return null;
    }

    @Override
    public SchoolRank getSchoolRankByWebUrl(String webUrl) {
        return null;
    }

    @Override
    public void updateSchoolRank(SchoolRank schoolRank) {
        if (schoolRank == null) {
            return;
        }
        schoolRankMapper.updateByPrimaryKeySelective(schoolRank);
    }

    @Override
    public SchoolRank getSchoolRank(String id) {
        if (StrUtil.isBlank(id)) {
            return null;
        }
        SchoolRank schoolRank = schoolRankMapper.selectByPrimaryKey(id);
        return schoolRank;
    }

    @Override
    public Boolean addSchoolRank(SchoolRank schoolRank) {
        if (schoolRank == null) {
            return false;
        }
        if (StrUtil.isBlank(schoolRank.getSchoolName())
                || StrUtil.isBlank(schoolRank.getSchoolTel())
                || StrUtil.isBlank(schoolRank.getSchoolWebUrl())
                || schoolRank.getSchoolRank() == null
                || StrUtil.isBlank(schoolRank.getCityName())
                || StrUtil.isBlank(schoolRank.getAffiliation())
                || StrUtil.isBlank(schoolRank.getGrade())) {
            return false;
        }
        SchoolRankExample example = new SchoolRankExample();
        example.createCriteria().andEnabledEqualTo(true)
                .andCityNameLike(schoolRank.getCityName())
                .andSchoolNameEqualTo(schoolRank.getSchoolName());
        List<SchoolRank> schoolRankList = schoolRankMapper.selectByExample(example);
        if(CollectionUtil.isNotEmpty(schoolRankList)){
            return false;
        }
        schoolRank.setEnabled(true);
        schoolRank.setGmtCreate(new Date());
        schoolRank.setId(UUID.randomUUID().toString());
        schoolRankMapper.insert(schoolRank);
        return true;
    }

    @Override
    public List<SchoolRank> getSchoolRankList(Set<String> idList) {
        SchoolRankExample example = new SchoolRankExample();
        SchoolRankExample.Criteria criteria = example.createCriteria();
        criteria.andEnabledEqualTo(true);
        if(CollectionUtil.isNotEmpty(idList)){
            criteria.andIdIn(new ArrayList<String>(idList));
        }
        List<SchoolRank> schoolRankList = schoolRankMapper.selectByExample(example);
        return schoolRankList;
    }
}
