package com.qhl.design.principle.dependiciesinversion;

public class Test {

//    v2
//    public static void main(String[] args) {
//        Qhl qhl = new Qhl();
//        qhl.StudyCourse(new StudyJavaCourse());
//        qhl.StudyCourse(new StudyFECourse());
//    }

//    v3
//    public static void main(String[] args) {
//        Qhl qhl = new Qhl(new StudyJavaCourse());
//        qhl.studyCourse();
//    }

    public static void main(String[] args) {
        Qhl qhl = new Qhl(new StudyJavaCourse());
        qhl.studyCourse();
        qhl.setiCourse(new StudyFECourse());
        qhl.studyCourse();
    }

    }
