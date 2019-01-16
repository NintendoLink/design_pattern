/**
 * @Author: LinK
 * @Date: 2019/1/16 13:57
 */

package com.qhl.design.creation.builder.v3;

public class Test {
    public static void main(String[] args) {
        Course course = new CourseBuilder().buildCourseArticle("Article").buildCourseName("Name").build();
        System.out.println(course);
    }
}
