package com.bingbing.paper.service;

import com.bingbing.paper.mybatis.entity.SchoolRepeat;
import com.github.pagehelper.Page;

public interface SchoolRepeatService {

    public Page<SchoolRepeat> getSchoolRepeatPage(Page<SchoolRepeat> page, SchoolRepeat schoolRepeat);

    public Integer getSchoolRepeatCount(SchoolRepeat schoolRepeat);

    public void updateSchoolRepeat(SchoolRepeat schoolRepeat);

    public SchoolRepeat getSchoolRepeat(String id);

    Boolean addSchoolRepeat(SchoolRepeat schoolRepeat);

}
