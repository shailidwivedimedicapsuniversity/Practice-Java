// all duplicate character in given string
package Strings;

import java.util.Arrays;
import java.util.HashMap;

public class PrintDuplicatesChar {
    public static void allDuplicatesCharacter(String str) {
        // TC = n SC=n
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : map.keySet()) {
            // travarse to all keys of map
            if (map.get(ch) > 1) {
                System.out.println(ch + ", count =  " + map.get(ch));
            }
        }
    }

    public static void printDuplicates(String str) {
        // TC=nlogn Sc=n
        // 1. Sort the string to find duplicates
        char[] ch = str.toCharArray();
        // str= "shaili" ,ch = [s,h,a,i,l,i]
        Arrays.sort(ch);
        // ch = [a,h,i,i,l,s]
        String ans = new String(ch);
        // ans = ahiils

        // 2. Traverse Loop the sorted string to find the duplicates.
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i < str.length() - 1 && ans.charAt(i) == ans.charAt(i + 1)) {
                count++;
                i++;
            }
            // print duplicate chars
            if (count > 1) {
                System.out.println(ans.charAt(i) + " " + count);
            }
        }

    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        allDuplicatesCharacter(s);
        printDuplicates(s);
    }

}
