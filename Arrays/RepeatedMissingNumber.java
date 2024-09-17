// Repeat and Missing Number in Array
// You are given a read only array of n integers from 1 to n.
// Each integer appears exactly once except A which appears twice and B which is missing.
package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RepeatedMissingNumber {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static ArrayList<Integer> repeatedNumberBruteForce(final List<Integer> A) {
        // This is brute force appraoch
        // TC = O(n^2) SC = O(1)
        int n = A.size();
        int repeating = -1;
        int missing = -1;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (A.get(j) == i) {
                    count++;
                }
            }
            if (count == 2) {
                repeating = i;
            } else if (count == 0) {
                missing = i;
            }
            if (repeating != -1 && missing != -1) {
                break;
            }
        }
        ArrayList<Integer> list = new ArrayList();
        list.add(repeating);
        list.add(missing);
        return list;
    }

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static ArrayList<Integer> repeatedNumberBetter(final List<Integer> A) {
        // Better , TC= O(n), SC = O(n)
        // Using HashMap to store occurrences
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count occurrences of each number
        for (int i = 0; i < A.size(); i++) {
            map.put(A.get(i), map.getOrDefault(A.get(i), 0) + 1);
        }

        int a = -1; // Variable to store the repeating number
        int b = -1; // Variable to store the missing number

        // Step 2: Find the repeating and missing numbers in one loop
        for (int i = 1; i <= A.size(); i++) {
            if (!map.containsKey(i)) {
                b = i; // Missing number
            } else if (map.get(i) == 2) {
                a = i; // Repeating number
            }
            // Break early if both are found
            if (a != -1 && b != -1) {
                break;
            }
        }

        // Step 3: Add the results to the list and return
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a); // Repeating number
        list.add(b); // Missing number
        return list;
    }

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static ArrayList<Integer> repeatedNumberOptimise(final List<Integer> A) {
        // TC = O(n) SC = O(1)
        long n = A.size();
        // Step 1: Calculate the sum and sum of squares of first n natural numbers
        long sn = (n * (n + 1)) / 2;
        long sn2 = (n * (n + 1) * (2 * n + 1)) / 6;
        // Step 2: Calculate the actual sum and sum of squares of all elements of the
        // ArrayList
        long sa = 0; // sum of array
        long sa2 = 0;
        for (int i = 0; i < n; i++) {
            sa += A.get(i);
            sa2 += (long) A.get(i) * (long) A.get(i);
        }
        // Step 3: Calculate the difference between expected and actual sum
        // x = repeating , y = missing
        long val1 = sa - sn;// x-y
        long val2 = sa2 - sn2;// x^2 - y^2
        // Step 4: Use the equations to solve for X and Y
        long val3 = val2 / val1; // (x-y)*(x+y)/ (x-y) ; x+y
        long x = (val3 + val1) / 2; // x-y = val1 , x+y = val3 added these
        long y = x - val1;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add((int) x);
        ans.add((int) y);
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 2, 5, 3 };
        ArrayList<Integer> A = new ArrayList<>();
        for (int i : arr) {
            A.add(i);
        }
        System.out.println(repeatedNumberBetter(A));
        System.out.println(repeatedNumberBruteForce(A));
        System.out.println(repeatedNumberOptimise(A));
    }
}
