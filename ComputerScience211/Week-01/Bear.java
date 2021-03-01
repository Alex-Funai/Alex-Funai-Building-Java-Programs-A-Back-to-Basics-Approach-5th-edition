// CS211 - Assignment 1 - Critters
// Alexander Funai

/* This program extends the Critter class to create a new subclass called of other animals, that have variety
 * of different behaviors, and then interact in GUI application with each other.
 */

import java.awt.*;

public class Bear extends Critter {

    // Declare variables for polar bear count.
    private int count;
    private boolean polar;
    
    public Bear(boolean polar) {
            this.count = 0;
            this.polar = polar;
    }

    // 1. Bear will infect neighbors inhabiting location in front.
    // 2. If not bear will hop if possible, and turn left if possible.
    public Critter.Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.LEFT;
        }
    }

    // Default color is white, if not than black.
    public Color getColor() {
        if (this.polar) {
            return Color.WHITE;
        } else {
            return Color.BLACK;
        }
    }

    // Alternate between brackets off count.
    public String toString() {
        this.count = this.count + 1;
        if (count % 2 == 1) {
            return "/";
        } else {
            return "\\";
        }
    }
}
