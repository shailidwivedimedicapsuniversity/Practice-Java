package Strings;

public class LargestString {
    public static void largestString(String[] str){
        // laxicography largest 
        String largest = str[0];
        for(int i=1; i<str.length; i++){
            if(largest.compareToIgnoreCase(str[i])<0){
                largest = str[i];
            }
        }
        System.out.println("Largest String is : "+ largest);
    }
    public static void main(String[] args) {
        String str[] = {"apple", "banana", "mango", "grapes"};
        largestString(str);
    }
}
