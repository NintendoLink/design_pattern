/**
 * @Author: LinK
 * @Date: 2019/1/18 14:43
 */

package com.qhl.design.creation.singleton.Conclusion;

public class LazySingleton {
    private static LazySingleton lazySingleton;

    private LazySingleton() {
    }

    public static LazySingleton getInstance(){
        if (lazySingleton == null){
            return new LazySingleton();
        }
        return lazySingleton;
    }
}
