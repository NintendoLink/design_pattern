/**
 * @Author: LinK
 * @Date: 2019/1/16 13:41
 */

package com.qhl.design.creation.builder.v3;

public class Course {

    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;
    private String courseQA;

    public Course(CourseBuilder courseBuilder) {
        this.courseName = courseBuilder.getCourseName();
        this.courseArticle = courseBuilder.getCourseArticle();
        this.coursePPT = courseBuilder.getCoursePPT();
        this.courseVideo = courseBuilder.getCourseVideo();
        this.courseQA = courseBuilder.getCourseQA();
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }
}
