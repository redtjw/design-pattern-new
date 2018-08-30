package com.tjw.design.principle.dependecyinversion;

/**
 * @author Mr.Tang
 * @date 2018/8/30
 */
public class Test {
    public static void main(String[] args) {
        App app = new App();
        app.setiCourse(new Java());
        app.study();

        app.setiCourse(new FE());
        app.study();
    }
}
