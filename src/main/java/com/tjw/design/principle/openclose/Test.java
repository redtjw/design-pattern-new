package com.tjw.design.principle.openclose;

/**
 * @author Mr.Tang
 * @date 2018/8/30
 */
public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new DiscountCourse(94,"java课程",700d);
        DiscountCourse discountCourse = (DiscountCourse)iCourse;
        System.out.println("课程id:"+discountCourse.getId()+
                ",课程名称:"+discountCourse.getName()+"原价："+discountCourse.getOriginalPrice()+",价格:"+discountCourse
                .getPrice());
    }
}
