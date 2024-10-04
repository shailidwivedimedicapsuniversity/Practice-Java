// here all valid strings are given, having matching opening '(' and closing ')' 
//brackets, and no empty parentheses like '()'.
import java.util.Stack;

public class DuplicateParenthesis {

    public static boolean duplicateParanthesis(String str) {
        // Approach - The algorithm uses a stack to push everything in stack but When it
        // finds a closing bracket, it checks if there are any characters between it and
        // the opening bracket than not duplicates; if not, it identifies duplicate
        // parentheses.
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // If we found a closing parenthesis
            if (ch == ')') {
                int count = 0; // number of elements inside parentheses

                // Pop elements until find the matching opening parenthesis '('
                while (s.peek() != '(') {
                    s.pop();
                    count++; // Count the number of items between '(' and ')'
                }

                if (count == 0) {// no elements between brackets
                    return true; // Duplicate parentheses found
                } else {
                    s.pop(); // Pop the matching opening parenthesis '('
                }

            } else {
                // Push all characters (except closing parenthesis) onto the stack
                s.push(ch);
            }
        }
        // No duplicate parentheses found
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b)+((c+d)))";
        System.out.println(duplicateParanthesis(str));
    }

}
