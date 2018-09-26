package com.tjw.design.behave.template;

import lombok.Setter;

/**
 * @author Mr.Tang
 * @date 2018/9/26
 */
@Setter
public class ReactCourse extends ACourse {
    private Boolean needWriteArticle;
    void packageCourse() {
        System.out.println("React课程打包");
    }

    @Override
    protected Boolean needWriteArticle() {
        return needWriteArticle;
    }
}
