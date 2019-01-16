/**
 * @Author: LinK
 * @Date: 2019/1/16 10:36
 */

package com.qhl.design.creation.builder;

public class CourseCoach {

    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName,String coursePPT,
                             String courseVideo,String courseArticle,
                             String courseQA){
        this.courseBuilder.buliderCourseArticle(courseName);
        this.courseBuilder.buliderCoursePPT(coursePPT);
        this.courseBuilder.buliderCourseVideo(courseVideo);
        this.courseBuilder.buliderCourseArticle(courseArticle);
        this.courseBuilder.buliderCourseQA(courseQA);

        return this.courseBuilder.makeCourse();

    }
}
