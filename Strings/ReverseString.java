package Strings;

public class ReverseString {
    public static String reverseString(String str){
        // brute force
        // TC = O(N) SC= O(N)
        StringBuilder rev = new StringBuilder("");
        for(int i= str.length()-1; i>=0; i--){
            rev.append(str.charAt(i));
        }
        return rev.toString();
    }
    public static String reverseStringOptimise(String str) {
        // in-place reversal using a two-pointer technique
        //Time complexy O(n) space = O(1)
        char[] s = str.toCharArray();
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            // Swap the characters
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        return new String(s);
    }
    public static void main(String[] args) {
        System.out.println(reverseString("shaili"));
        System.out.println(reverseStringOptimise("shaili dwivedi"));
        
    }
}
