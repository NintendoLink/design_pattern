/**
 * @Author: LinK
 * @Date: 2019/1/17 10:16
 */

package com.qhl.design.structure.proxy;

public class OrderServiceImpl implements IOrderService {


    private OrderDao orderDao;

    public int saveOrder(Order order) {

        orderDao = new OrderDaoImpl();
        System.out.println("Service通过调用Dao保存订单成功");

        return orderDao.insert(order);
    }
}
