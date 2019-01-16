/**
 * @Author: LinK
 * @Date: 2019/1/16 10:34
 */

package com.qhl.design.creation.builder;

public class CourseActualBuilder extends CourseBuilder {

    private Course course = new Course();

    @Override
    public void buliderCourseName(String courseName) {
        this.course.setCourseName(courseName);
    }

    @Override
    public void buliderCoursePPT(String coursePPT) {
        this.course.setCoursePPT(coursePPT);
    }

    @Override
    public void buliderCourseVideo(String courseVideo) {
        this.course.setCourseVideo(courseVideo);
    }

    @Override
    public void buliderCourseArticle(String courseArticle) {
        this.course.setCourseArticle(courseArticle);
    }

    @Override
    public void buliderCourseQA(String courseQA) {
        this.course.setCourseQA(courseQA);
    }

    public Course makeCourse() {
        return this.course;
    }
}
