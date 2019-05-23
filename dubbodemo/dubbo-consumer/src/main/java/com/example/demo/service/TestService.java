package com.example.demo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.domain.User;
import org.springframework.stereotype.Component;

/**
 * Created by wangshuai on 2019/5/23.
 */
@Component
public class TestService {
    @Reference
    UserService userService;

    public User save(User user){
        return userService.saveUser(user);
    }
}
