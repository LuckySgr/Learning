package com.lucky.sgr.xmlTx.dao;

import com.lucky.sgr.xmlTx.entity.Account;

import java.math.BigDecimal;

/**
 * @author：LuckySgr.
 * @date: 2022/2/28
 */
public interface AccountDao {
    /**
     * 根据用户查询账户金额
     */
    Account selectByUserId(String userId);

    /**
     * 扣减账户金额
     */
    int decrease(String userId, BigDecimal money);
}
