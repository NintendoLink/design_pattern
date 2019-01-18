/**
 * @Author: LinK
 * @Date: 2019/1/17 10:45
 */

package com.qhl.design.structure.proxy.staticproxy;

import com.qhl.design.structure.proxy.Order;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();

        orderServiceStaticProxy.saveOrder(order);
    }
}
