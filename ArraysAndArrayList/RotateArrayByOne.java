// Given an array, rotate the array by one position in clock-wise direction.
// like input: arr = [1, 2, 3, 4, 5] Output: [5, 1, 2, 3, 4]
package ArraysAndArrayList;

public class RotateArrayByOne {

    public static void rotate(int arr[], int n) {
        // Cyclically rotate an array by one
        // using extra array Tc = O(n) SC= O(n)
        int ans[] = new int[n];
        ans[0] = arr[n - 1];
        for (int i = 1; i < n; i++) {
            ans[i] = arr[i - 1];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = ans[i];
        }
    }

    public static void rotateOptimise(int arr[], int n) {
        // without using any space
        // TC=O(n) SC = O(1)
        int last = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            // reverse loop
            arr[i + 1] = arr[i];
        }
        arr[0] = last;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        rotateOptimise(arr, 5);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

}
