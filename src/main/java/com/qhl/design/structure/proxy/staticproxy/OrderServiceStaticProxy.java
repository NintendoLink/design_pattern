/**
 * @Author: LinK
 * @Date: 2019/1/17 10:37
 */

package com.qhl.design.structure.proxy.staticproxy;

import com.qhl.design.structure.proxy.IOrderService;
import com.qhl.design.structure.proxy.Order;
import com.qhl.design.structure.proxy.OrderServiceImpl;
import com.qhl.design.structure.proxy.db.DataSourceContextHolder;

public class OrderServiceStaticProxy {
    private IOrderService iOrderService;

    public int saveOrder(Order order){

        beforeMethod();

        iOrderService = new OrderServiceImpl();

        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【"+dbRouter+"】数据库");

        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));

        afterMethod();
        return 0;
    }


    private void beforeMethod(){
        System.out.println("静态代理 Before Method");
    }


    private void afterMethod(){
        System.out.println("静态代理 After Method");
    }
}
