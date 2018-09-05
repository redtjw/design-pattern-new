package com.tjw.design.createmode.build;

/**
 * @author Mr.Tang
 * @date 2018/9/4
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder().buildCpu("cpu").buildHardDisk("细节")
                .build();
        System.out.println(computer);
    }
}
