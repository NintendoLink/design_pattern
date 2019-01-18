/**
 * @Author: LinK
 * @Date: 2019/1/17 10:13
 */

package com.qhl.design.structure.proxy;

public class Order {
    private Object orderInfo;
    private Integer userId;


    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
