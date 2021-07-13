package com.zf.test.service;

import com.zf.test.entity.Order;

import java.util.Map;

/**
 * ClassName:OrderService
 * Description:
 *
 * @author : YC01336
 * @since : 2021/7/13 15:53
 */
public interface OrderService {
    //创建订单
    Order create();
    //发起支付
    Order pay(int id);
    //订单发货
    Order deliver(int id);
    //订单收货
    Order receive(int id);
    //获取所有订单信息
    Map<Integer, Order> getOrders();
}
