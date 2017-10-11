package com.example.yaoobs.anothersample.AndroidSourceDesignPatternsAnalysisPractice;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yaoobs on 2017/10/10.
 */

public class Mediator {
    List<Room> mRooms = new ArrayList<Room>();

    public Mediator() {
        for (int i = 0; i < 5; i++) {
            mRooms.add(new Room(14 + i, (14 + i) * 150));
        }
    }

    public List<Room> getAllRooms(){
        return mRooms;
    }
}
