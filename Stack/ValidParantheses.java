import java.util.*;

public class ValidParantheses {

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch); // push opening brackets only
            } else if (st.isEmpty()) {
                return false;
                // if stack is empty then only opening brackets can come in stack
            } else if (st.peek() == '(' && ch == ')' ||
                    st.peek() == '{' && ch == '}' || st.peek() == '[' && ch == ']') {
                // Open brackets must be closed in the correct order.
                st.pop(); // remove opening bracket from stack
            } else {
                // if stack is not empty then correct order is not followed
                return false;
            }
        }
        // because when ony one char in string like "[" then return false;
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String str =  "()[]{}";
        System.out.println(isValid(str));
    }
}