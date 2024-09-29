// Union and Intersection of two sorted arrays

package ArraysAndArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class InterSectionOfArray {
    // Intersection of two unsorted/sorted arrays
    public static int intersectionOfArrays(int a[], int b[], int n, int m) {
        // brute force approach TC=O(N^2)
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i] == b[j]) {
                    list.add(a[i]);
                    break;
                }
            }
        }
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        return list.size();
    }

    public static int intersection(int a[], int b[], int n, int m) {
        // better 
        // Tc = O(n) SC= O(n)
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        ArrayList<Integer> intersection = new ArrayList<>();
        // int count = 0;
        for (int i = 0; i < b.length; i++) {
            if (set.contains(b[i])) {
                // count++;
                intersection.add(b[i]);
                set.remove(b[i]);
            }
        }
        for (int i : intersection) {
            System.out.print(i + " ");
        }
        System.out.println();
        return intersection.size();
    }
    

    public static void main(String[] args) {
        int arr1[] = {1, 2, 2, 3, 4 };
        int arr2[] = {2, 2, 4, 6, 7, 8};
        System.out.println(intersection(arr1, arr2, 5, 4)); // 2 4
        System.out.println(intersectionOfArrays(arr1, arr2, 5, 4)); // 2 2 4
    }

}
