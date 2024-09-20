package Strings;

import java.util.HashMap;

public class CharacterOccurance {
    public static void printCharacterOccurrences(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        // Count the occurrences of each character TC=O(n) SC=O(n)
        for (char ch : str.toCharArray()) {
            if (ch == ' ') 
                continue;
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(str+ " : "+ map);
    }

    public static void main(String[] args) {
        String str = "shaili dwivedi";
        System.out.println("Occurance of each character in \"" + str + "\":");
        printCharacterOccurrences(str);
    }
}
