//same letter come together:  aabbc a2b2c2
package Strings;

public class StringCompression {
    public static String compressString(String str) {
        StringBuilder ans = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            ans.append(str.charAt(i));
            ans.append(count);

        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String str = "aabbbc";
        System.out.println(compressString(str));
    }
}
