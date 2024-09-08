// check valid anagrams or not

import java.util.HashMap;

public class Practice4 {

    public static boolean isAnagrams(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        //1. add (char, frequency) of s in map
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        //2. traverse on t , if character is present in hashmap then decrease it's frequency
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.get(ch) != null) {
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                return false;
            }
        }
        //3. if it is anagram then whole hashmap will be empty at last, and return true
        return map.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println("Checking Valid Anagrams");
        String a = "race";
        String b = "care";
        System.out.println(isAnagrams(a, b));

    }
}
