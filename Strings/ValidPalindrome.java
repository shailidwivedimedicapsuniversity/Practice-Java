// valid palindrome
package Strings;

public class ValidPalindrome {
    public static boolean palindrome(String str) {
        // Check if a string is palindrome or not
        // TC = O(n) SC=O(1)
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome1(String s) {
        // after converting all uppercase letters into lowercase letters and removing
        // all non-alphanumeric characters, it reads the
        // same forward and backward. Alphanumeric characters include letters and
        // numbers.
        // Input: s = "A man, a plan, a canal: Panama" Output: true
        // Explanation: "amanaplanacanalpanama" is a palindrome.
        // TC = O(n) SC=O(n)

        s = s.toLowerCase();
        //using regex expression
        // for creating new string SC=O(n)
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i)!= s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
       
    }

    public static boolean isPalindrome2(String s) {
        // TC = O(N) SC= O(1)
        s = s.toLowerCase();
        int start = 0;
        int last = s.length() - 1;
        while (start <= last) {
            char firstChar = s.charAt(start);
            char lastChar = s.charAt(last);
            if (!Character.isLetterOrDigit(firstChar)) {
                start++;
            } else if (!Character.isLetterOrDigit(lastChar)) {
                last--;
            } else {
                // when Character.isLetterOrDigit(currFirst) &&
                // Character.isLetterOrDigit(currLast)
                if (firstChar != lastChar) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "MadaM";
        // this is to check for simple string palindrome
        System.out.println(palindrome(s1));
        String s2 = "A man, a plan, a canal: Panama";
        // this is to check for string palindrome with some conditions
        System.out.println(isPalindrome1(s2));

    }
}
