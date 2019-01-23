/**
 * @Author: LinK
 * @Date: 2019/1/22 14:26
 */

package com.qhl.design.study.threadlocal;

public class T implements Runnable {
    @Override
    public void run() {
        for(int i= 0;i<10;i++){
            System.out.println(i);
        }
    }
}
