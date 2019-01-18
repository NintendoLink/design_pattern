/**
 * @Author: LinK
 * @Date: 2019/1/17 15:56
 */

package com.qhl.design.structure.proxy.dynamicproxy;

import com.qhl.design.structure.proxy.IOrderService;
import com.qhl.design.structure.proxy.Order;
import com.qhl.design.structure.proxy.OrderServiceImpl;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        IOrderService iOrderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();

        iOrderServiceDynamicProxy.saveOrder(order);
    }
}
