package com.lucky.sgr.xmlTx.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author：LuckySgr.
 * @date: 2022/2/28
 */
@Data
public class Account {
    //自增 id
    private Long id;
    //用户 id
    private String userId;
    //账户总金额
    private BigDecimal total;
    //已用账户金额
    private BigDecimal used;
    //剩余账户金额
    private BigDecimal residue;
}
