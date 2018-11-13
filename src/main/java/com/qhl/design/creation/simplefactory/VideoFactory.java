package com.qhl.design.creation.simplefactory;

public class VideoFactory {

    public Video produce(String type){
        if ("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if ("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }else {
            return null;
        }
    }
}
