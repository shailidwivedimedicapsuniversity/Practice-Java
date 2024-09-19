// reverse each word in a string 
package Strings;

public class ReverseWords {
    public static String reverseWords(String str){
        int i= str.length()-1;
        StringBuilder ans = new StringBuilder("");
        while (i>=0) {
            while (i>=0 && str.charAt(i)==' ') {
                i--; // skip spaces
            }
            int j = i; // first letter from last found here
            if(i<0){
                break;
            } 
            while (i>=0 && str.charAt(i)!=' ') {
                i--;
            }
            if(ans.isEmpty()){
                ans.append(str.substring(i+1, j+1));
            }else{
                ans.append(" "+ str.substring(i+1, j+1));
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String  s = "sky is blue";
        System.out.println(reverseWords(s));
    }
}
