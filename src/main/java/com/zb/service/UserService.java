package com.zb.service;

import com.zb.entity.User;

import java.util.Map;

/**
 * @author Administrator
 * @create 2020-07-22 16:30
 */
public interface UserService {
    /*用户注册*/
    Boolean register(String username,String password);

    /*用户登陆*/
    User login(String username,String password);
}
