/**
 * @Author: LinK
 * @Date: 2019/1/16 16:12
 */

/**
 * v2版本，使用静态内部类实现单利模式，也能保证安全和性能
 */
package com.qhl.design.creation.singleton.lazy;

public class StaticInnerSingleton {

    private StaticInnerSingleton(){

    }
    private static class InnerClass{
        private static StaticInnerSingleton staticInnerSingleton = new StaticInnerSingleton();
    }
    public static StaticInnerSingleton getInstance(){
        return InnerClass.staticInnerSingleton;
    }
}
