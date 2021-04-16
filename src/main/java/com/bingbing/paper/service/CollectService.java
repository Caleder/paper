package com.bingbing.paper.service;

import com.bingbing.paper.form.CollectForm;
import com.bingbing.paper.mybatis.entity.Collect;
import com.github.pagehelper.Page;

public interface CollectService {

    Page<Collect> getCollectPage(Page<Collect> page, CollectForm collectForm);

    int getCollectCount(CollectForm collectForm);

    void updateCollect(String id);

    void addCollect(String schoolId);

    Collect getCollect(String id);

    Collect getCollectBySchoolId(String schoolId);

}
