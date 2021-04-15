package com.bingbing.paper.service;

import com.bingbing.paper.Vo.SchoolScoreVo;
import com.bingbing.paper.mybatis.entity.SchoolScore;
import com.github.pagehelper.Page;

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

}
