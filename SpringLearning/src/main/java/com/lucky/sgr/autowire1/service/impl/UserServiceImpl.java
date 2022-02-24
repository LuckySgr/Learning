package com.lucky.sgr.autowire1.service.impl;

import com.lucky.sgr.autowire1.dao.UserDao;
import com.lucky.sgr.autowire1.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author：LuckySgr.
 * @date: 2022/2/24
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void out() {
        userDao.print();
        System.out.println("good good study, day day up!!!");
    }
}
