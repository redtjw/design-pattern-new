package com.tjw.design.principle.openclose;

/**
 * @author Mr.Tang
 * @date 2018/8/30
 */
public class DiscountCourse extends JavaCourse {
    public DiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }
    public Double getOriginalPrice(){
        return super.getPrice();
    }
    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }
}
