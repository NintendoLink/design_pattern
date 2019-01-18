/**
 * @Author: LinK
 * @Date: 2019/1/18 10:39
 */

package com.qhl.design.structure.proxy.dynamicproxy.simpleProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyClass implements InvocationHandler {

    private Subject proxyed;

    public ProxyClass(Subject proxyed) {
        this.proxyed = proxyed;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(proxyed,args);
    }
}
