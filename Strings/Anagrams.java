// when 2 Strings contains same characters in diff order . 
package Strings;

import java.util.Arrays;
import java.util.HashMap;

public class Anagrams {
    public static boolean validAnagram(String s, String t) {
        // Brute Force
        // this is from using inbuilt sorting
        // TC = nlogn SC= O(n)
        // it will handle for both uppercase and lowercase
        s = s.toLowerCase();
        t = t.toLowerCase();
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        return Arrays.equals(s1, t1);
    }

    public static boolean isAnagram(String s, String t) {
        // Using HashMap , Optimise
        // TC = O(n) SC=O(1)
        if (s.length() != t.length()) {
            return false;
        }
        // here size of map is all characters ie: 26 letters so can say we have constant
        // space
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (!map.containsKey(ch)) {
                return false;
            }

            // Decrease the frequency of char by one
            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }
        // If the map is empty, it means s and t have the same characters and
        // frequencies

        return map.isEmpty();
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
        System.out.println(validAnagram(s, t));
    }
}
