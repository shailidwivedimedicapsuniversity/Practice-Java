// Input: strs = ["flower","flow","flight"] Output: "fl"
package Strings;

import java.util.Arrays;

public class LongestCommonPrefix {
       public static String longestCommonPrefix(String[] strs) {
        // 1. sort array in lexicolgraphically
        Arrays.sort(strs);
        //2.convert first and last string to char array
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();
        // 3. compare first and last 
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<first.length; i++){
            if(first[i]!=last[i]){
                break;
            }
            ans.append(first[i]);
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String strs[] = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }
}
