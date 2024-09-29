package ArraysAndArrayList;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        // 1. find breakpoint, initially let there's no breakpoint exist
        int bp = -1;
        int n = nums.length;
        // find longest prefix match , where a[i]<a[i+1]
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                bp = i;
                break;
            }
        }
        // 2. if array is one desc order
        if (bp == -1) {
            // if no such prefix match , reverse the entire array
            reverseArray(nums, 0, n - 1);
            return;
        }
        // 3. find closest greater ele from bp
        // nums[i]>nums[bp] but stay close to index
        for (int i = n - 1; i > bp; i--) {
            // till n-1 sub array is in desc order
            if (nums[i] > nums[bp]) {
                // swap i and bp
                int temp = nums[i];
                nums[i] = nums[bp];
                nums[bp] = temp;
                break;
            }
        }
        // 4. reverse subarray to the right to index
        reverseArray(nums, bp + 1, n - 1);
        return;
    }

    public static void reverseArray(int arr[], int si, int ei) {
        while (si < ei) {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 5 };
        nextPermutation(nums);
        for (int i : nums) {
            System.out.print(i + "    ");
        }
    }
}
