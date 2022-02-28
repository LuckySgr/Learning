package com.lucky.sgr.xmlTx.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author：LuckySgr.
 * @date: 2022/2/28
 */
@Data
public class Order {
    //自增 id
    private Long id;
    //订单 id
    private String orderId;
    //用户 id
    private String userId;
    //商品 id
    private String productId;
    //订单商品数量
    private Integer count;
    //订单金额
    private BigDecimal money;
    //订单状态
    private Integer status;
}
