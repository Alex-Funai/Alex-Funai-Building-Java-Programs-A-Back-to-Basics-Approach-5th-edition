import java.util.Arrays;


import java.util.*;
import java.io.*;
class LetterInventory {

    private String input;

//stores the original word.

    public LetterInventory(String input) {
        this.input = input;
    }

    public String getCanonical() {
        input = input.toLowerCase(); // converting input to lower case
        char [] word = input.toCharArray();
        Arrays.sort(word);
        String sorted = new String (word);
        return sorted;

    }
}