/**
 * @Author: LinK
 * @Date: 2019/1/17 14:44
 */

package com.qhl.design.structure.proxy.dynamicproxy;

import com.qhl.design.structure.proxy.Order;
import com.qhl.design.structure.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceDynamicProxy implements InvocationHandler {


    private Object target;

    public OrderServiceDynamicProxy(Object object) {
        this.target = object;
    }

    public Object bind(){
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = args[0];
        beforeMethod(obj);
        Object object = method.invoke(target,args);
        afterMethod();
        return object;
    }

    private void beforeMethod(Object obj){
        int userId = 0;
        System.out.println("动态代理 Before code");
        if (obj instanceof Order){
            Order order = (Order) obj;
            userId = order.getUserId();
            int dbRouter = userId % 2;
            System.out.println("静态代理分配到【"+dbRouter+"】数据库");
            DataSourceContextHolder.setDBType(String.valueOf(dbRouter));
        }
        //todo

    }

    private void afterMethod(){
        System.out.println("动态代理After code");
    }
}
