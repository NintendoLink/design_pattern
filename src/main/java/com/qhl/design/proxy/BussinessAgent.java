package com.qhl.design.proxy;

/**
 * 静态代理
 */
public class BussinessAgent implements Sell {

    private Sell sell;

    public BussinessAgent(Sell sell) {
        this.sell = sell;
    }

    public void sell() {
        this.sell.sell();
    }

    public void ad() {
        this.sell.ad();
    }
}
