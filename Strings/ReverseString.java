package Strings;

public class ReverseString {
    public static String reverseString(String str){
        // TC = O(N) SC= O(N)
        StringBuilder rev = new StringBuilder("");
        for(int i= str.length()-1; i>=0; i--){
            rev.append(str.charAt(i));
        }
        return rev.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseString("shaili"));
    }
}
