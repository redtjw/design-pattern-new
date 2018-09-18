package com.tjw.design.createmode.singleton;

/**
 * @author Mr.Tang
 * @date 2018/9/5
 */
public class Test {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                LazySingleton lazySingleton = LazySingleton.getInstance();
                System.out.println(Thread.currentThread().getName()+"--"+lazySingleton);
            }
        }).start();
        new Thread(new Runnable() {
            public void run() {
                LazySingleton lazySingleton = LazySingleton.getInstance();
                System.out.println(Thread.currentThread().getName()+"--"+lazySingleton);
            }
        }).start();
        System.out.println("end");
    }
}
