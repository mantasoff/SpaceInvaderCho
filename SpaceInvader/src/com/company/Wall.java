package com.company;

public class Wall extends Element{
    public Wall()
    {
        lives = 5;
        coordinates.add(new int[]{0,0});
        coordinates.add(new int[]{0,1});
        coordinates.add(new int[]{0,2});
        coordinates.add(new int[]{0,3});

        coordinates.add(new int[]{1,0});
        coordinates.add(new int[]{1,1});
        coordinates.add(new int[]{1,2});
        coordinates.add(new int[]{1,3});
        shooter = false;
    }

    @Override
    public void pushDown() {

    }
}
