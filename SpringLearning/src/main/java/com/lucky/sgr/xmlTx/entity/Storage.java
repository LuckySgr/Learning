package com.lucky.sgr.xmlTx.entity;

import lombok.Data;

/**
 * @author：LuckySgr.
 * @date: 2022/2/28
 */
@Data
public class Storage {
    //自增 id
    private Long id;
    //商品 id
    private String productId;
    //商品库存总数
    private Integer total;
    //已用商品数量
    private Integer used;
    //剩余商品数量
    private Integer residue;
}
