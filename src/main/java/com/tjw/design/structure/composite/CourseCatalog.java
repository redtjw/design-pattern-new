package com.tjw.design.structure.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mr.Tang
 * @date 2018/9/18
 */
@Data

public class CourseCatalog extends CatalogComponent {
    private String name;

    public CourseCatalog(String name) {
        this.name = name;
    }

    private List<CatalogComponent> items = new ArrayList<CatalogComponent>();
    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent catalogComponent:items){
            catalogComponent.print();
        }
    }
}
