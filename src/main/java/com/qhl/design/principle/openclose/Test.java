package com.qhl.design.principle.openclose;

public class Test {

    public static void main(String[] args) {

        ICourse javaCourse = new JavaDiscountCourse(96,"课程名",348d);

        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse)javaCourse;

//        System.out.println("课程ID"+javaCourse.getId()+"课程名 "+javaCourse.getName()+"课程价格"+javaCourse.getPrice());
        System.out.println("课程ID"+javaDiscountCourse.getId()+"课程名 "+javaDiscountCourse.getName()+"课程原价"+javaDiscountCourse.getPrice()
        +"打折价"+ javaDiscountCourse.getDiscountPrice());

    }
}
