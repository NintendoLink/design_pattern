/**
 * @Author: LinK
 * @Date: 2019/1/23 10:44
 */

package com.qhl.design.structure.decorator;

public class EggDecorator implements IBattercake {
    private IBattercake iBattercake;

    public EggDecorator(IBattercake iBattercake) {
        this.iBattercake = iBattercake;
    }

    @Override
    public String getDesc() {
        return iBattercake.getDesc() + " one egg";
    }

    @Override
    public int getCost() {
        return iBattercake.getCost() + 1;
    }
}
