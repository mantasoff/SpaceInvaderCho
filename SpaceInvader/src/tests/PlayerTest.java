package tests;

import com.company.Player;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class PlayerTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getLives() {
        Player testPlayer = new Player();
        //By default, the player has 5 lives
        assertEquals(5,testPlayer.getLives());
    }


    @Test
    public void pushDown() {
        Player testPlayer = new Player();

        ArrayList<int[]> oldPlayerCoordinatesList = new ArrayList<>(testPlayer.getCoordinates());
        oldPlayerCoordinatesList.clear();

        int[] oldPlayerCoordinates = new int[2];
        int[] newPlayerCoordinates =  new int[]{0,0};;


        ArrayList<int[]> newPlayerCoordinatesList = new ArrayList<>(testPlayer.getCoordinates());

        for (int i = 0; i < newPlayerCoordinatesList.size(); i++)
        {
           newPlayerCoordinates = newPlayerCoordinatesList.get(i);
           oldPlayerCoordinates[0] = newPlayerCoordinates[0];
           oldPlayerCoordinates[1] = newPlayerCoordinates[1];
           oldPlayerCoordinatesList.add(new int[]{newPlayerCoordinates[0],newPlayerCoordinates[1]});
        }

        testPlayer.pushDown();

        for (int j = 0; j < oldPlayerCoordinatesList.size(); j++)
        {
            newPlayerCoordinates = newPlayerCoordinatesList.get(j);
            oldPlayerCoordinates = oldPlayerCoordinatesList.get(j);


            System.out.println("Old: " + oldPlayerCoordinates[0] + "; New:" + newPlayerCoordinates[0]);
            System.out.println("Old: " + oldPlayerCoordinates[1] + "; New:" + newPlayerCoordinates[1]);
            //Because pushdown pushes the first coordinate by one
            assertEquals(oldPlayerCoordinates[0]+1,newPlayerCoordinates[0]);
            System.out.println(j);
        }
    }

    @Test
    public void setLivesMinus1() {
        Player testPlayer = new Player();
        //By default, the player has 5 lives
        testPlayer.setLivesMinus1();
        //Now he should have 4
        assertEquals(4,testPlayer.getLives());
    }

    @Test
    public void setNewCoordinates() {
        Player testPlayer = new Player();

        ArrayList<int[]> oldPlayerCoordinatesList = new ArrayList<>(testPlayer.getCoordinates());
        oldPlayerCoordinatesList.clear();

        int[] oldPlayerCoordinates = new int[2];
        int[] newPlayerCoordinates =  new int[]{0,0};;


        ArrayList<int[]> newPlayerCoordinatesList = new ArrayList<>(testPlayer.getCoordinates());

        for (int i = 0; i < newPlayerCoordinatesList.size(); i++)
        {
            newPlayerCoordinates = newPlayerCoordinatesList.get(i);
            oldPlayerCoordinates[0] = newPlayerCoordinates[0];
            oldPlayerCoordinates[1] = newPlayerCoordinates[1];
            oldPlayerCoordinatesList.add(new int[]{newPlayerCoordinates[0],newPlayerCoordinates[1]});
        }

        testPlayer.setNewCoordinates(-4,0);
        newPlayerCoordinatesList = new ArrayList<>(testPlayer.getCoordinates());

        for (int j = 0; j < oldPlayerCoordinatesList.size(); j++)
        {
            newPlayerCoordinates = newPlayerCoordinatesList.get(j);
            oldPlayerCoordinates = oldPlayerCoordinatesList.get(j);


            System.out.println("Old: " + oldPlayerCoordinates[0] + "; New:" + newPlayerCoordinates[0]);
            System.out.println("Old: " + oldPlayerCoordinates[1] + "; New:" + newPlayerCoordinates[1]);
            //Because setnewCoordinates is made to push the coordinate by the number you put in the parameters
            //now it was a four
            assertEquals(oldPlayerCoordinates[0]-4,newPlayerCoordinates[0]);
            System.out.println(j);
        }
    }

}