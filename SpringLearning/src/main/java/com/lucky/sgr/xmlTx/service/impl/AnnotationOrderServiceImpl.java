package com.lucky.sgr.xmlTx.service.impl;

import com.lucky.sgr.xmlTx.dao.AccountDao;
import com.lucky.sgr.xmlTx.dao.OrderDao;
import com.lucky.sgr.xmlTx.dao.StorageDao;
import com.lucky.sgr.xmlTx.entity.Account;
import com.lucky.sgr.xmlTx.entity.Order;
import com.lucky.sgr.xmlTx.entity.Storage;
import com.lucky.sgr.xmlTx.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author：LuckySgr.
 * @date: 2022/2/28
 */
@Service("annotationOrderService")
public class AnnotationOrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private StorageDao storageDao;

    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, timeout = 10, readOnly = false)
    @Override
    public void createOrder(Order order) {
        //自动生成订单 id
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String format = df.format(new Date());
        String orderId = order.getUserId() + order.getProductId() + format;
        System.out.println("自动生成的订单 id 为：" + orderId);
        order.setOrderId(orderId);
        System.out.println("开始创建订单数据，订单号为：" + orderId);
        //创建订单数据
        orderDao.createOrder(order);
        System.out.println("订单数据创建完成，订单号为：" + orderId);
        System.out.println("开始查询商品库存，商品 id 为：" + order.getProductId());
        Storage storage = storageDao.selectByProductId(order.getProductId());
        if (storage != null && storage.getResidue() >= order.getCount()) {
            System.out.println("商品库存充足，正在扣减商品库存");
            storage.setUsed(storage.getUsed() + order.getCount());
            storage.setResidue(storage.getTotal() - storage.getUsed());
            int decrease = storageDao.decrease(storage);
            System.out.println("商品库存扣减完成");
        } else {
            System.out.println("警告：商品库存不足，正在执行回滚操作！");
            throw new RuntimeException("库存不足");
        }
        System.out.println("开始查询用户的账户金额");
        Account account = accountDao.selectByUserId(order.getUserId());
        if (account != null && account.getResidue().intValue() >= order.getMoney().intValue()) {
            System.out.println("账户金额充足，正在扣减账户金额");
            accountDao.decrease(order.getUserId(), order.getMoney());
            System.out.println("账户金额扣减完成");
        } else {
            System.out.println("警告：账户余额不足，正在执行回滚操作！");
            throw new RuntimeException("账户余额不足");
        }
        System.out.println("开始修改订单状态，未完成>>>>>>>>>>>>>>已完成");
        orderDao.updateOrderStatus(order.getOrderId(), 0);
        System.out.println("修改订单状态完成！");
    }
}
