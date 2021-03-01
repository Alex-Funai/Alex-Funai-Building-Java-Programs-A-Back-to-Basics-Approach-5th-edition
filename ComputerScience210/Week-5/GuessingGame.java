//CS210 Assignment 5 "GuessingGame"
// Alexander Funai

/* This program utilizes Scanner intialize an integer io guessing game with the
 * user.  The program utilizes loops to give hints, and keeps track of total
 * games/guesses/best-game and prints those results when user ends game.
 */ 
 

import java.util.*;

public class GuessingGame {
    
    public static void main(String [] args) {     
        
        // Initializing scanner for user input
        Scanner console = new Scanner(System.in);
        
        
        // Pick a random integer between 0-99 inclusive
        Random rand = new Random();
        int answer = rand.nextInt(100) + 1;
        int totalGames = 0;
        int totalGuesses = 1;
        String x;
        Boolean play = true;
        
        // Get first guess
        while (play) {
        System.out.println("Guess an integer between 1 and 100");
        System.out.println("Your guess? ");
        int guess = console.nextInt();
        
        // Initialize loop that gives hints until correct answer is guessed.
        while (guess != answer) {
            if (guess > answer) {
                System.out.println("It's Lower");
                System.out.println("Your guess? ");
                totalGuesses++;
                guess = console.nextInt();
            } else {
                System.out.println("It's higher");
                System.out.println("Your guess?");
                totalGuesses++;                
                guess = console.nextInt(); 
            }
        }
        // Reward & Replay
        
        System.out.println("Correct in " + totalGuesses + " guesses");
        totalGames++;       
        System.out.println("Play again?");
        String response = console.next();
        response = response.toLowerCase(); 
        char response1 = response.charAt(0);
        
        
        // If game ends then print these results.
        if (response1 != 'y') {  
            play = false;  
            double guessgame = ((double) totalGuesses / totalGames);
            System.out.println("Your Overall results:");
            System.out.println("Total games = " + totalGames);
            System.out.println("Total guesses = " + totalGuesses);
            System.out.println("Guesses/Game = " + guessgame);
        }
        }
   }
}
            
        
        

    

        

        
    
    