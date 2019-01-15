package com.qhl.design.creation.simplefactory;

public class VideoFactory {

    public Video produce(Class c){
//        if ("java".equalsIgnoreCase(type)){
//            return new JavaVideo();
//        }else if ("python".equalsIgnoreCase(type)){
//            return new PythonVideo();
//        }else {
//            return null;
//        }

//        使用反射拓展

        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
