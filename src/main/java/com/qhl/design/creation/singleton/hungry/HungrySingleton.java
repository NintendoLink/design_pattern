/**
 * @Author: LinK
 * @Date: 2019/1/16 16:19
 * v1 版本
 */

package com.qhl.design.creation.singleton.hungry;

public class HungrySingleton {
    private static final HungrySingleton hungrySingleton;

    private HungrySingleton() {
    }

    static {
        hungrySingleton = new HungrySingleton();
    }
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
