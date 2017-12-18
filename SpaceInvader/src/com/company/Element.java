package com.company;

import java.util.ArrayList;

public  abstract class  Element {
    protected boolean shooter = true;
    protected int lives = 0;
    protected ArrayList coordinates = new ArrayList<int[]>();

    public int getLives() {
        return lives;
    }

    public ArrayList getCoordinates() {
        return coordinates;
    }

    public void pushDown() {
        int[] coordinateArray;
        for (int i = 0; i < coordinates.size(); i++) {
            coordinateArray = (int[]) coordinates.get(i);
            coordinateArray[0]++;
            coordinates.set(i, coordinateArray);
        }
    }

    public void setLivesMinus1() {
        lives--;
    }

    public void setNewCoordinates(int x, int y) {
        int[] coordinateArray;
        for (int i = 0; i < coordinates.size(); i++) {
            coordinateArray = (int[]) coordinates.get(i);
            coordinateArray[0] += x;
            coordinateArray[1] += y;
            coordinates.set(i, coordinateArray);
        }
    }

    public boolean isShooter() {
        return shooter;
    }
}
