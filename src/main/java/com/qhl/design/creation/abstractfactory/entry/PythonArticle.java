package com.qhl.design.creation.abstractfactory.entry;

import com.qhl.design.creation.abstractfactory.proptype.Article;

public class PythonArticle extends Article {
    public void produce() {
        System.out.println("Python Article");
    }
}
