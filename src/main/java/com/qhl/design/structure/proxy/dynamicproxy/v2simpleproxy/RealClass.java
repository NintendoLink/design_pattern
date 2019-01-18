/**
 * @Author: LinK
 * @Date: 2019/1/18 10:51
 */

package com.qhl.design.structure.proxy.dynamicproxy.v2simpleproxy;

public class RealClass implements Subject {
    @Override
    public void dosomething() {
        System.out.println("Real Class Do Something");
    }
}
