package com.qhl.design.creation.abstractfactory.entry;

import com.qhl.design.creation.abstractfactory.proptype.Article;

public class JavaArticle extends Article {
    public void produce() {
        System.out.println("Java Article");
    }
}
