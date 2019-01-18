/**
 * @Author: LinK
 * @Date: 2019/1/18 15:34
 * 使用静态内部类来实现延时加载线程安全的单利模式
 */


package com.qhl.design.creation.singleton.lazy;

public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
        if (StaticInnerClass.staticInnerClassSingleton!= null){
            throw new RuntimeException("禁止反射调用单利");
        }
    }

    private static class StaticInnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return StaticInnerClass.staticInnerClassSingleton;
    }


}
