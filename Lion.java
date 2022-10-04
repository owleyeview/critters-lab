/*
Rashaan Lightpool
10/04/2022
CS 145
Lab 2: Critters
Lion.java
*/

import java.awt.*;
import java.util.Random;

public class Lion extends Critter { // creates the Lion class
    private int turnCount = 0; // turn count variable
    private Color lionColor; // color variable
    Random random = new Random();  // random object for color generation
    public Color getColor() { // returns the current color
        if (turnCount % 3 == 0) { // every 3 turns a new color is generated
           int number = random.nextInt(3) + 1; // generate a random number between 1 and 3
           if (number == 1) {
               lionColor = Color.RED;
           } else if (number == 2) {
               lionColor = Color.GREEN;
           } else {
               lionColor = Color.BLUE;
           }
           return lionColor;
        } else {
            return lionColor;
        }
    }

    public String toString() {  // return string representation
        return "L";
    }

    public Action getMove(CritterInfo info) {  // define Lion behavior
        turnCount++; // increment the turn count
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
            return Action.LEFT;
        } else if (info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        } else {
            return Action.HOP;
        }
    }
}