package com.tjw.design.principle.dependecyinversion;

/**
 * @author Mr.Tang
 * @date 2018/8/30
 */
public class App {
    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
    public void study(){
        iCourse.study();
    }
}
