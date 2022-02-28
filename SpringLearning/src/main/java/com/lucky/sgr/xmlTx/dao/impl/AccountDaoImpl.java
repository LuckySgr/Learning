package com.lucky.sgr.xmlTx.dao.impl;

import com.lucky.sgr.xmlTx.dao.AccountDao;
import com.lucky.sgr.xmlTx.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * @author：LuckySgr.
 * @date: 2022/2/28
 */
@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Account selectByUserId(String userId) {
        String sql = "select * from tx_test.account where user_id = ?";
        Account account = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Account.class), userId);
        return account;
    }

    @Override
    public int decrease(String userId, BigDecimal money) {
        String sql = "update tx_test.account SET residue = residue - ?, used = used + ? WHERE user_id = ?";
        int update = jdbcTemplate.update(sql, money, money, userId);
        return update;
    }
}
