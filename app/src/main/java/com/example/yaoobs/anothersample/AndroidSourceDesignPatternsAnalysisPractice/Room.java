package com.example.yaoobs.anothersample.AndroidSourceDesignPatternsAnalysisPractice;

/**
 * Created by yaoobs on 2017/10/10.
 */

public class Room {
    public float area;
    public float price;

    public Room(float area, float price) {
        this.area = area;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room [area=" + area + ", price =" + price + "]";
    }
}
