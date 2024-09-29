package ArraysAndArrayList;

public class MoveZeros {

    // Given an integer array nums, move all 0's to the end of it while maintaining the 
    //relative order of the non-zero elements.   
     public static void moveZeros(int nums[]) {
        
        int idx = 0;

        // Step1: move all non-zero elements to the beginning of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[idx] = nums[i];
                idx++;
            }
        }

        // Step 2: fill the rest of the array with zeros
        for (int i = idx; i < nums.length; i++) {
            nums[i] = 0;
        }

        //Step3 : Print the modified array
        for (int i : nums) {
            System.out.print(i + "  ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeros(nums);
    }
}
