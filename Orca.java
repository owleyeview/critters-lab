/*
Rashaan Lightpool
10/04/2022
CS 145
Lab 2: Critters
Orca.java
*/

import java.awt.*;
public class Orca extends Critter { // creates the Orca class
    private boolean appearance = true; // variable for alternating appearance
    public Color getColor() { // returns the current color
        //define 'angry' white and black
        Color white = new Color(255, 229, 229);
        Color black = new Color(46, 0, 0);

        if (appearance) {
            return white;
        } else {
            return black;
        }
    }

    public String toString() { // returns the string representation
        return "¥";
    }

    public Action getMove(CritterInfo info) { // defines Orca behavior
        appearance = !appearance; // changes appearance each turn

        // Bear behavior with the added trait of turning right
        // when an enemy is directly to the right
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        }else if (info.getRight() == Neighbor.OTHER) {
            return Action.RIGHT;
        } else {
            return Action.LEFT;
        }
    }
}