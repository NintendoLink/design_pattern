package com.qhl.design.creation.abstractfactory.entry;

import com.qhl.design.creation.abstractfactory.proptype.Article;
import com.qhl.design.creation.abstractfactory.proptype.CourseFactory;
import com.qhl.design.creation.abstractfactory.proptype.Video;

public class JavaCourse implements CourseFactory {


    public Video getVideo() {
        return new JavaVideo();
    }

    public Article getArticle() {
        return new JavaArticle();
    }
}
