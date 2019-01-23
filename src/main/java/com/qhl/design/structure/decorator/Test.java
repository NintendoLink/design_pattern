/**
 * @Author: LinK
 * @Date: 2019/1/23 10:46
 */

package com.qhl.design.structure.decorator;

public class Test {
    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();

        EggDecorator eggDecorator = new EggDecorator(batterCake);

        eggDecorator = new EggDecorator(eggDecorator);
        System.out.println(eggDecorator.getDesc());
        System.out.println(eggDecorator.getCost());
    }
}
