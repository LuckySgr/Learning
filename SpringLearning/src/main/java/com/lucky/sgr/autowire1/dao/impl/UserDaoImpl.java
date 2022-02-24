package com.lucky.sgr.autowire1.dao.impl;

import com.lucky.sgr.autowire1.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author：LuckySgr.
 * @date: 2022/2/24
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void print() {
        System.out.println("Spring Bean 自动装配的学习");
    }
}
