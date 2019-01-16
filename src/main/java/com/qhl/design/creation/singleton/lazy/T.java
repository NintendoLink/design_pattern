/**
 * @Author: LinK
 * @Date: 2019/1/16 15:08
 */

package com.qhl.design.creation.singleton.lazy;

public class T implements Runnable {
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+ "  " + lazySingleton);
    }
}
