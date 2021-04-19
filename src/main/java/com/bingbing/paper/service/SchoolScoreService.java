package com.bingbing.paper.service;

import com.bingbing.paper.Vo.SchoolScoreVo;
import com.bingbing.paper.mybatis.entity.SchoolScore;
import com.github.pagehelper.Page;

import java.util.List;
import java.util.Set;

public interface SchoolScoreService {

    /**
     * 学院复试线列表
     * @param page
     * @param schoolScoreVo
     * @return
     */
    public Page<SchoolScore> getSchoolScorePage(Page<SchoolScore> page, SchoolScoreVo schoolScoreVo);

    /**
     * 学院复试线列表总个数
     * @param schoolScoreVo
     * @return
     */
    public Integer getSchoolScoreCount(SchoolScoreVo schoolScoreVo);

    /**
     * 修改学院复试线
     * @param schoolScore
     * @return
     */
    public void updateSchoolScore(SchoolScore schoolScore);

    /**
     * 添加学院复试线
     * @param schoolScore
     * @return Boolean
     */
    public Boolean addSchoolScore(SchoolScore schoolScore);

    /**
     * 查询所有学年
     * @return
     */
    public List<SchoolScore> getSchoolYearList(Set<String> idList);

    /**
     * 查询所有学年
     * @return
     */
    public SchoolScore getSchoolScore(String id);
}
