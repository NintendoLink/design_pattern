/**
 * @Author: LinK
 * @Date: 2019/1/16 11:09
 */

package com.qhl.design.creation.builder;

public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();


        CourseCoach courseCoach =new CourseCoach();
        courseCoach.setCourseBuilder(courseBuilder);

        courseBuilder.buliderCourseQA("QA");

        Course course= courseCoach.makeCourse("Name",
                "PPT",
                "Video",
                "Article",
                "QA");

        System.out.println(course);
    }
}
