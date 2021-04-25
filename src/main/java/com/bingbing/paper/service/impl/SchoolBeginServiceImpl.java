package com.bingbing.paper.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.StrUtil;
import com.bingbing.paper.mybatis.entity.SchoolBegin;
import com.bingbing.paper.mybatis.entity.SchoolBeginExample;
import com.bingbing.paper.mybatis.mapper.SchoolBeginMapper;
import com.bingbing.paper.service.SchoolBeginService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class SchoolBeginServiceImpl implements SchoolBeginService {

    @Autowired
    private SchoolBeginMapper schoolBeginMapper;

    @Override
    public Page<SchoolBegin> getSchoolBeginPage(Page<SchoolBegin> page, SchoolBegin schoolBegin) {
        SchoolBeginExample example = new SchoolBeginExample();
        SchoolBeginExample.Criteria criteria = example.createCriteria();
        criteria.andEnabledEqualTo(true);
        if(schoolBegin != null){
            if(StrUtil.isNotBlank(schoolBegin.getSchoolName())){
                criteria.andSchoolNameLike("%"+schoolBegin.getSchoolName()+"%");
            }
            if(StrUtil.isNotBlank(schoolBegin.getSchoolYear())){
                criteria.andSchoolYearEqualTo(schoolBegin.getSchoolYear());
            }
            if(StrUtil.isNotBlank(schoolBegin.getDeptName())){
                criteria.andDeptNameLike("%"+schoolBegin.getDeptName()+"%");
            }
            if(StrUtil.isNotBlank(schoolBegin.getMajorName())){
                criteria.andMajorNameLike("%"+schoolBegin.getMajorName()+"%");
            }
        }
        PageHelper.startPage(page.getPageNum(),page.getPageSize());
        List<SchoolBegin> schoolBegins = schoolBeginMapper.selectByExample(example);
        return (Page<SchoolBegin>)schoolBegins;
    }

    @Override
    public Integer getSchoolBeginCount(SchoolBegin schoolBegin) {
        SchoolBeginExample example = new SchoolBeginExample();
        SchoolBeginExample.Criteria criteria = example.createCriteria();
        criteria.andEnabledEqualTo(true);
        if(schoolBegin != null){
            if(StrUtil.isNotBlank(schoolBegin.getSchoolName())){
                criteria.andSchoolNameLike("%"+schoolBegin.getSchoolName()+"%");
            }
            if(StrUtil.isNotBlank(schoolBegin.getSchoolYear())){
                criteria.andSchoolYearEqualTo(schoolBegin.getSchoolYear());
            }
            if(StrUtil.isNotBlank(schoolBegin.getDeptName())){
                criteria.andDeptNameLike("%"+schoolBegin.getDeptName()+"%");
            }
            if(StrUtil.isNotBlank(schoolBegin.getMajorName())){
                criteria.andMajorNameLike("%"+schoolBegin.getMajorName()+"%");
            }
        }
        return schoolBeginMapper.countByExample(example);
    }

    @Override
    public void updateSchoolBegin(SchoolBegin schoolBegin) {
        if(schoolBegin == null){
            return;
        }
        schoolBeginMapper.updateByPrimaryKeySelective(schoolBegin);
    }

    @Override
    public SchoolBegin getSchoolBegin(String id) {
        if (StrUtil.isBlank(id)) {
            return null;
        }
        SchoolBegin schoolBegin = schoolBeginMapper.selectByPrimaryKey(id);
        return schoolBegin;
    }

    @Override
    public Boolean addSchoolBegin(SchoolBegin schoolBegin) {
        SchoolBeginExample example = new SchoolBeginExample();
        SchoolBeginExample.Criteria criteria = example.createCriteria();
        if(StrUtil.isBlank(schoolBegin.getSchoolName())
                || StrUtil.isBlank(schoolBegin.getSchoolYear())){
            return false;
        }
        criteria.andSchoolNameEqualTo(schoolBegin.getSchoolName())
                .andSchoolYearEqualTo(schoolBegin.getSchoolYear());
        List<SchoolBegin> schoolBegins = schoolBeginMapper.selectByExample(example);
        if(CollectionUtil.isNotEmpty(schoolBegins)){
            return false;
        }
        schoolBegin.setId(UUID.randomUUID().toString());
        schoolBegin.setEnabled(true);
        schoolBegin.setGmtCreate(new Date());
        schoolBeginMapper.insert(schoolBegin);
        return true;
    }
}
