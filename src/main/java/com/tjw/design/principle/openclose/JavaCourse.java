package com.tjw.design.principle.openclose;

import lombok.AllArgsConstructor;

/**
 * @author Mr.Tang
 * @date 2018/8/30
 */
@AllArgsConstructor
public class JavaCourse implements ICourse {
    private Integer id;
    private String name;
    private Double price;
    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }
}
