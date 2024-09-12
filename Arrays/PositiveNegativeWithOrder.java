// Move All Negative Numbers To Beginning And Positive To End 
// order maintained of positive and negative numbers relative

package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PositiveNegativeWithOrder {
    // TC = O(n)
    // SC = O(n)
    public static int[] separateNegativeAndPositive(int arr[]) {
        List<Integer> negatives = new ArrayList<>();
        List<Integer> positives = new ArrayList<>();
        // First pass: Separate negatives and positives, preserving their order
        for (int num : arr) {
            if (num < 0) {
                negatives.add(num);
            } else {
                positives.add(num);
            }
        }

        // Second pass: Copy the results back into the original array
        int i = 0;
        for (int num : negatives) {
            arr[i++] = num;
        }
        for (int num : positives) {
            arr[i++] = num;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, -2, 3, -4, 5, -6, 7, 8, -9 };
        separateNegativeAndPositive(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
