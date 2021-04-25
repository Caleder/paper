package com.bingbing.paper.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.StrUtil;
import com.bingbing.paper.mybatis.entity.SchoolBegin;
import com.bingbing.paper.mybatis.entity.SchoolBeginExample;
import com.bingbing.paper.mybatis.entity.SchoolRepeat;
import com.bingbing.paper.mybatis.entity.SchoolRepeatExample;
import com.bingbing.paper.mybatis.mapper.SchoolRepeatMapper;
import com.bingbing.paper.service.SchoolRepeatService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class SchoolRepeatServiceImpl implements SchoolRepeatService {

    @Autowired
    private SchoolRepeatMapper schoolRepeatMapper;

    @Override
    public Page<SchoolRepeat> getSchoolRepeatPage(Page<SchoolRepeat> page, SchoolRepeat schoolRepeat) {
        SchoolRepeatExample example = new SchoolRepeatExample();
        SchoolRepeatExample.Criteria criteria = example.createCriteria();
        criteria.andEnabledEqualTo(true);
        if(schoolRepeat != null){
            if(StrUtil.isNotBlank(schoolRepeat.getSchoolName())){
                criteria.andSchoolNameLike("%"+schoolRepeat.getSchoolName()+"%");
            }
            if(StrUtil.isNotBlank(schoolRepeat.getSchoolYear())){
                criteria.andSchoolYearEqualTo(schoolRepeat.getSchoolYear());
            }
            if(StrUtil.isNotBlank(schoolRepeat.getDeptName())){
                criteria.andDeptNameLike("%"+schoolRepeat.getDeptName()+"%");
            }
            if(StrUtil.isNotBlank(schoolRepeat.getMajorName())){
                criteria.andMajorNameLike("%"+schoolRepeat.getMajorName()+"%");
            }
        }
        PageHelper.startPage(page.getPageNum(),page.getPageSize());
        List<SchoolRepeat> schoolRepeats = schoolRepeatMapper.selectByExample(example);
        return (Page<SchoolRepeat>)schoolRepeats;
    }

    @Override
    public Integer getSchoolRepeatCount(SchoolRepeat schoolRepeat) {
        SchoolRepeatExample example = new SchoolRepeatExample();
        SchoolRepeatExample.Criteria criteria = example.createCriteria();
        criteria.andEnabledEqualTo(true);
        if(schoolRepeat != null){
            if(StrUtil.isNotBlank(schoolRepeat.getSchoolName())){
                criteria.andSchoolNameLike("%"+schoolRepeat.getSchoolName()+"%");
            }
            if(StrUtil.isNotBlank(schoolRepeat.getSchoolYear())){
                criteria.andSchoolYearEqualTo(schoolRepeat.getSchoolYear());
            }
            if(StrUtil.isNotBlank(schoolRepeat.getDeptName())){
                criteria.andDeptNameLike("%"+schoolRepeat.getDeptName()+"%");
            }
            if(StrUtil.isNotBlank(schoolRepeat.getMajorName())){
                criteria.andMajorNameLike("%"+schoolRepeat.getMajorName()+"%");
            }
        }
        return schoolRepeatMapper.countByExample(example);
    }

    @Override
    public void updateSchoolRepeat(SchoolRepeat schoolRepeat) {
        if(schoolRepeat == null){
            return;
        }
        schoolRepeatMapper.updateByPrimaryKeySelective(schoolRepeat);
    }

    @Override
    public SchoolRepeat getSchoolRepeat(String id) {
        if (StrUtil.isBlank(id)) {
            return null;
        }
        SchoolRepeat schoolRepeat = schoolRepeatMapper.selectByPrimaryKey(id);
        return schoolRepeat;
    }

    @Override
    public Boolean addSchoolRepeat(SchoolRepeat schoolRepeat) {
        SchoolRepeatExample example = new SchoolRepeatExample();
        SchoolRepeatExample.Criteria criteria = example.createCriteria();
        if(StrUtil.isBlank(schoolRepeat.getSchoolName())
                || StrUtil.isBlank(schoolRepeat.getSchoolYear())){
            return false;
        }
        criteria.andSchoolNameEqualTo(schoolRepeat.getSchoolName())
                .andSchoolYearEqualTo(schoolRepeat.getSchoolYear());
        List<SchoolRepeat> schoolRepeats = schoolRepeatMapper.selectByExample(example);
        if(CollectionUtil.isNotEmpty(schoolRepeats)){
            return false;
        }
        schoolRepeat.setId(UUID.randomUUID().toString());
        schoolRepeat.setEnabled(true);
        schoolRepeat.setGmtCreate(new Date());
        schoolRepeatMapper.insert(schoolRepeat);
        return true;
    }
}
