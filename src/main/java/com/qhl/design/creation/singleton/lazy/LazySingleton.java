/**
 * @Author: LinK
 * @Date: 2019/1/16 14:49
 * v1 版本 synchronized锁静态方法飞翔消耗资源，所以采用第二种方法
 * 懒汉式与饿汉式的区别：是否在类加载的时候就初始化，还是在调用的时候初始化
 */

package com.qhl.design.creation.singleton.lazy;

public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton(){

    }

    public synchronized static LazySingleton getInstance(){
        if (lazySingleton ==null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
