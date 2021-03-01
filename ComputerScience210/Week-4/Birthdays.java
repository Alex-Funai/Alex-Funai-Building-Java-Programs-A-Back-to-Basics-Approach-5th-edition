// CS210 Assignment #4 "Birthdays"
// Alexander Funai

/*
This program prompts the user for the current date, and two user birthdays. The
program then outputs various conditional messages to the user regarding bdays.

The program utilizes Scanner for input, and then asks the user to input integers
for the dates. The program then runs conditional else if statements to output,
the messages to the user.
*/

package BIRTHDAYS;
import java.util.Scanner;


public class Birthdays {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int Month, Day, b1Day, b1Month, b2Day, b2Month;
    
    // Prompt user to enter todays date.
    System.out.println("Please enter today’s date (month day)");
    Month = in.nextInt();
    Day = in.nextInt();
    System.out.println("Today is " + formatDay(Month, Day)+ ", day #" + countDay(Month, Day) + " of the year.");
    System.out.println();
    // Prompts the user to enter the first persons birthday.
    System.out.println("Please enter person #1’s birthday (month day)");
    b1Month = in.nextInt();
    b1Day = in.nextInt();

    
    // Initiates conditional statements.
    if (Month==b1Month && Day==b1Day) {
    	System.out.println("Happy Birthday! :)");
    } else {
    System.out.println(formatDay(b1Month, b1Day) + " falls on day #" + countDay(b1Month, b1Day) + " of 365.");
    System.out.println ("Your next birthday is in " + Math.abs(daysTill (b1Month, b1Day ) - countDay(Month, Day)) + " day(s).");
    }
    System.out.println();
    
        
    // Prompts the user to get the second person's birthday.
    System.out.println("Please enter person #2’s birthday (month day)");
    b2Month = in.nextInt();
    b2Day = in.nextInt();
    if (Month==b2Month && Day==b2Day) {
    	System.out.println("Happy Birthday! :)");
    } else {
    System.out.println(formatDay(b2Month, b2Day) + " falls on day #"+ countDay(b2Month, b2Day) + " of 365.");
    System.out.println ("Your next birthday is in " + Math.abs(daysTill (b2Month, b2Day ) - countDay(Month, Day)) + " day(s).");
    }
    System.out.println();
    
    // Inititiates conditional a==b statements.
    String sooner = "";
    if (b2Month==b1Month && b2Day==b1Day) {
    	System.out.println("Wow, you share the same birthday! ^_^");
    } else if 
    	(daysTill (b1Month, b1Day) < daysTill (b2Month, b2Day)){
    	sooner = "1";
    } else {
    	sooner = "2";
    }  
    System.out.println("Person #" + sooner + "'s birthday is sooner.");
    System.out.println("\nOn April 7th 1992, the United States recognized the independence of Slovenia, Croatia, and Bosnia and Herzegovina. \nThe European Communities also recognized Bosnia and Herzegovina.");
  }
        
	private static int daysTill(int Month, int Day) {
		int bDateCount = Day;
		 
	    for (int i = 1; i < Month; i++)
	      {
	        //jan, mar, may, jul, aug, oct, dec
	        if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
	        {
	          bDateCount = bDateCount + 31;
	        }
	        //feb
	        if (i == 2)
	        {
	          bDateCount = bDateCount + 28;
	        }
	        //apr, jun, sept, nov
	        if (i == 4 || i == 6 || i == 9 || i == 11){
	          bDateCount = bDateCount + 30;
	        }
	      }
return bDateCount;
	}

	public static int countDay(int Month, int Day) {
		int currentDateCount = Day;
		  for (int i = 1; i < Month; i++)
	      {
	        //jan, mar, may, july, aug, oct, dec
	        if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
	        {
	          currentDateCount +=  31;
	        }
	        //feb
	        if (i == 2)
	        {
	          currentDateCount += + 28;
	        }
	        //apr, jun, sept, nov
	        if (i == 4 || i == 6 || i == 9 || i == 11)
	        {
	          currentDateCount +=  30;
	        }
	      }
		return currentDateCount ;
	}

	public static String formatDay(int month, int day) {
		return (month + "/" + day + "/2019");
	}
}
  

