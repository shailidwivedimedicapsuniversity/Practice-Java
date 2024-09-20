// program to print all non repeating characters in a string
// count occurance of each character in string 
package Strings;

import java.util.HashMap;

public class NonRepeatingCharacters {
    public static void printNonRepeatingChars(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Count the occurrences of each character
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Print non-repeating characters
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                System.out.print(ch + " ");
            }
        }
        System.out.println();
        // System.out.println("Repeating words: ");
        // for (char ch : str.toCharArray()) {
        //     if (map.get(ch) > 1) {
        //         System.out.print(ch + " ");
        //     }
        // }
        // System.out.println();
    }

    public static void main(String[] args) {
        String str = "shaili dwivedi";
        System.out.println("Non-repeating characters in \"" + str + "\":");
        printNonRepeatingChars(str);
    }

}
