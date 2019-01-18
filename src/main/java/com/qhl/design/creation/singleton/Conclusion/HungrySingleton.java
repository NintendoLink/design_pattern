/**
 * @Author: LinK
 * @Date: 2019/1/18 14:44
 */

package com.qhl.design.creation.singleton.Conclusion;

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
