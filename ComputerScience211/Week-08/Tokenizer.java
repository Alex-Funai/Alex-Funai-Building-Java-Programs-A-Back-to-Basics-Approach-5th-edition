// CS 211 HW 8
//   Tokenizer reads input string and split it into valid tokens
//
//   Please don't modify!

import java.util.*;

public class Tokenizer {
    private String token = null;
    private Queue<Character> characters = new LinkedList<>();
    private String symbols = "()+-*/";
    
    public Tokenizer(String input){
        for(Character c: input.toCharArray()) {
            characters.add(c);
        }
        findNextToken();
    }
    
    public boolean hasNextToken() {
        return token != null;
    }
    
    public String nextToken() {
        if(!hasNextToken()) {
            return null;
        } else {
            String result = token;
            findNextToken();
            return result;
        }
    }
    
    private void findNextToken() {
        while(!characters.isEmpty() && Character.isWhitespace(characters.peek())) {
            characters.remove();
        }
        if(characters.isEmpty()) {
            token = null; 
        } else {
            token = "" + characters.remove();
            if(!symbols.contains(token)) {
                while(!characters.isEmpty() && 
                    !Character.isWhitespace(characters.peek()) && 
                    symbols.indexOf(characters.peek()) < 0
                ) {
                    token = token + characters.remove();
                }        
            }
        }
    }
}