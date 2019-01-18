/**
 * @Author: LinK
 * @Date: 2019/1/18 10:40
 */

package com.qhl.design.structure.proxy.dynamicproxy.simpleProxy;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        RealClass realClass = new RealClass();
        Subject proxySubject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(),new Class[]{Subject.class},new ProxyClass(realClass));

        proxySubject.doSomething();
        proxySubject.doSomething2();
    }
}
