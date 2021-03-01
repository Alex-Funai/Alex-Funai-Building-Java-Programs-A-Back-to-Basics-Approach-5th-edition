// CS211 - Assignment 1 - Critters
// Alexander Funai

/* This program extends the Critter class to create a new subclass called of other animals, that have variety
 * of different behaviors, and then interact in GUI application with each other.
 */

import java.awt.*;

public class Giant extends Critter {

    private int count;
    private String previousName;
    private final String[] gChant = {"fee", "fie", "foe", "fum"};
    private int giantIndex;

    public Giant() {
        this.count = 0;
        this.giantIndex = 0;
    }

    // 1) Giant will infect neighbors inhabiting spot in front.
    // 2) If not it will hop, and try to turn right.
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            this.count++;
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            this.count++;
            return Action.HOP;
        } else {
            this.count++;
            return Action.RIGHT;
        }
    }

    // Giant color is default always set gray.
    public Color getColor() {
        return Color.GRAY;
    }

    public String toString() {
        this.count = this.count + 1;
        if ((this.count - 1) % 12 == 0) {
            if (this.giantIndex == 4) {
            this.giantIndex = 0;
        }
        this.giantIndex = this.giantIndex + 1;
        return gChant[giantIndex - 1].toString();
    } else {
        this.previousName = gChant[giantIndex - 1];
        }
        return this.previousName;
    }
}
