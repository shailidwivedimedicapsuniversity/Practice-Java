// Given an array arr containing only 0s, 1s, and 2s. Sort the array in ascending order.
package ArraysAndArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sort012 {

    public static void sort012BruteForce(ArrayList<Integer> arr) {
        // brute force Tc = O(nlogn)
        // Function to sort an array of 0s, 1s, and 2s
        Collections.sort(arr);
    }

    public static void sort012Better(ArrayList<Integer> arr) {
        // TC = O(n) SC = O(1)
        int n = arr.size();
        int c0 = 0, c1 = 0, c2 = 0;

        // First pass: Count the number of 0s, 1s, and 2s
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == 0) {
                c0++;
            } else if (arr.get(i) == 1) {
                c1++;
            } else if (arr.get(i) == 2) {
                c2++;
            }
        }

        // Second pass: Update the array based on the counts
        for (int i = 0; i < c0; i++) {
            arr.set(i, 0);
        }
        for (int i = c0; i < c0 + c1; i++) {
            arr.set(i, 1);
        }
        for (int i = c0 + c1; i < n; i++) {
            arr.set(i, 2);
        }
    }

    public static void printList(ArrayList<Integer> arr) {
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 0, 2, 1, 2, 0 };
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        printList(list);
        // sort012BruteForce(list);
        sort012Better(list);
        printList(list);
    }
}
