package com.bingbing.paper.service;

import com.bingbing.paper.mybatis.entity.SchoolBegin;
import com.github.pagehelper.Page;

public interface SchoolBeginService {

    public Page<SchoolBegin> getSchoolBeginPage(Page<SchoolBegin> page, SchoolBegin schoolBegin);

    public Integer getSchoolBeginCount(SchoolBegin schoolBegin);

    public void updateSchoolBegin(SchoolBegin schoolBegin);

    public SchoolBegin getSchoolBegin(String id);

    Boolean addSchoolBegin(SchoolBegin schoolBegin);

}
