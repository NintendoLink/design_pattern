/**
 * @Author: LinK
 * @Date: 2019/1/22 14:26
 */

package com.qhl.design.study.threadlocal;

public class Test {
    public static void main(String[] args) {
        Thread t1= new Thread(new T());
        Thread t2= new Thread(new T());


        t1.start();
        t2.start();

    }
}
