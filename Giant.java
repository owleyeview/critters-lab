/*
Rashaan Lightpool
10/04/2022
CS 145
Lab 2: Critters
Giant.java
*/

import java.awt.*;

public class Giant extends Critter { // creates the Giant class
    private int turnCount = 0;
    public Color getColor() { // returns the Giant color
        return Color.GRAY;
    }

    public String toString() {  // returns the string representation of the Giant
        int wordNum = turnCount / 6 % 4; //calculates which string is displayed based on the turn count
        if (wordNum == 0) {
            return "fee";
        } else if (wordNum == 1) {
            return "fie";
        } else if (wordNum == 2) {
            return "foe";
        } else {
            return "fum";
        }
    }

    public Action getMove(CritterInfo info) { // defines Giant behavior
        turnCount++;
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.RIGHT;
        }
    }
}