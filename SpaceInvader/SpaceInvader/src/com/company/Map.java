package com.company;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Map {

    ArrayList<Element> ElementList = new ArrayList<Element>();
    ArrayList<Bullet> BulletList = new ArrayList<Bullet>();
    private char[][] coordinates = {{' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '}};
    public Map()
    {
       AddElement(new Player());
    }
    public void PrintMap(){
        boolean print = false;

        for(int i=0;i<29;i++)
        {
            for (int l=0;l<25;l++)
            {

                ArrayList<int[]> tempArrayList = new ArrayList<int[]>();
                int[] tempArray;
                print = false;
                for(int k=0;k<ElementList.size();k++)
                {
                    tempArrayList = ElementList.get(k).getCoordinates();
                    for (int h=0;h<tempArrayList.size();h++)
                    {
                        tempArray = tempArrayList.get(h);
                        if(tempArray[0]==i && tempArray[1]==l)
                        {
                            print = true;
                        }

                    }
                }

                for(int k=0;k<BulletList.size();k++)
                {
                    tempArrayList = BulletList.get(k).getCoordinates();
                    for (int h=0;h<tempArrayList.size();h++)
                    {
                        tempArray = tempArrayList.get(h);
                        if(tempArray[0]==i && tempArray[1]==l)
                        {
                            print = true;
                        }

                    }
                }
                if (print==true)
                {

                    System.out.print("* ");
                }
                else {System.out.print(coordinates[i][l] + " ");}
            }
            System.out.println("");
        }

    }
    public void MovePlayer(int x)
    {
        if(x==1) ChangeElementCoordinates(0,0,-1);
        if(x==2) ChangeElementCoordinates(0,0,1);
    }
    public void AddElement(Element tempElement)
    {
        ElementList.add(tempElement);
    }
    public void ChangeElementCoordinates(int no, int x,int y)
    {
        ElementList.get(no).setNewCoordinates(x,y);
    }
    public void setAllObjectsToGoDown()
    {
        for (int i=1;i<ElementList.size();i++)
        {
            ElementList.get(i).pushDown();
        }
    }
    public void AddBulletUp()
    {
        ArrayList<int[]> tempArrayList = ElementList.get(0).getCoordinates();
        int[] tempArray;
        tempArray = tempArrayList.get(4);
        BulletList.add(new Bullet(tempArray[0]-2,tempArray[1],true));
    }
    public void BulletMovement() {
        for (int i = 0; i < BulletList.size(); i++) {
            BulletList.get(i).pushUpOrDown();
        }
    }
    public void checkBulletHits() {
        ArrayList<int[]> tempArrayList = new ArrayList<int[]>();
        ArrayList<int[]> tempArrayList2 = new ArrayList<int[]>();
        int[] tempArray;
        int[] tempArray2;
        boolean bulletRemoved = false;
        for (int i = 0; i < BulletList.size(); i++) {
            bulletRemoved = false;
            tempArrayList = BulletList.get(i).getCoordinates();
            tempArray = tempArrayList.get(0);
            for (int k = 0; k < ElementList.size(); k++) {
                tempArrayList2 = ElementList.get(k).getCoordinates();
                for (int h = 0; h < tempArrayList2.size(); h++) {
                    tempArray2 = tempArrayList2.get(h);
                    if (tempArray2[0] == tempArray[0] && tempArray2[1] == tempArray[1]) {
                        ElementList.get(k).setLivesMinus1();
                        if (ElementList.get(k).getLives() == 0) ElementList.remove(k);
                        BulletList.remove(i);
                        bulletRemoved = true;

                    }

                }
            }
            if ((bulletRemoved == false) && (tempArray[0] < 0 || tempArray[0] > 30)) BulletList.remove(i);
        }
    }
    public int getRandomShooter()
    {
        ArrayList<Integer> bottomShooterArray = new ArrayList<Integer>();
        int bottomArray = -1;
        ArrayList<int[]> tempArrayList = new ArrayList<int[]>();
        int[] tempArray;
        Random rand = new Random();

        for (int i=1; i<ElementList.size();i++)
        {
            if(ElementList.get(i).isShooter() == true)
            {
                tempArrayList = ElementList.get(i).getCoordinates();
                tempArray = tempArrayList.get(5);
                if(tempArray[0]>=bottomArray)
                {
                    if(tempArray[0]>bottomArray) bottomShooterArray.clear();
                    bottomShooterArray.add(i);
                    bottomArray = tempArray[0];
                }
            }


        }
        return bottomShooterArray.get((int)(Math.random() * bottomShooterArray.size() + 0));
    }

    public void AddEnemyShot()
    {
        ArrayList<int[]> tempArrayList = ElementList.get(getRandomShooter()).getCoordinates();
        int[] tempArray;
        tempArray = tempArrayList.get(5);
        BulletList.add(new Bullet(tempArray[0]+2,tempArray[1],false));
    }
    public int getElementListSize()
    {
        return ElementList.size();
    }

}

