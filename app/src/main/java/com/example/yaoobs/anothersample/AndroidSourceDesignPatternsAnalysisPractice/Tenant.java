package com.example.yaoobs.anothersample.AndroidSourceDesignPatternsAnalysisPractice;

import java.util.List;

/**
 * Created by yaoobs on 2017/10/10.
 */

public class Tenant {

    public float roomArea;
    public float roomPrice;
    public static final float diffPrice = 100.0001f;
    public static final float diffArea = 0.00001f;

    public void rentRoom(Mediator mediator) {

        System.out.println("租到房间啦!" + mediator.rentOut(diffArea,diffPrice));

    }
}
