/**
 * @Author: LinK
 * @Date: 2019/1/23 10:42
 */

package com.qhl.design.structure.decorator;

public class BatterCake implements IBattercake {
    @Override
    public String getDesc() {
        return "battercake";
    }

    @Override
    public int getCost() {
        return 8;
    }
}
