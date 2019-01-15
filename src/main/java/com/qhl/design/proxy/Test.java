package com.qhl.design.proxy;

import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {
        DynamicAgent dynamicAgent = new DynamicAgent(new Vendo());

        Sell sell = (Sell) Proxy.newProxyInstance(Sell.class.getClassLoader(),new Class[]{Sell.class},dynamicAgent);

        sell.ad();
    }
}
