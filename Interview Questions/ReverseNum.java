public class ReverseNum {
    public static void main(String[] args) {
        int n = 123;
        int rev = 0;
        while (n!=0) {
            int ls = n%10;
            rev = (rev*10) + ls;
            n = n/10;
        }
        System.out.println(rev);
    }
}
