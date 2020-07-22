package com.zb.service.impl;

import com.zb.entity.User;
import com.zb.mapper.UserMapper;
import com.zb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 * @create 2020-07-22 16:30
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public Boolean register(String username, String password) {
        Map<String,Object>map=new HashMap<String,Object>();
        map.put("username",username);
        map.put("password",password);
        final Integer result = userMapper.register(map);
        if (result==1){
            return true;
        }
        return false;
    }

    @Override
    public User login(String username, String password) {
        Map<String,Object>map=new HashMap<String,Object>();
        map.put("username",username);
        map.put("password",password);
        User user = userMapper.login(map);
        return user;
    }
}
