/**
 * @Author: LinK
 * @Date: 2019/1/16 16:19
 * v1 版本
 */

package com.qhl.design.creation.singleton.hungry;

import java.io.Serializable;

public class HungrySingleton implements Serializable{
    private static final HungrySingleton hungrySingleton;

    private HungrySingleton() {

        /**
         * 防止反射攻击
         */
        if (hungrySingleton!=null){
            throw new RuntimeException("单利模式禁止反射构造");
        }
    }

    static {
        hungrySingleton = new HungrySingleton();
    }
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    private Object readResolve(){
        return hungrySingleton;
    }
}
