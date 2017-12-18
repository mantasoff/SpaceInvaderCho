package com.company;

import java.util.ArrayList;

public class Bullet extends Element {

    boolean up = false;

    public Bullet(int xx, int xy, boolean xup) {
        coordinates.add(new int[]{xx, xy});
        up = xup;
    }

    public boolean isUp() {
        return up;
    }

    public void pushUpOrDown() {

        ArrayList<int[]> elementCoordinateList = getCoordinates();
        int[] tempArray = elementCoordinateList.get(0);
        if (up) {
            setNewCoordinates(-1, 0);
        } else {
            setNewCoordinates(1, 0);
        }

    }
}
