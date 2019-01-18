/**
 * @Author: LinK
 * @Date: 2019/1/17 10:14
 */

package com.qhl.design.structure.proxy;

public class OrderDaoImpl implements OrderDao{
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }
}
