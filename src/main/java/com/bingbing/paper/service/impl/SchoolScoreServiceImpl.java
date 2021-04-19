package com.bingbing.paper.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.StrUtil;
import com.bingbing.paper.Vo.SchoolScoreVo;
import com.bingbing.paper.mybatis.entity.SchoolRank;
import com.bingbing.paper.mybatis.entity.SchoolRankExample;
import com.bingbing.paper.mybatis.entity.SchoolScore;
import com.bingbing.paper.mybatis.entity.SchoolScoreExample;
import com.bingbing.paper.mybatis.mapper.SchoolRankMapper;
import com.bingbing.paper.mybatis.mapper.SchoolScoreMapper;
import com.bingbing.paper.service.SchoolScoreService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class SchoolScoreServiceImpl implements SchoolScoreService {

    @Autowired
    private SchoolScoreMapper schoolScoreMapper;
    @Autowired
    private SchoolRankMapper schoolRankMapper;

    @Override
    public Page<SchoolScore> getSchoolScorePage(Page<SchoolScore> page, SchoolScoreVo schoolScoreVo) {
        SchoolScoreExample example = new SchoolScoreExample();
        if (schoolScoreVo != null) {
            SchoolScoreExample.Criteria criteria = example.createCriteria();
            //通过学年查询
            if (StrUtil.isNotBlank(schoolScoreVo.getSchoolYear())) {
                criteria.andSchoolYearEqualTo(schoolScoreVo.getSchoolYear());
            }
            //通过复试线查询
            if (StrUtil.isNotBlank(schoolScoreVo.getSchoolScore())) {
                criteria.andBeginRepeatEqualTo(false)
                        .andSchoolScoreEqualTo(schoolScoreVo.getSchoolScore());
            }
            //通过院校名称查询
            if (StrUtil.isNotBlank(schoolScoreVo.getSchoolName())) {
                SchoolRankExample rankExample = new SchoolRankExample();
                rankExample.createCriteria()
                        /*.andEnabledEqualTo(true)*/
                        .andSchoolNameLike(schoolScoreVo.getSchoolName());
                List<SchoolRank> schoolRanks = schoolRankMapper.selectByExample(rankExample);
                if (CollectionUtil.isEmpty(schoolRanks)) {
                    return null;
                }
                List<String> list = schoolRanks.stream().map(e -> e.getId()).collect(Collectors.toList());
                criteria.andSchoolIdIn(list);
            }
            //通过报录比查询
            if (StrUtil.isNotBlank(schoolScoreVo.getSchoolApplyAdmit())) {
                criteria.andSchoolApplyAdmitEqualTo(schoolScoreVo.getSchoolApplyAdmit());
            }
            //通过院校初复试资料查询
            if (schoolScoreVo.getBeginRepeat() != null) {
                if (schoolScoreVo.getBeginRepeat()) {
                    //初试
                    criteria.andBeginRepeatEqualTo(true);
                } else {
                    //复试
                    criteria.andBeginRepeatEqualTo(false);
                }
            }
            if (StrUtil.isNotBlank(schoolScoreVo.getSchoolFile())) {
                criteria.andSchoolFileLike(schoolScoreVo.getSchoolFile());
            }
        }
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<SchoolScore> schoolScores = schoolScoreMapper.selectByExample(example);
        if (CollectionUtil.isNotEmpty(schoolScores)) {
            for (SchoolScore schoolScore : schoolScores) {
                String schoolId = schoolScore.getSchoolId();
                SchoolRank schoolRank = schoolRankMapper.selectByPrimaryKey(schoolId);
                schoolScore.setSchoolName(schoolRank.getSchoolName());
            }
            return (Page<SchoolScore>) schoolScores;
        }
        return null;
    }

    @Override
    public Integer getSchoolScoreCount(SchoolScoreVo schoolScoreVo) {
        SchoolScoreExample example = new SchoolScoreExample();
        if (schoolScoreVo != null) {
            SchoolScoreExample.Criteria criteria = example.createCriteria();
            //通过学年查询
            if (StrUtil.isNotBlank(schoolScoreVo.getSchoolYear())) {
                criteria.andSchoolYearEqualTo(schoolScoreVo.getSchoolYear());
            }
            //通过复试线查询
            if (StrUtil.isNotBlank(schoolScoreVo.getSchoolScore())) {
                criteria.andBeginRepeatEqualTo(false)
                        .andSchoolScoreEqualTo(schoolScoreVo.getSchoolScore());
            }
            //通过院校名称查询
            if (StrUtil.isNotBlank(schoolScoreVo.getSchoolName())) {
                SchoolRankExample rankExample = new SchoolRankExample();
                rankExample.createCriteria()
                        .andEnabledEqualTo(true)
                        .andSchoolNameLike(schoolScoreVo.getSchoolName());
                List<SchoolRank> schoolRanks = schoolRankMapper.selectByExample(rankExample);
                if (CollectionUtil.isNotEmpty(schoolRanks)) {
                    List<String> list = schoolRanks.stream().map(e -> e.getId()).collect(Collectors.toList());
                    criteria.andSchoolIdIn(list);
                }
            }
            //通过报录比查询
            if (StrUtil.isNotBlank(schoolScoreVo.getSchoolApplyAdmit())) {
                criteria.andSchoolApplyAdmitEqualTo(schoolScoreVo.getSchoolApplyAdmit());
            }
            //通过院校初复试资料查询
            if (schoolScoreVo.getBeginRepeat() != null) {
                if (schoolScoreVo.getBeginRepeat()) {
                    //初试
                    criteria.andBeginRepeatEqualTo(true);
                } else {
                    //复试
                    criteria.andBeginRepeatEqualTo(false);
                }
            }
            if (StrUtil.isNotBlank(schoolScoreVo.getSchoolFile())) {
                criteria.andSchoolFileLike(schoolScoreVo.getSchoolFile());
            }
        }
        int countByExample = schoolScoreMapper.countByExample(example);
        return countByExample;
    }

    @Override
    public void updateSchoolScore(SchoolScore schoolScore) {
        if(schoolScore == null){
            return;
        }
        schoolScoreMapper.updateByPrimaryKeySelective(schoolScore);
    }

    @Override
    public Boolean addSchoolScore(SchoolScore schoolScore) {
        if(schoolScore == null){
            return false;
        }
        if(StrUtil.isBlank(schoolScore.getSchoolYear())){
            return false;
        }
        SchoolScoreExample example = new SchoolScoreExample();
        SchoolScoreExample.Criteria criteria = example.createCriteria();
        criteria.andEnabledEqualTo(true).andSchoolYearEqualTo(schoolScore.getSchoolYear())
                .andSchoolIdEqualTo(schoolScore.getSchoolId());
        List<SchoolScore> schoolScores = schoolScoreMapper.selectByExample(example);
        if(CollectionUtil.isNotEmpty(schoolScores)){
            return false;
        }
        schoolScore.setGmtCreate(new Date());
        schoolScore.setEnabled(true);
        schoolScore.setId(UUID.randomUUID().toString());
        schoolScoreMapper.insert(schoolScore);
        return true;
    }

    @Override
    public List<SchoolScore> getSchoolYearList(Set<String> idList) {
        SchoolScoreExample example = new SchoolScoreExample();
        SchoolScoreExample.Criteria criteria = example.createCriteria();
        /*criteria.andEnabledEqualTo(true);*/
        if(CollectionUtil.isNotEmpty(idList)){
            criteria.andSchoolIdIn(new ArrayList<String>(idList));
        }
        List<SchoolScore> schoolScores = schoolScoreMapper.selectByExample(example);
        if(CollectionUtil.isNotEmpty(schoolScores)){
            return schoolScores;
        }
        return null;
    }

    @Override
    public SchoolScore getSchoolScore(String id) {
        SchoolScore schoolScore = schoolScoreMapper.selectByPrimaryKey(id);
        SchoolRank schoolRank = schoolRankMapper.selectByPrimaryKey(schoolScore.getSchoolId());
        schoolScore.setSchoolName(schoolRank.getSchoolName());
        return schoolScore;
    }
}
