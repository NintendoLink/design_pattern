/**
 * @Author: LinK
 * @Date: 2019/1/16 10:31
 */

package com.qhl.design.creation.builder;

public abstract class CourseBuilder {

    public abstract void buliderCourseName(String courseName);
    public abstract void buliderCoursePPT(String coursePPT);
    public abstract void buliderCourseVideo(String courseVideo);
    public abstract void buliderCourseArticle(String courseArticle);
    public abstract void buliderCourseQA(String courseQA);

    public abstract Course makeCourse();
}
