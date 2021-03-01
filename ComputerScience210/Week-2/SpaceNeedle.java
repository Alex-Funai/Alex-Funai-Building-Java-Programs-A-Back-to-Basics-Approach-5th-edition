// CS210 Assignment #2 "Space Needle"
// Alexander K Funai

/*
This program prints a Space Needle figure.
*/

public class SpaceNeedle {
    public static final int LINES = 4;
    
    public static void main (String[] args) {
  
        Stem();
        Dome_Top();
        Core();
        Dome_Bot();
        Stem();
        Stem_2();
        Dome_Top();
        Core();
    }
    
    // Declaring and Defining the SpaceNeedle 
    public static void Stem() {
        
        for (int i = 1; i <= LINES; i++) {
            for (int j = 1; j <= LINES * 3; j++) {
                System.out.print(" "); 
            }
            System.out.print("||");
            System.out.println();   
        }
    }
    
    // Declaring and defining upwards dome shape to be printed.
    public static void Dome_Top() {
        
        for (int i = 1; i <= LINES; i++) {
            for (int j = 1; j <= 3 * LINES - 3 * i; j++) {
                System.out.print(" ");
            }
                System.out.print("__/"); {
                
            for (int j = 1; j <= -3 + i * 3 ; j++) {
                    System.out.print(":");
            }
                System.out.print("||");
                
            for (int j = 1; j <= -3 + i * 3 ; j++) {
                    System.out.print(":");
                }
                System.out.print("\\__\n");
            }
        } 
    }
    
    // Declaring and defining the Dome's bottom figure to be printed.
    public static void Dome_Bot() {
        
        for (int i = 1; i <= LINES; i++) {
            for (int j = 1; j <= -2 + i * 2; j++) {     
            System.out.print(" "); 
        }
            System.out.print("\\_/"); {
        }
            for (int j = 1; j <= -2 * i + LINES * 2 + LINES; j++) {
                System.out.print("\\/");
            }
            System.out.print("\\_/\n");
        }       
    }


    // Declaring and defining wide Core figure to be printed.
    public static void Core() {
        
        System.out.print("|");
        
        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= LINES * 6; j++ ) {
                System.out.print("\"");          
            }
            System.out.print("|\n");
        }
    }
    
    // Declaring and defining thicker Stem_2() figure to be printed.
    public static void Stem_2() {
        
        for (int i = 1; i <= LINES * LINES; i++) {
            for (int j = 1; j <= LINES * 2 + 1; j++){
                System.out.print(" ");
            }
            
            System.out.print("|");
            
            for (int j = 1; j <= LINES - 2; j++) {
                System.out.print("%"); 
            }
            
            System.out.print("||");
            
            for (int j = 1; j <= LINES - 2; j++) {
                System.out.print("%");
            }
            
            System.out.print("|");
            System.out.println();
        }
    }

}

    

