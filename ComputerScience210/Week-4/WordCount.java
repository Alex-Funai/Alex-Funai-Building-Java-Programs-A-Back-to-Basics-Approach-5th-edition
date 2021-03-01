// CS210 Winnie Li  Assignment 4 "WordCount"
// Alexander Funai 


package WordCount;

/*
This program counts the number of words declared in String "input" [main],
and then prints the the number of strings as an integer declared wordCounts.
*/

public class WordCount{
    
    public static void main (String [] args) {
        
        // Declaring and defining string to be counted.
        String input = "Hello there bob";
        
        // Declaring and defining wordCounts as int.. Inputs String "input"
        int wordCounts = wordCounts(input);
        
        // Prints number of words 
        System.out.println(wordCounts);
    }
    
    public static int wordCounts (String inputString) {
        int wordCounts = 0;
        char firstChar = inputString.charAt(0);
        
        if (firstChar != ' ') {
            wordCounts++;
        }
        
        for (int i = 1; i < inputString.length(); i++) {
            char secondChar = inputString.charAt(i);
            if (firstChar == ' ' && secondChar != ' ') {
                wordCounts++;
            }
            firstChar = secondChar;
        }        
        return wordCounts;
    }
}
