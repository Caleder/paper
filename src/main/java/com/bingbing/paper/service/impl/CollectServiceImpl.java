package com.bingbing.paper.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.StrUtil;
import com.bingbing.paper.form.CollectForm;
import com.bingbing.paper.mybatis.entity.*;
import com.bingbing.paper.mybatis.mapper.CollectMapper;
import com.bingbing.paper.mybatis.mapper.SchoolRankMapper;
import com.bingbing.paper.mybatis.mapper.SchoolScoreMapper;
import com.bingbing.paper.mybatis.mapper.UserMapper;
import com.bingbing.paper.service.CollectService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class CollectServiceImpl implements CollectService {

    @Autowired
    private CollectMapper collectMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private SchoolRankMapper schoolRankMapper;
    @Autowired
    private SchoolScoreMapper schoolScoreMapper;
    @Autowired(required = false)
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    public Page<Collect> getCollectPage(Page<Collect> page, CollectForm collectForm) {
        User user = (User)redisTemplate.opsForValue().get("USERALL");
        CollectExample example = new CollectExample();
        CollectExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(user.getId()).andEnabledEqualTo(true);
        if(collectForm != null){
            SchoolRankExample schoolRankExample = new SchoolRankExample();
            SchoolRankExample.Criteria schoolRankExampleCriteria = schoolRankExample.createCriteria();
            schoolRankExampleCriteria.andEnabledEqualTo(true);
            if(StrUtil.isNotBlank(collectForm.getSchoolName())){
                schoolRankExampleCriteria.andSchoolNameLike(collectForm.getSchoolName());
            }
            if(StrUtil.isNotBlank(collectForm.getSchoolTel())){
                schoolRankExampleCriteria.andSchoolTelLike(collectForm.getSchoolTel());
            }
            if(StrUtil.isNotBlank(collectForm.getSchoolWebUrl())){
                schoolRankExampleCriteria.andSchoolWebUrlLike(collectForm.getSchoolWebUrl());
            }
            List<SchoolRank> schoolRankList = schoolRankMapper.selectByExample(schoolRankExample);
            List<String> list = schoolRankList.stream().map(e -> e.getId()).collect(Collectors.toList());
            if(CollectionUtil.isEmpty(list)){
                return null;
            }
            criteria.andSchoolIdIn(list);
        }
        PageHelper.startPage(page.getPageNum(),page.getPageSize());
        List<Collect> collects = collectMapper.selectByExample(example);
        if(CollectionUtil.isNotEmpty(collects)){
            return (Page<Collect>)collects;
        }
        return null;
    }

    @Override
    public int getCollectCount(CollectForm collectForm) {
        User user = (User)redisTemplate.opsForValue().get("USERALL");
        CollectExample example = new CollectExample();
        CollectExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(user.getId()).andEnabledEqualTo(true);
        if(collectForm != null){
            SchoolRankExample schoolRankExample = new SchoolRankExample();
            SchoolRankExample.Criteria schoolRankExampleCriteria = schoolRankExample.createCriteria();
            schoolRankExampleCriteria.andEnabledEqualTo(true);
            if(StrUtil.isNotBlank(collectForm.getSchoolName())){
                schoolRankExampleCriteria.andSchoolNameLike(collectForm.getSchoolName());
            }
            if(StrUtil.isNotBlank(collectForm.getSchoolTel())){
                schoolRankExampleCriteria.andSchoolTelLike(collectForm.getSchoolTel());
            }
            if(StrUtil.isNotBlank(collectForm.getSchoolWebUrl())){
                schoolRankExampleCriteria.andSchoolWebUrlLike(collectForm.getSchoolWebUrl());
            }
            List<SchoolRank> schoolRankList = schoolRankMapper.selectByExample(schoolRankExample);
            List<String> list = schoolRankList.stream().map(e -> e.getId()).collect(Collectors.toList());
            if(CollectionUtil.isEmpty(list)){
                return 0;
            }
            criteria.andSchoolIdIn(list);
        }
        return collectMapper.countByExample(example);
    }

    @Override
    public void updateCollect(String id) {
        if(StrUtil.isBlank(id)){
            return;
        }
        Collect collect = new Collect();
        collect.setId(id);
        collect.setEnabled(false);
        collectMapper.updateByPrimaryKeySelective(collect);
    }

    @Override
    public void addCollect(String schoolId) {
        User user = (User)redisTemplate.opsForValue().get("USERALL");
        if(StrUtil.isBlank(schoolId)){
            return;
        }
        Collect collect = new Collect();
        collect.setId(UUID.randomUUID().toString());
        collect.setEnabled(true);
        collect.setGmtCreate(new Date());
        collect.setUserId(user.getId());
        collect.setSchoolId(schoolId);
        collectMapper.insert(collect);
    }

    @Override
    public Collect getCollect(String id) {
        if(StrUtil.isBlank(id)){
            return null;
        }
        return collectMapper.selectByPrimaryKey(id);
    }

    @Override
    public Collect getCollectBySchoolId(String schoolId) {
        if(StrUtil.isBlank(schoolId)){
            return null;
        }
        CollectExample example = new CollectExample();
        example.createCriteria().andEnabledEqualTo(true)
                .andSchoolIdEqualTo(schoolId);
        List<Collect> collects = collectMapper.selectByExample(example);
        if(CollectionUtil.isNotEmpty(collects)){
            return collects.get(0);
        }
        return null;
    }
}
