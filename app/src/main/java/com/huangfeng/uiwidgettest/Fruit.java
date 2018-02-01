package com.huangfeng.uiwidgettest;

/**
 * Created by huangfeng on 2018/2/1.
 */

public class Fruit {

    private String name;
    private int imageId;


    public int getImageId() {
        return imageId;
    }

    public String getName() {
        return name;
    }

    public Fruit(String name,int imageId){
        this.name = name;
        this.imageId = imageId;
    }
}
