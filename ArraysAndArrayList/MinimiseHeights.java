// Not clear
// Given an array of tower heights arr[] and a positive integer K, modify each tower's height by either increasing or decreasing it by K. The goal is to minimize the difference between the tallest and shortest towers after the modifications, ensuring no tower has a negative height.
package ArraysAndArrayList;

import java.util.Arrays;

public class MinimiseHeights {

    public static int getMinDiff(int[] arr, int k) {
        // Step 1: Sort the array
        Arrays.sort(arr);
        int n = arr.length;
        // Initial difference between the largest and smallest towers without any
        // modifications for comparision
        int min = arr[0]; // Smallest height (before any modifications)
        int max = arr[n - 1]; // Largest height (before any modifications)
        int diff = arr[n - 1] - arr[0]; // Initial height difference

        // Step 2: Loop through the array to try minimizing the height difference
        for (int i = 1; i < n; i++) {
            //don't want negative tower height
            if ((arr[i] - k) < 0) {
                continue;
            }

            // Either we reduce the largest tower by k, or increase the previous tower by k
            max = Math.max(arr[n - 1] - k, arr[i - 1] + k);

            // Calculate the minimum height by either increasing the smallest tower or
            // reducing the current one
            min = Math.min(arr[0] + k, arr[i] - k);

            // Update the minimum difference after comparing with the current `max - min`
            diff = Math.min(diff, max - min);
        }

        return diff;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 4, 8, 8, 8, 9 };
        int k = 6;
        int ans = getMinDiff(arr, k);
        System.out.println(ans);
    }
}
