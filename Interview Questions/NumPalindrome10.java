public class NumPalindrome10 {
    //  check a number is palindrom or not 
    public static boolean isPalindrome(int num){
        int n = num;
        int rev = 0;
        while (n!=0) {
            rev = rev*10 + (n%10);
            n/= 10;
        }
        if(rev==num){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }
}
