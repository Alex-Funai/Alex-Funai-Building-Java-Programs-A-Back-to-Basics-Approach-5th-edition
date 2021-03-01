// CS210 Assignment #6 "Personality Test"
// Alexdander Funai

/* This program utilizes Scanner, file-reading, and arrays to input data from
 * "personality.txt". Answers are stored in 4 dimensions of array, and then
 *  Kerisey Personality test data for our fictional characters.
 */ 


import java.util.Scanner;
import java.io.*;
import java.util.Arrays;


    public class PersonalityTest {
        // [MAIN //
        public static void main (String [] args) throws FileNotFoundException {
            
            // Initial greeting messsage to user.
            System.out.println("** This program reports the results for Kerisey Personality Test**");       
            
            // Initialize Scanner to read in "personality.txt"
            Scanner input = new Scanner (new File ("personality.txt"));
            
            // Initialize loop to continue, as long as there is another line of input [Aka. read through "personality.txt
            while (input.hasNextLine()) {
                
                // Input the next string as the name
                String name = input.nextLine();
                // System.out.println("Currently doing computation for " + name);
                // Convert string so indiscriminate = nameAbsolute
                String nameAbsolute = input.nextLine().toUpperCase();
                
                // Initialize arrays for counting A/B answers, and allocates 4 index [EA: representing a "Personality Dimension" - Ex: group1, group2...] 
                int [] aCount = new int[4];
                int [] bCount = new int[4];
                


                // Loop for aCount, ?? into array
                for (int i = 0; i < nameAbsolute.length(); i++) {
                    char c = nameAbsolute.charAt(i);
                    if (c == 'A') {
                        
                        if(i%7 == 0) {   // this answer is for an Introvert/Extrovert question (group1).
                            aCount[0]++; //since the answer is A and in group1 we increase aCount[0] by 1.
                        } if(i%7 == 1 || i%7 == 2) //this answer is for Sensing/Intuition question (group2).
                        {
                            aCount[1]++;  //since the anwser is A and in group2 we increase Account[1] by 1.
                        }
                        if(i%7 == 3 || i%7 == 4) //this answer is for Thinking/Feeling question (group3).
                        {
                            aCount[2]++;  //since the answer is A and in group3 we increase aCount[2] by 1.
                        }

                        if(i%7 == 5 || i%7 == 6) //this answer is for Judging/Percieving question (group4)
                        {
                            aCount[3]++;  //since the answer is A and in group4 we increase aCount[3] by 1.
                        }
                    }
                      
                }

                // Loop for bCount, ?? into array
                for (int i = 0; i < nameAbsolute.length(); i++) {
                    char c = nameAbsolute.charAt(i);
                    if (c == 'B') {
                        if (i%7 == 0) { // this answer is for an Introvert/Extrover question (group1).
                            bCount[0]++; // since the answer is B and in group1 we increase bCount[0] by 1.
                        }
                        if (i%7 == 1 || i%7 == 2) { // this answer is for Sensing/Intuition question (group2).                        
                            bCount[1]++; // Since the answer is B and in group2 we increase bCount[0] by 1.
                        }
                        if(i%7 == 3 || i%7 == 4) { //this answer is for Thinking/Feeling question (group3).                        
                            bCount[2]++;  //since the answer is B and in group3 we increase bCount[2] by 1.
                        }
                        if(i%7 == 5 || i%7 == 6) { //this answer is for Judging/Percieving question (group4)                        
                            bCount[3]++;  //since the answer is B and in group4 we increase bCount[3] by 1.
                        }
                    }
                }
                // Initialize arrays for percentages -- This array stores the percentage of B for [EA: representing a "Personality Dimension" - Ex: group1, group2...] 
                // Create array x=4, and its named bPercent, and uses integers.
                int [] percentages = new int[4];
                for (int i = 0; i < 4; i++) {
                    percentages[i] = (100 *bCount[i] / (aCount[i] + bCount[i]));
                } 
                for (int i = 0; i < 4; i++) {
                    double j = percentages[i];
                    percentages[i] = (int) Math.round(j);
                }
                
//                for (int i = 0; i < 4; i++) {
//                    if (i == 0) {
//                        System.out.println("For dimension Extrovert/Introvert percentage of 'B' answers is: " + percentages[i] + "%");
//                    } if (i == 1) {
//                        System.out.println("For dimension Sensing/Intuition percentage of 'B' answers is " + percentages[i] + "%");
//                    } if (i == 2) {
//                        System.out.println("For dimension Thinking/Feeling percentage of 'B' answers is " + percentages[i] + "%");
//                    } if (i == 3) {
//                        System.out.println("For dimension of Judging/Perceiving percentage of 'B' answers is " + percentages[i] + "%");    
//                    }
//                }
//            }

        String [] pType = new String [4];  
        
        for (int i = 0; i < 4; i++) {
            
            if(percentages[i] > 50) {
                if (i == 0) {
                    pType[i] = "I";
                } else if (i == 1) {                    
                    pType[i] = "N";
                } else if (i == 2) {
                    pType[i] = "F";
                } else {
                    pType[i] = "P";
                }
            }
            
            else if (percentages[i] < 50) {
                if (i == 0) {
                    pType[i] = "E";
                } else if (i == 1) {
                    pType[i] = "S";
                } else if (i == 2) {
                    pType[i] = "T";
                } else {
                    pType[3] = "J";
                }
            } else {
                pType[i] = "X";
            }
        }
        
        // Prints out all the results
        System.out.println(name + ":");
       // System.out.print("answers: " + Arrays.toString(aCount) + "\n");
        System.out.println("answers: " + "["+aCount[0]+"A-"+bCount[0]+"B, "+aCount[1]+"A-"+bCount[1]+"B, "+aCount[2]+"A-"+bCount[2]+"B, "+aCount[3]+"A-"+bCount[3]+"B]"); 
        System.out.println("percent B: " + Arrays.toString(percentages));
        System.out.println("type: " + pType[0] + pType[1] + pType[2] + pType[3] + "\n");
        
        
        }
        } 

    }
        
        

            

