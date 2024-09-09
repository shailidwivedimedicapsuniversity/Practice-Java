import java.util.ArrayList;
import java.util.List;

public class CheckPrimeNum {

    public static boolean isPrimeNumber(int n) {
        // check if a number is prime or not
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> countPrimeNumbers(int n) {
        // Given an integer n, return the prime numbers that are strictly less than n
        // and their count.
        ArrayList<Integer> list = new ArrayList<>();
        if (n <= 2) {
            return list;
        }
        for (int i = 2; i < n; i++) {
            if (isPrimeNumber(i)) {
                list.add(i);
            }
        }
        System.out.println("count of prime numbers " + list.size());
        return list;

    }

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(1103));
        System.out.println(countPrimeNumbers(10));
    }
}
