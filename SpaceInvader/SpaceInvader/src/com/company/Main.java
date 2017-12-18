package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
	Map GameMap = new Map();


    GameMap.AddElement(new Wall());
    GameMap.ChangeElementCoordinates(GameMap.getElementListSize()-1,23,0);
    GameMap.AddElement(new Wall());
    GameMap.ChangeElementCoordinates(GameMap.getElementListSize()-1,23,6);
    GameMap.AddElement(new Wall());
    GameMap.ChangeElementCoordinates(GameMap.getElementListSize()-1,23,12);
    GameMap.AddElement(new Wall());
    GameMap.ChangeElementCoordinates(GameMap.getElementListSize()-1,23,18);

    GameMap.AddElement(new Enemy1());
    GameMap.ChangeElementCoordinates(GameMap.getElementListSize()-1,0,2);
    GameMap.AddElement(new Enemy1());
    GameMap.ChangeElementCoordinates(GameMap.getElementListSize()-1,0,8);
    GameMap.AddElement(new Enemy1());
    GameMap.ChangeElementCoordinates(GameMap.getElementListSize()-1,0,14);
    GameMap.AddElement(new Enemy1());
    GameMap.ChangeElementCoordinates(GameMap.getElementListSize()-1,0,20);
	int x=0;
	int timeToGoDown=2;
	int timeToRecreate=10;
	while (x!=-1)
    {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("");
        System.out.println("");

        GameMap.PrintMap();
        x=Integer.parseInt(keyboard.nextLine());
        if(x==5) GameMap.AddBulletUp();
        else GameMap.MovePlayer(x);

        timeToGoDown--;
        timeToRecreate--;
        if(timeToGoDown==0)
        {
            GameMap.setAllObjectsToGoDown();
            GameMap.AddEnemyShot();
            timeToGoDown = 2;
        }
        if(timeToRecreate==0)
        {
            GameMap.AddElement(new Enemy1());
            GameMap.ChangeElementCoordinates(GameMap.getElementListSize()-1,0,2);
            GameMap.AddElement(new Enemy1());
            GameMap.ChangeElementCoordinates(GameMap.getElementListSize()-1,0,8);
            GameMap.AddElement(new Enemy1());
            GameMap.ChangeElementCoordinates(GameMap.getElementListSize()-1,0,14);
            GameMap.AddElement(new Enemy1());
            GameMap.ChangeElementCoordinates(GameMap.getElementListSize()-1,0,20);
            timeToRecreate = 12;
        }
        GameMap.BulletMovement();
        GameMap.checkBulletHits();
    }
    }
}
