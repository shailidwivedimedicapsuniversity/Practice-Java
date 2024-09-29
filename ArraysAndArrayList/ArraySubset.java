// not imp
package ArraysAndArrayList;

import java.util.ArrayList;

public class ArraySubset {
     public static String isSubset
    ( long a1[], long a2[], long n, long m) {
        ArrayList<Long> list = new ArrayList<>();
        for (long i = 0; i < n; i++) {
            list.add(a1[(int)i]); // Cast to int for array index
        }

        // Check each element of a2
        for (long i = 0; i < m; i++) {
            boolean flag = false;
            // Check if a2[i] is in the list
            for (int j = 0; j < n; j++) {
                if (a2[(int)i] == list.get(j)) {
                    list.remove(j); // Remove the element from the list
                    flag = true;
                    break; // Break once we find the element
                }
            }

            // If not found, return "No"
            if (!flag) {
                return "No";
            }
        }
        return "Yes"; 
    }
    public static void main(String[] args) {
        long arr1[] = {11, 7, 1, 13, 21, 3, 7, 3};
        long arr2[] = {11, 3, 7, 1, 7};
        System.out.println(isSubset(arr1, arr2, arr1.length, arr2.length));
    }
}
