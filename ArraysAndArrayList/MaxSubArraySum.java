package ArraysAndArrayList;

public class MaxSubArraySum {

    public static int maxSubArraySum(int arr[]) {
        // brute force appraoch TC= O(n^3)
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                }
                maxSum = Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }

    public static int maxSubArraySum2(int[] arr){
        // optimise brute force appraoch TC= O(n^2)
        int maxS = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            int currS = 0;
            for(int j=i; j< arr.length; j++){
                currS += arr[j];
                maxS = Math.max(maxS, currS);
            }
        }
        return maxS;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 14, 5, -7, 9, -1 };
        System.out.println(maxSubArraySum(nums));
        System.out.println(maxSubArraySum2(nums));

    }
}
