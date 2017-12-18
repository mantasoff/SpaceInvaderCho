package com.company;

import java.util.ArrayList;

public class Element {
    protected boolean shooter = true;
    protected int lives = 0;
    protected ArrayList coordinates = new ArrayList<int[]>();

    public int getLives() {
        return lives;
    }
    public ArrayList getCoordinates() {
        return coordinates;
    }
    public void pushDown()
    {
        int[] tempArray = new int[2];
        for (int i=0;i<coordinates.size();i++) {
            tempArray = (int[]) coordinates.get(i);
            tempArray[0]++;
            coordinates.set(i, tempArray);
        }
    }
    public void setLivesMinus1()
    {
        lives--;
    }

    public void setNewCoordinates(int x,int y)
    {
        int[] tempArray = new int[2];
        for (int i=0;i<coordinates.size();i++) {
            tempArray = (int[]) coordinates.get(i);
            tempArray[0] += x;
            tempArray[1] += y;
            coordinates.set(i, tempArray);
        }
    }

    public boolean isShooter() {
        return shooter;
    }
}
