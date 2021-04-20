package com.bingbing.paper.service;

import com.bingbing.paper.mybatis.entity.User;
import com.github.pagehelper.Page;

import java.util.List;

public interface UserService {

    public User getUserByUsername(String username);

    /**
     * 注册功能
     */
    public User register(User userParam);

    /**
     * 登录功能
     *
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    public String login(String username, String password);

    /**
     * 查询所有用户信息
     * @param username
     * @param enabled
     * @return
     */
    public Page<User> getUserList(Page<User> userPage,String name, String username, Boolean enabled,String mobile,String motto);

    /**
     * 查询所有用户信息个数
     * @param username
     * @param enabled
     * @return
     */
    public Integer getUserListCount(String name, String username, Boolean enabled,String mobile,String motto);

    /**
     * 修改用户信息
     * @param user
     */
    public void updateUser(User user);

    public User getUser(String id);

}
