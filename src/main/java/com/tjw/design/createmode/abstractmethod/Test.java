package com.tjw.design.createmode.abstractmethod;

/**
 * @author Mr.Tang
 * @date 2018/9/4
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video javaVideo = courseFactory.getVedew();
        Article javaArticle = courseFactory.getArricle();
        javaArticle.produce();
        javaVideo.produce();
    }
}
