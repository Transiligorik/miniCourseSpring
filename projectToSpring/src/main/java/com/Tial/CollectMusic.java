package com.Tial;

import java.util.ArrayList;
import java.util.List;

public class CollectMusic {
    private List<String> list = new ArrayList<>();

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void displayInfo() {
        for(Object o : list) {
            System.out.println("Value : " + o);
        }
    }
}
