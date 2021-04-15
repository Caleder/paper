package com.bingbing.paper;

import cn.hutool.core.lang.UUID;
import com.bingbing.paper.mybatis.entity.User;
import com.bingbing.paper.mybatis.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;

@SpringBootTest
class PaperApplicationTests {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setUsername("wzy");
        String password = passwordEncoder.encode("123456");
        user.setPassword(password);
        user.setGmtCreate(new Date());
        user.setEnabled(true);
        userMapper.insert(user);
    }

}
