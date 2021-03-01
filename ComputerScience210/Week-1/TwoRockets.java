// CS210 Assignment #1
// Alexander K Funai

//Program to print figures using prinln static statements.

//Destructured initial output to eliminate redundancy and (++) eligibility. 

public class Chapter1Ex11{
    public static void main(String[] args) {
        Triangle();
        Square();
        Banner();
        Square();
        Triangle();
    }
    
    //Declaring and defining the triangle shape to be printed.
    public static void Triangle(){
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
    }
    
    //Declaring and defining the square shape to be printed.
    public static void Square(){
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }
    
    //Declaring and defining the USA banner-like shape to be printed.
    public static void Banner(){
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
    }
}