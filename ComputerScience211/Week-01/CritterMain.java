// CS211 - Assignment 1 - Critters
// Alexander Funai

/* This program extends the Critter class to create a new subclass called of other animals, that have variety
 * of different behaviors, and then interact in GUI application with each other.
 */

public class CritterMain {
    public static void main(String[] args) {
        CritterFrame frame = new CritterFrame(60, 40);

        // Critter sub-classes
        frame.add(30, Bear.class);
        frame.add(30, Lion.class);
        frame.add(30, Giant.class);

        frame.add(30, FlyTrap.class);
        frame.add(30, Food.class);

        frame.start();
    }
}
