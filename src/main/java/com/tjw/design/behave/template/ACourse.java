package com.tjw.design.behave.template;

/**
 * @author Mr.Tang
 * @date 2018/9/26
 */
public abstract class ACourse {
    protected final void makeCourse(){
        this.makePPT();
        this.makeViedio();
        if (needWriteArticle()){
            this.makeWriteArticle();
        }
    }
    final void makePPT(){
        System.out.println("制作ppt");
    }
    final void makeViedio(){
        System.out.println("制作视频");
    }
    final void makeWriteArticle(){
        System.out.println("写手记");
    }
    protected Boolean needWriteArticle(){
        return false;
    }
    abstract void packageCourse();
}
