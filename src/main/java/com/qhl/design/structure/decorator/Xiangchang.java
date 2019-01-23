/**
 * @Author: LinK
 * @Date: 2019/1/23 10:45
 */

package com.qhl.design.structure.decorator;

public class Xiangchang implements IBattercake {
    private IBattercake iBattercake;

    public Xiangchang(IBattercake iBattercake) {
        this.iBattercake = iBattercake;
    }

    @Override
    public String getDesc() {
        return this.iBattercake.getDesc()+" one xiangchang";
    }

    @Override
    public int getCost() {
        return this.iBattercake.getCost()+2;
    }
}
