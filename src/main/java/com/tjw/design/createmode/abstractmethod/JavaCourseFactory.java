package com.tjw.design.createmode.abstractmethod;

/**
 * @author Mr.Tang
 * @date 2018/9/4
 */
public class JavaCourseFactory implements CourseFactory {
    public Video getVedew() {
        return new JavaVideo();
    }

    public Article getArricle() {
        return new JavaArticle();
    }
}
