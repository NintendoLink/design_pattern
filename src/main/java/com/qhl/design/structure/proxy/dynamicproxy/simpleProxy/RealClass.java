/**
 * @Author: LinK
 * @Date: 2019/1/18 10:38
 */

package com.qhl.design.structure.proxy.dynamicproxy.simpleProxy;

public class RealClass implements Subject {
    @Override
    public void doSomething() {
        System.out.println("Real Class do something");
    }

    @Override
    public void doSomething2() {
        System.out.println("Real Class do something2");

    }
}
