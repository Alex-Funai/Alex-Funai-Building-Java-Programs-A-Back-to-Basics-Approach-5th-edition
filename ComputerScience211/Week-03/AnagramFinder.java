// CS211 HW3
// Alexander Funai

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AnagramFinder {
    public static void main(String[] args) throws FileNotFoundException {
        String[] originals = new String[]{
                "realfun",
                "mias",
                "EVIL",
                "unable",
                "Silent",
                "AliBaba"
        };

        for (String original : originals) {
            LetterInventory inv = new LetterInventory(original);
            System.out.println("Original: " + original + ", Canonical: " + inv.getCanonical());
        }

        System.out.println("\n");

        File f = new File("HW_sample_dict.txt");

        AnagramFinder finder = new AnagramFinder(f);

        for (String original : originals) {
            finder.printAnagrams(original);
        }
    }

    ArrayList<String> dictionary_array = new ArrayList<>(); //to store words of dict.txt

    public AnagramFinder(File f) throws FileNotFoundException {

        Scanner console = new Scanner(f);
        while (console.hasNextLine())
            dictionary_array.add(console.nextLine());

    }

    public void printAnagrams(String word) {

        Map map = new HashMap();
        for (int i = 0; i < dictionary_array.size(); i++) {
            ArrayList<String> arr = new ArrayList<String>();
            if (!(arr.contains(dictionary_array.get(i)))) {
                for (int j = 0; j < dictionary_array.size(); j++) {
                    if ((dictionary_array.get(i)).equals(dictionary_array.get(j)) == true) {
                        char[] i_array = (dictionary_array.get(i)).toCharArray();
                        char[] j_array = (dictionary_array.get(j)).toCharArray();
                        Arrays.sort(i_array);
                        Arrays.sort(j_array);
                        int count = 0;
                        if (i_array.length == j_array.length) {
                            for (int p = 0; p < i_array.length; p++) {
                                if (i_array[p] == j_array[p])
                                    count++;
                            }
                        }
                        if (count == i_array.length) {
                            arr.add(dictionary_array.get(j));
                        }
                    }
                }
                arr.add(dictionary_array.get(i));
                LetterInventory inv2 = new LetterInventory(dictionary_array.get(i));
                String a = inv2.getCanonical();
                map.put(a, arr);
            }
        }
        LetterInventory inv3 = new LetterInventory(word);
        String e = inv3.getCanonical();
        if (map.get(e) == null)
            System.out.println("Your input was: " + word + " " + "No anagrams were found.");
        else {
            System.out.println("Your input was: " + word + " " + "Anagrams were found: " + map.get(e));
        }
    }
}