// There is only one repeated number in array, return this repeated number.
// is array contains duplicates , using hashmap 

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicate3 {
    public static int findDuplicateNum(int[] nums) {
        // brute force O(n^2)
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = i + 1; j < nums.length; j++) {
        // if (nums[i] == nums[j]) {
        // return nums[i];
        // }
        // }
        // }
        // return -1;

        // using sorting O(n)
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }

        }
        return -1;
    }

    public static boolean containsDuplicate(int[] nums) {
        // brute force
        // for(int i=0; i<nums.length; i++){
        // for(int j=i+1; j<=nums.length-1; j++){
        // if(nums[i]==nums[j]){
        // return true;
        // }
        // }
        // }
        // return false;

        // sorting
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }

        }
        return false;
    }

    public boolean containsDuplicateOptimise(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // insert array values in map
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() > 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 2 };
        int ans = findDuplicateNum(arr);
        System.out.println(ans);
    }
}