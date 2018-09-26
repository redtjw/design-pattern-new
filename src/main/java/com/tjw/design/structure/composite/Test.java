package com.tjw.design.structure.composite;

/**
 * @author Mr.Tang
 * @date 2018/9/18
 */
public class Test {

    public static void main(String[] args) {
        CatalogComponent linux = new Course("linux 课程",50);
        CatalogComponent windows = new Course("windows课程",90);

        CatalogComponent java = new CourseCatalog("java课程目录");
        CatalogComponent php = new Course("php课程",10);
        CatalogComponent c = new Course("c课程",30);
        java.add(c);
        java.add(php);
        CatalogComponent main = new CourseCatalog("主目录");
        main.add(linux);
        main.add(windows);
        main.add(java);
        main.print();
    }
}
