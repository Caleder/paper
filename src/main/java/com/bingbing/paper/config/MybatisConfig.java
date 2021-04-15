package com.bingbing.paper.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 */
@Configuration
@MapperScan("com.bingbing.paper.mybatis.mapper")
public class MybatisConfig {

}