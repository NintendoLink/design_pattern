package com.qhl.design.creation.abstractfactory;

import com.qhl.design.creation.abstractfactory.entry.JavaCourse;
import com.qhl.design.creation.abstractfactory.entry.PythonCourse;
import com.qhl.design.creation.abstractfactory.proptype.Article;
import com.qhl.design.creation.abstractfactory.proptype.CourseFactory;
import com.qhl.design.creation.abstractfactory.proptype.Video;

public class Test {

    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourse();
        Video video = courseFactory.getVideo();
        video.produce();

        CourseFactory pythonCourse = new PythonCourse();
        Article article = pythonCourse.getArticle();
        article.produce();
    }
}
