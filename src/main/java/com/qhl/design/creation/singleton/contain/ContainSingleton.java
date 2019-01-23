/**
 * @Author: LinK
 * @Date: 2019/1/22 11:19
 */

package com.qhl.design.creation.singleton.contain;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 容器单利
 * 因为ContainSingleton是单利的，所以map也是单利
 */
public class ContainSingleton {

    private static Map<String,Object> map = new HashMap<String, Object>();

    private ContainSingleton() {
    }

    public void putInstance(String object,Object instance){
        if (instance!=null && StringUtils.isNotBlank(object)){
            if (!map.containsKey(object)){
                map.put(object,instance);
            }
        }
    }

    public Object getInstance(String obj){
        return map.get(obj);
    }
}
