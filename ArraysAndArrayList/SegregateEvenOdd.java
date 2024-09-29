package ArraysAndArrayList;

import java.util.Arrays;

public class SegregateEvenOdd {
    //Segregate Even and Odd numbers in sorted way
    static void segregateEvenOdd(int arr[]) {
         int n = arr.length;

        // Separate even and odd numbers
        int[] evens = new int[n];
        int[] odds = new int[n];
        int eIdx = 0, oIdx = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evens[eIdx++] = num;
            } else {
                odds[oIdx++] = num;
            }
        }

        // Sort even and odd arrays
        Arrays.sort(evens, 0, eIdx);
        Arrays.sort(odds, 0, oIdx);

        // Modify the original array
        int idx = 0;
        for (int i = 0; i < eIdx; i++) {
            arr[idx++] = evens[i];
        }
        for (int i = 0; i < oIdx; i++) {
            arr[idx++] = odds[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = {12, 34, 45, 9, 8, 90, 3};
        segregateEvenOdd(arr);
    }
}
