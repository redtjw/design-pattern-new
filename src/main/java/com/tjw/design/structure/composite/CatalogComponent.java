package com.tjw.design.structure.composite;

/**
 * @author Mr.Tang
 * @date 2018/9/18
 */
public abstract class CatalogComponent {
    public  String getName(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持获取名字");
    }
    public void add(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持添加");
    }
    public void remove(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持删除");
    }
    public double getPrice(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持获取价格");
    }
    public void print(){
        throw new UnsupportedOperationException("不支持打印");
    }
}
