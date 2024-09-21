// we can do these questions easily without stack but for stack understanding i am doing .
import java.util.Stack;

public class ReverseString {
    // reverse an array of chars
    public static void reverseCharArray(char[] s) {
        //reverse an array of characters
        Stack<Character> st = new Stack();
        for (char c : s) {
            st.push(c);
        }
        int i = 0;
        while (!st.isEmpty()) {
            s[i++] = st.pop();
        }
    }
    public static int[] reverseNumArray(int[] arr) {
        Stack<Integer> st = new Stack();
        // for each loop works with only collections or array , not with string
        for (int c : arr) {
            st.push(c);
        }
        int i = 0;
        while (!st.isEmpty()) {
            arr[i++] = st.pop();
        }
        return arr;
    }
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int i = 0;
        while (i<str.length()) {
            s.push(str.charAt(i));
            i++;
        }
        i=0;
        //Strings are immutable so we can't directly change origional string
        StringBuilder ans = new StringBuilder();
        while (!s.isEmpty()) {
            ans.append(s.pop());
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        //reverse array of chars
        reverseCharArray(s);
        for (char c : s) {
            System.out.print(c + "  ");
        }
        System.out.println();
        int arr[] = {1,2,3,5,7};
        // reverse array of numbers
        reverseNumArray(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
        String str = "shaili dwivedi";
        System.out.println(reverseString(str));
    }
}
