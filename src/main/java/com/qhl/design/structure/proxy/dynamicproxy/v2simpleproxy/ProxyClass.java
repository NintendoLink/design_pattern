/**
 * @Author: LinK
 * @Date: 2019/1/18 10:52
 */

package com.qhl.design.structure.proxy.dynamicproxy.v2simpleproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyClass implements InvocationHandler{
    private Object subject;

    public ProxyClass(Object subject) {
        this.subject = subject;
    }

    public Object bind(){
        Class cls= subject.getClass();

        return Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(subject,args);
    }
}
