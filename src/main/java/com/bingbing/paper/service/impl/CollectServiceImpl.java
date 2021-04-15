package com.bingbing.paper.service.impl;

import com.bingbing.paper.form.CollectForm;
import com.bingbing.paper.mybatis.entity.Collect;
import com.bingbing.paper.service.CollectService;
import com.github.pagehelper.Page;
import org.springframework.stereotype.Service;

@Service
public class CollectServiceImpl implements CollectService {
    @Override
    public Page<Collect> getCollectPage(Page<Collect> page, CollectForm collectForm) {
        return null;
    }

    @Override
    public int getCollectCount(CollectForm collectForm) {
        return 0;
    }
}
