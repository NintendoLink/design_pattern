package com.qhl.design.creation.simplefactory;

public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.produce("java");
        video.play();
    }
}
