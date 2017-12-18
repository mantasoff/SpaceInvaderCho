package com.company;

public class Enemy1 extends Element {
    public Enemy1()
    {
        lives = 1;
        coordinates.add(new int[]{-1,-1});
        coordinates.add(new int[]{0,-1});
        coordinates.add(new int[]{0,0});
        coordinates.add(new int[]{0,1});
        coordinates.add(new int[]{0,2});
        coordinates.add(new int[]{-1,2});

        coordinates.add(new int[]{1,0});
        coordinates.add(new int[]{1,1});
    }
}
