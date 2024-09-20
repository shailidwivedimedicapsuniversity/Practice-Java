// make first letter of every world capital
package Strings;

public class Capitalize {
    public static String toCapitalize(String str){
        StringBuilder sb = new StringBuilder("");
        // make first letter capital
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==' ' && i<str.length()){
                // add spaces between words
                sb.append(str.charAt(i));
                i++;
                // find first word after space
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "i am shaili dwivedi, i am from rewa madhya-pradesh";
        System.out.println(toCapitalize(str));
    }
}
