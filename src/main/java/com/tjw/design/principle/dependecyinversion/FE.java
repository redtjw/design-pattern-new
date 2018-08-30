package com.tjw.design.principle.dependecyinversion;

/**
 * @author Mr.Tang
 * @date 2018/8/30
 */
public class FE implements ICourse {
    @Override
    public void study() {
        System.out.println("我在学习FE课程");
    }
}
