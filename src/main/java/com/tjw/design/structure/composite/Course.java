package com.tjw.design.structure.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Mr.Tang
 * @date 2018/9/18
 */
@Data
@AllArgsConstructor
public class Course extends CatalogComponent {
    private String name;
    private double price;

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.getName();
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("课程名称:"+this.getName()+" 价格："+this.getPrice());
    }
}
