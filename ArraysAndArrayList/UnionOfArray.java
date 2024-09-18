// Union of two arrays and return size of union array
//Elements are not necessarily distinct.
package ArraysAndArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionOfArray {
    public static int doUnion(int arr1[], int arr2[]) {
        // find size of union array using hashset, it will work in both in arrays are sorted or
        // unsorted.
        // it is the set containing distinct elements from both arrays. If there are
        // repetitions, then only one element occurrence should be there in the union.
        // Time O(n) Space O(n)
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr1) {
            set.add(i);
        }
        for (int i : arr2) {
            set.add(i);
        }
        // print union of array
        for (int num : set) {
            System.out.print(num + " ");
        }
        System.out.println();
        return set.size();
    }

    public static int doUnionSortedArray(int arr1[], int n, int arr2[], int m) {
        // this will only work when arrays are sorted
        int i = 0, j = 0;
        ArrayList<Integer> union = new ArrayList<>();
        // TC = O(n) SC = O(n)
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                union.add(arr1[i]);
                i++;
            } else if (arr2[j] < arr1[i]) {
                union.add(arr2[j]);
                j++;
            } else {
                union.add(arr1[i]);
                i++;
                j++;
            }
        }
        /* add remaining elements of the larger array */
        while (i < n)
            union.add(arr1[i++]);
        while (j < m)
            union.add(arr2[j++]);
        // print union of array
        for (int num : union) {
            System.out.print(num + " ");
        }
        System.out.println();

        return union.size();
    }

    public static void main(String[] args) {
        int arr1[] = { 85, 25, 1, 32, 54, 6 };
        int arr2[] = { 85, 2 };
        System.out.println(doUnion(arr1, arr2));
        int a1[] = { 1, 2, 1, 1, 2 };
        int a2[] = { 2, 2, 1, 2, 1 };
        System.out.println(doUnion(a1, a2));
        int arr3[] = { 1, 3, 4, 5, 7 };
        int arr4[] = { 2, 3, 5, 6 };
        System.out.println(doUnionSortedArray(arr3, 5, arr4, 4));

    }
}
