package com.lucky.sgr.autowire1.controller;

import com.lucky.sgr.autowire1.service.UserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @author：LuckySgr.
 * @date: 2022/2/24
 */
@Controller("userController")
public class UserController {
    @Resource
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void doStr() {
        userService.out();
        System.out.println("ComeOn ComeOn ComeOn!!!");
    }
}
