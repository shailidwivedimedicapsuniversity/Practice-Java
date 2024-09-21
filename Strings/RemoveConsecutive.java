// remove adjacent duplicates like if s[i] is equal to s[i-1] in the string
package Strings;

public class RemoveConsecutive {
    public static String removeConsecutiveCharacter(String s){
        // TC=n SC= n
        StringBuilder ans = new StringBuilder();
        ans.append(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String str = "aabaa";
        System.out.println(removeConsecutiveCharacter(str));
    }
}
