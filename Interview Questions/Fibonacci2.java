public class Fibonacci2 {

    static int nthFibonacci(int n) {
        // print nth fibonacci number

        int a = 0; // zero fib number
        int b = 1; // first fib number

        // base cases
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }
        int c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    static long[] firstNFibonacciNum(int n) {
        // Program to Print Fibonacci Series till n in Java

        // Given a number N, find the first N Fibonacci numbers. The first two number of
        // the series are 1 and 1.

        long[] ans = new long[n];
        ans[0] = 1;

        if (n == 1) {
            return ans;
        }
        ans[1] = 1;
        for (int i = 2; i < n; i++) {
            ans[i] = ans[i - 1] + ans[i - 2];
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(nthFibonacci(10));
        long[] printFib = firstNFibonacciNum(10);
        for (long i : printFib) {
            System.out.print(i + "    ");
        }
    }
}
