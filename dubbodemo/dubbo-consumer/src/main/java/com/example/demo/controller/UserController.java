package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangshuai on 2019/5/23.
 */
@RestController
public class UserController {

    @Autowired
    private TestService testService;

    @GetMapping("/save")
    public Object saveUser(){

        return testService.save(new User());
    }
}
