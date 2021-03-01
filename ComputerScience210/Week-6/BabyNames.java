// CS210 Assignment #6 "baby names"
// Alexander Funai
/* This program utilizes token and line based processing. The program searches
"names.txt" for a name, and returns popularity ranking values for decades 1920+
*/

import java.util.*;
import java.io.*;

public class BabyNames {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        // Introduction and scanner intialiation to accept input.
        System.out.println("** Popularity of a baby name since year 1920 **");
        System.out.println("name? ");
        Scanner console = new Scanner(System.in);
        String name = (console.next());
        
        // Initialize new scanner to reference "names.txt"
        Scanner names = new Scanner(new File("names.txt"));
        String found = search(names, name);
        if (found.length() == 0) {
            System.out.println("not found.");
       }
   }

   // Create new text file ada.txt for output.
    public static String search(Scanner inputfile, String inputName) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("ada.txt");          
        
        while(inputfile.hasNextLine()) {
            String lName = inputName.toLowerCase();
            String lLine = inputfile.nextLine();
            String lowercaseLine = lLine.toLowerCase();
          
            if(lowercaseLine.indexOf(lName) == 0 && lowercaseLine.charAt(lName.length()) == ' ') {
                int year = 1920;
                int start = lName.length();
                int end = start+1;


                while(end != lowercaseLine.length()){
                    if(lowercaseLine.charAt(end) == ' '){
                        String sub = lowercaseLine.substring(start,end);
                        String result = String.valueOf(year) + ": " + sub;
                        System.out.println(year + ": " + sub);
                        writer.println(result);
                        year = year + 10;
                        start = end;
                    }

                    end++;
                }
                String sub = lowercaseLine.substring(start,end);
                String result = String.valueOf(year) + ": " + sub;
                System.out.println(year + ": " + sub);
                writer.println(result);
                writer.close();
                return lLine;
            }
        }
        return "";
    }



  


}
