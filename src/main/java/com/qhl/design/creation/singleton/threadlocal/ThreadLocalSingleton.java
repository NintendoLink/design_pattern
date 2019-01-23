/**
 * @Author: LinK
 * @Date: 2019/1/22 14:17
 * 基于ThreadLocal的线程之间独立的单利模式 只是在线程之间单利，但是在两个不同的线程，有不同的副本
 */

package com.qhl.design.creation.singleton.threadlocal;

public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalSingleton =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    private ThreadLocalSingleton() {
    }

    public static ThreadLocalSingleton getIntance(){
        return threadLocalSingleton.get();
    }
}
