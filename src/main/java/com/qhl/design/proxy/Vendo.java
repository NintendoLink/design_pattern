package com.qhl.design.proxy;

public class Vendo implements Sell{
    public void sell() {
        System.out.println("in sell method");
    }

    public void ad() {
        System.out.println("in ad method");
    }
}
