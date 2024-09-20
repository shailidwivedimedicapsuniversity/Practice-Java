// make first letter of every world capital
// Upper case conversion

package Strings;

public class Uppercase {
    public static String transform(String s) {
        // using extra space TC n , SC n
        StringBuilder ans = new StringBuilder("");
        ans.append(Character.toUpperCase(s.charAt(0)));

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && i < s.length() - 1) {
                ans.append(s.charAt(i)); // append space between words
                i++;
                ans.append(Character.toUpperCase(s.charAt(i)));
                // add first letter of word in uppercase
            } else {
                ans.append(s.charAt(i)); // add other letters of word
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String str = "i am shaili dwivedi, i am from rewa madhya-pradesh";
        System.out.println(transform(str));
    }
}
