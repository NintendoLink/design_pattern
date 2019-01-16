/**
 * @Author: LinK
 * @Date: 2019/1/16 11:32
 */

package com.qhl.design.creation.builder.v2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseArticle("Article").buildCourseName("Name").build();
        System.out.println(course);
    }
}
