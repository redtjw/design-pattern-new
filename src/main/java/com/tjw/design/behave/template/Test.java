package com.tjw.design.behave.template;

/**
 * @author Mr.Tang
 * @date 2018/9/26
 */
public class Test {
    public static void main(String[] args) {
        ACourse java = new JavaCourse();
        java.makeCourse();
        java.packageCourse();
        ACourse react = new ReactCourse();
        ((ReactCourse) react).setNeedWriteArticle(true);
        react.makeCourse();
        react.packageCourse();
    }
}
