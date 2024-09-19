public class SquareRoot {
    public static int findSquareRoot(int n) {
        // Brute force approach to find the square root of a number
        // Linear Search TC= O(n) SC= O(1)
        int ans = 0;
        for (int i = 0; i <= n / 2; i++) {
            // If i*i is less than or equal to n, update answer
            // square root can be nearest possible integer if not accurate found
            if (i * i <= n) {
                ans = i;
            } else {
                // If i*i exceeds n, we have found the approximate square root
                break;
            }
        }
        return ans;
    }

    public static int getSquareRoot(int n) {
        // Optimise Approach: binary search to find the square root
        // TC =O(logn) SC = O(1)
        int si = 1, ei = n / 2, ans = 0;
        while (si <= ei) {
            int mid = (si + ei) / 2;
            // Check if mid*mid is exactly equal to n (perfect square case)
            if (mid * mid == n) {
                ans = mid; // exact square root
                break;
            }
            // If mid*mid is less than n, move right (search larger values)
            // But update ans with the current mid because it's the closest approximation
            else if (mid * mid < n) {
                ans = mid; // Store the nearest integer for non interger square root
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findSquareRoot(81));
        System.out.println(getSquareRoot(100));
    }
}
