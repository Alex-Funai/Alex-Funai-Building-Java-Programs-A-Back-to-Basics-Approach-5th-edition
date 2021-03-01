// Alexander Funai
// CS211 Assignment 2 - ArticleReverser

/*  This program reads in a .txt file, and prints the text normally/reversed
 *  I should probably revisit this problem in the future, because there must be a better way of doing this.
 *
 */
import java.io.*;
import java.util.*;

public class ArticleReverser {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("GoAllTheWay.txt");

        ArticleReverser r = new ArticleReverser();
        r.readLines(f);

        System.out.println("--- the Original article ---\n");
        r.print();

        System.out.println("\n--- now Reversed ---");
        r.reversePrint();

    }

    private List<List<String>> lines = new ArrayList<List<String>>();


    public void readLines(File inputFile) throws FileNotFoundException {

        ArrayList<String> poem = new ArrayList<String>();

        Scanner input = new Scanner(new File("GoAllTheWay.txt"));

        while (input.hasNext()) {
            String word = input.next();
            poem.add(word);
        }
    }

    // Method to normally print .txt file.
    public void print() throws FileNotFoundException {

        Scanner input2 = new Scanner(new File("GoAllTheWay.txt"));

        while (input2.hasNextLine()) {
            System.out.println(input2.nextLine());
        }
    }

    // Method to reverse print .txt file
    public void reversePrint() throws FileNotFoundException {

        ArrayList<String> poem2 = new ArrayList<String>();

        Scanner input2 = new Scanner (new File("GoAllTheWay.txt"));

        while (input2.hasNext()) {
            String word2 = input2.next();
            poem2.add(word2);
        }
        // Reverse method to re-arrange GoAllTheWay.txt backwards.
        Collections.reverse(poem2);
        System.out.println(poem2);
    }
}


