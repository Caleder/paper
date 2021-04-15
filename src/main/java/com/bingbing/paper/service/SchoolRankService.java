package com.bingbing.paper.service;

import com.bingbing.paper.Vo.SchoolRankVo;
import com.bingbing.paper.mybatis.entity.SchoolRank;
import com.github.pagehelper.Page;

public interface SchoolRankService {

    public Page<SchoolRank> getSchoolRankPage(Page<SchoolRank> page, SchoolRankVo schoolRankVo);

    public Integer getSchoolRankCount(SchoolRankVo schoolRankVo);

    /**
     * 通过电话号码查询院校信息
     *
     * @param tel
     * @return
     */
    public SchoolRank getSchoolRankByTel(String tel);

    /**
     * 通过研究生院网查询院校信息
     *
     * @param webUrl
     * @return
     */
    public SchoolRank getSchoolRankByWebUrl(String webUrl);

    /**
     * 修改学院信息
     * @param schoolRank
     */
    public void updateSchoolRank(SchoolRank schoolRank);

    /**
     * 通过id查询院校信息
     * @param id
     */
    public SchoolRank getSchoolRank(String id);
}
