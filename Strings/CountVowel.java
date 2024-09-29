// count vowels in a string
package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountVowel {
    public static int countVowel(String str) {
        // count total number of vowels present in string where only letters and space
        // are present , no special characters are present
        // TC = O(n) SC=O(1)
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // if (ch == ' ') {
            //     continue;
            // }
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static HashMap<Character, Integer> countVowelOccurance(String str) {
        str = str.toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', 0);
        map.put('e', 0);
        map.put('i', 0);
        map.put('o', 0);
        map.put('u', 0);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                // If it is a vowel, increase its count in the map
                map.put(ch, map.get(ch) + 1);
            }
        }

        return map;
    }

    public static void main(String[] args) {
        String str = "shaili dwivedi";
        // print count of vowels 
        System.out.println(countVowel(str));
        // print each vowel and it's occurance in map
        HashMap<Character, Integer> result = countVowelOccurance(str);
        System.out.println("Vowel counts: " + result);
    }
}
