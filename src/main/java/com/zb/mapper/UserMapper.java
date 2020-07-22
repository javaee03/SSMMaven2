package com.zb.mapper;

import com.zb.entity.User;

import java.util.Map;

/**
 * @author Administrator
 * @create 2020-07-22 16:15
 */
public interface UserMapper {
    /*用户注册*/
    Integer register(Map<String,Object>map);

    /*用户登陆*/
    User login(Map<String,Object>map);
}
