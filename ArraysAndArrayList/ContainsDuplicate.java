package ArraysAndArrayList;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicateOptimise(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums){
            if(set.contains(nums[i])){
                return true;
            }else{
                set.add(i);
            }
        }
        return false;
    }

    public static boolean duplicateContains(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicate(int nums[]) {
        // this is brute force appraoch with boundry condition
        int n = nums.length;
        Arrays.sort(nums);

        if (nums[0] == nums[1]) {
            return true;
        }

        if (nums[n - 1] == nums[n - 2]) {
            return true;
        }

        for (int i = 1; i <= n - 2; i++) {
            if (nums[i] == nums[i - 1] || nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Example array
        int[] nums = {1, 3, 4, 2, 5, 3};

        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicateOptimise(nums));
        System.out.println(duplicateContains(nums));
    }
}
