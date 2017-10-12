package com.example.yaoobs.anothersample.AndroidSourceDesignPatternsAnalysisPractice.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yaoobs on 2017/10/12.
 */

public class Company{
    private List<Staff> allStaffs = new ArrayList<>();
    public void addStaff(Staff per){
        allStaffs.add(per);
    }

    public void showAllStaffs(){
        for (Staff per:allStaffs){
            System.out.println("Obj:"+ per.toString());
        }
    }



}
