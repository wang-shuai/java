package com.example.demo.service;


/**
 * Created by wangshuai on 2019/5/23.
 */

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.domain.User;

@Service
public class UserServiceImpl implements UserService{

    @Override
    public User saveUser(User user) {
        user.setId(1);
//        user.setName("shine");
        System.out.println("saveUser:" + user.toString());
        return user;
    }
}
