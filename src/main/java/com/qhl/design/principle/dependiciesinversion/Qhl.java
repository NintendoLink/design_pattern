package com.qhl.design.principle.dependiciesinversion;

public class Qhl {

//    v2
//    public void StudyCourse(ICourse iCourse){
//        iCourse.StudyCourse();
//    }

//    v3
//    private ICourse iCourse;
//
//    public Qhl(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }
//
//    public void studyCourse(){
//        this.iCourse.StudyCourse();
//    }

    //    v3
    private ICourse iCourse;

    public Qhl(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse(){
        this.iCourse.StudyCourse();
    }


    public ICourse getiCourse() {
        return iCourse;
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
}
