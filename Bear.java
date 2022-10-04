/*
Rashaan Lightpool
10/04/2022
CS 145
Lab 2: Critters
Bear.java
*/

import java.awt.*;

public class Bear extends Critter { // creates the Bear class
    private boolean polar;
    private boolean slash;
    public Bear(boolean polar) {  // constructor
        this.polar = polar;
        slash = true;
    }

    public Color getColor() { //returns the Bear color
        if ( polar ) {
            return Color.WHITE;
        } else {
            return Color.BLACK;
        }
    }

    public String toString() { // returns alternating slashes to represent the bear
        if ( slash ) {
            return "/";
        } else {
            return "\\";
        }
    }

    public Action getMove(CritterInfo info) { // defines Bear behavior
        slash = !slash;
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if ( info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.LEFT;
        }
    }
}
