// CS211 - Assignment 1 - Critters
// Alexander Funai

/* This program extends the Critter class to create a new subclass called of other animals, that have variety
 * of different behaviors, and then interact in GUI application with each other.
 */

import javax.swing.text.rtf.RTFEditorKit;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Lion extends Critter {

    private int count;
    Color Lioncolor;
    Random rand = new Random();

    public Lion() {
        count = 0;
        getColor();
    }

    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            count++;
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
            count++;
            return Action.LEFT;
        } else if (info.getFront() == Neighbor.SAME) {
            count++;
            return Action.RIGHT;
        } else {
            count++;
            return Action.HOP;
        }
    }

    public Color getColor() {
        if (count%3==0){
            int x=0;
            while (x==0){
                int i=rand.nextInt(3);
                if (i==0 && this.Lioncolor!=Color.RED){
                    this.Lioncolor= Color.RED;
                    x++;
                } if (i==1 && Lioncolor!=Color.GREEN){
                    this.Lioncolor=Color.GREEN;
                    x++;
                } if (i==2 && Lioncolor!=Color.BLUE){
                    this.Lioncolor=Color.BLUE;
                    x++;
                }
            }
        }
        return Lioncolor;
    }


    public String toString() {
        return "L";
    }

}


