/**
 * @Author: LinK
 * @Date: 2019/1/18 10:55
 */

package com.qhl.design.structure.proxy.dynamicproxy.v2simpleproxy;

public class Test {
    public static void main(String[] args) {
        Subject realClass = (Subject) new ProxyClass(new RealClass()).bind();
        realClass.dosomething();
    }
}
