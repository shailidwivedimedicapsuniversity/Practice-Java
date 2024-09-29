package Strings;

public class CoutVowelConsonent {
    public static void main(String args[]){
        // TC = n SC = 1
        // String is only having vowel , consonent and space
        
        String str = "Shaili Dwivedi";
        str = str.toLowerCase();
        int countV = 0;
        int countC =0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch==' '){
                continue;
            }
            if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                countV++;
            }else{
                countC++;
            }
        }
        System.out.println("vowels count : "+ countV + " consonent count : " + countC);
    }
}
