/**
 * @Author: LinK
 * @Date: 2019/1/16 15:01
 */

package com.qhl.design.creation.singleton.lazy;

public class Test {
    public static void main(String[] args) {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        System.out.println(lazySingleton);
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("program end");

    }
}
