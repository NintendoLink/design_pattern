/**
 * @Author: LinK
 * @Date: 2019/1/16 15:26
 */

package com.qhl.design.creation.singleton.lazy;

/**
 * 通过volatile与DoubleCheck机制，即兼顾了性能，有保证了数据的安全性
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton(){

    }

    public  static LazyDoubleCheckSingleton getInstance(){

        /**
         * 双重检查
         *
         */
        if (lazyDoubleCheckSingleton ==null){
            synchronized (LazyDoubleCheckSingleton.class){
                /**
                 * 第二次if判断：
                 */
                if (lazyDoubleCheckSingleton == null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    /**
                     * lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton() 的坑
                     * 在进行new的过程中，有三个步骤
                     * 1.分配内存
                     * 2.初始化对象
                     * 3.将lazyDoubleCheckSingleton指向所分配的内存
                     * 4.访问对象
                     * 其中2 和 3的顺序可能会被重排序，可能会导致系统报异常，解决方法，使用vilatile使得对象的生成不允许重排序
                     */
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
