package com.tjw.design.createmode.build;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

/**
 * @author Mr.Tang
 * @date 2018/9/4
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder().buildCpu("cpu").buildHardDisk("细节")
                .build();
        System.out.println(computer);
        Set<String> set  = ImmutableSet.<String>builder().add("ad").add("cc").build();
        System.out.println(set);
    }
}
