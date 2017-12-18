package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int shootingChoice = 5;

        //Setting initial map values
        Map gameMap = new Map();
        setInitialWalls(gameMap);
        setNewEnemies(gameMap);

        int playerMovement = 0;
        //Time when the objects go down by one on the console
        int timeToGoDown = 2;
        //Time when the objects are recreated from the top left corner
        int timeToRecreate = 10;

        //playerMovement if equeals 1 or 2 to go to the right or left, -1 gets you out
        while (playerMovement != -1) {
            printConsoleSpaces();
            gameMap.printMap();
            playerMovement = Integer.parseInt(keyboard.nextLine());

            if (playerMovement == shootingChoice) {
                gameMap.addBulletUp();
            } else {
                gameMap.movePlayer(playerMovement);
            }

            timeToGoDown--;
            timeToRecreate--;

            if (timeToGoDown == 0) {
                gameMap.setAllObjectsToGoDown();
                gameMap.addEnemyShot();
                timeToGoDown = 10;
            }

            if (timeToRecreate == 0) {
                setNewEnemies(gameMap);
                timeToRecreate = 24;
            }

            gameMap.bulletMovement();
            gameMap.checkBulletHits();
        }
    }
    //Lets refactor this shit
    static void setInitialWalls(Map gameMap)
    {
        //From left to right
        //23 is the map height
        gameMap.addElement(new Wall());
        gameMap.changeElementCoordinates(gameMap.getElementListSize()-1,23,0);
        gameMap.addElement(new Wall());
        gameMap.changeElementCoordinates(gameMap.getElementListSize()-1,23,6);
        gameMap.addElement(new Wall());
        gameMap.changeElementCoordinates(gameMap.getElementListSize()-1,23,12);
        gameMap.addElement(new Wall());
        gameMap.changeElementCoordinates(gameMap.getElementListSize()-1,23,18);
    }
    static void setNewEnemies(Map gameMap)
    {
        //From left to right
        gameMap.addElement(new Enemy1());
        gameMap.changeElementCoordinates(gameMap.getElementListSize()-1,0,2);
        gameMap.addElement(new Enemy1());
        gameMap.changeElementCoordinates(gameMap.getElementListSize()-1,0,8);
        gameMap.addElement(new Enemy1());
        gameMap.changeElementCoordinates(gameMap.getElementListSize()-1,0,14);
        gameMap.addElement(new Enemy1());
        gameMap.changeElementCoordinates(gameMap.getElementListSize()-1,0,20);
    }
    static void printConsoleSpaces()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}
