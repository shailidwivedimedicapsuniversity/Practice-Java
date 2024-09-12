// Move All Negative Numbers To Beginning And Positive To End 
// order not maintained

package Arrays;

import java.util.Arrays;

public class PositiveNegativeWithoutOrder {

    // Move All Negative Numbers To Beginning And Positive To End
    public static int[] negativePositive(int arr[]) {
        // Using Sorting, TC = O(nlogn)
        // brute force appraoch
        // order not maintain
        Arrays.sort(arr);
        return arr;
    }

    public static int[] separateNegativePositive(int arr[]) {
        // Approach : Use two pointers approach to separate negatives and positives
        // This can give time limit exceed TC = O(n)
        int a = 0, b = arr.length - 1, temp;
        while (a < b) {
            // Move 'a' forward if the current element is negative(negative end)
            if (arr[a] < 0) {
                a++;
            }
            // Move 'b' backward if the current element is positive(positive end)
            else if (arr[b] > 0) {
                b--;
            }
            // If arr[a] is positive and arr[b] is negative, swap them
            else {
                temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
                a++;
                b--;
            }
        }

        return arr;
    }

    // Move All Negative Numbers To Beginning And Positive To End
    public static int[] separateNegativeAndPositive(int arr[]) {
        // Better Approach: Iterate through the array, swap each negative element with
        // the
        // first unoccupied position (j) to group all negatives at the beginning
        // without maintaining their original order. TC = O(n)
        int j = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                // Swap arr[i] with arr[j] to move the negative number to the correct position
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, -1, 3, 2, -7, -5, 11, 6 };
        // separateNegativeAndPositive(nums);
        // negativePositive(nums);
        separateNegativePositive(nums);
        printArray(nums);
    }
}
