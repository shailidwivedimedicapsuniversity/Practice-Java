import java.util.List;

public class LcmGcd4 {
    public static void findLcmAndGcd(int a, int b) {
        int c = a * b;
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else if (b > a) {
                b = b % a;
            }
        }
        int gcd = a + b; // either a is 0 or b
        int lcm = c / gcd; // GCD*LCM = a*b
        System.out.println("Lcm = " + lcm);
        System.out.println("Gcd = " + gcd);

    }

    public static void main(String[] args) {
        int a = 5;
        int b = 25;
        findLcmAndGcd(a, b);
    }
}
