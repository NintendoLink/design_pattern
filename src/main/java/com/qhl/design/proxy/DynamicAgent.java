package com.qhl.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicAgent implements InvocationHandler {

    private Sell sell;

    public DynamicAgent(Sell sell) {
        this.sell = sell;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before method Call");

        Object result = method.invoke(sell,args);

        System.out.println("after method Call");

        return result;
    }
}
