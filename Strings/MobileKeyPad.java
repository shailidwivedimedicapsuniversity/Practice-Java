// Convert a sentence into its equivalent mobile numeric keypad sequence
package Strings;

public class MobileKeyPad {
    static String printSequence(String s) {
        // array to store 26 mobile alphabates(uppercase) in numbers
        // for A=2, B=22, C=222 ...
        String[] mobileKeypad = { "2", "22", "222", // A B C
                "3", "33", "333", // D E F
                "4", "44", "444", // G H I
                "5", "55", "555", // J K L
                "6", "66", "666", // M N O
                "7", "77", "777", "7777", // P Q R S
                "8", "88", "888", // T U V
                "9", "99", "999", "9999" // W X Y Z
        };

        StringBuilder ans = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                // for space = O
                ans.append("0");
            } else {
                ans.append(mobileKeypad[s.charAt(i) - 'A']);
                // ASCII value of 'A' is 65
                // A-A = 0 
                // B-A = 1
                // C-A = 2 and so on
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String S = "HEY U";
        System.out.println(printSequence(S));
    }
}
