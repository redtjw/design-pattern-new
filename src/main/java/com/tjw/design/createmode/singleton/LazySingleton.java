package com.tjw.design.createmode.singleton;

/**
 * @author Mr.Tang
 * @date 2018/9/5
 */
public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton(){}
    public static LazySingleton getInstance(){
        if (instance==null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
