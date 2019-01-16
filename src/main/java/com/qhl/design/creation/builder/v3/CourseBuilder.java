/**
 * @Author: LinK
 * @Date: 2019/1/16 13:42
 */

package com.qhl.design.creation.builder.v3;

public class CourseBuilder {

    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;
    private String courseQA;


    public String getCourseName() {
        return courseName;
    }

    public String getCoursePPT() {
        return coursePPT;
    }

    public String getCourseVideo() {
        return courseVideo;
    }

    public String getCourseArticle() {
        return courseArticle;
    }

    public String getCourseQA() {
        return courseQA;
    }

    public CourseBuilder buildCoursePPT(String coursePPT){
        this.coursePPT = coursePPT;
        return this;
    }

    public CourseBuilder buildCourseName(String courseName){
        this.courseName = courseName;
        return this;
    }

    public CourseBuilder buildCourseVideo(String courseVideo){
        this.courseVideo = courseVideo;
        return this;
    }

    public CourseBuilder buildCourseArticle(String courseArticle){
        this.courseArticle = courseArticle;
        return this;
    }

    public CourseBuilder buildCourseQA(String courseQA){
        this.courseQA = courseQA;
        return this;
    }

    public Course build(){
        return new Course(this);
    }
}
