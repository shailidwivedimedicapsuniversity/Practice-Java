package ArraysAndArrayList;

public class KadanesAlgo {

    public static int kadanesAlgo(int arr[]){
        // best and optimise approach for find max subarray sum
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        // TC = O(n)
        for(int i=0; i<arr.length; i++){
            currSum += arr[i];
            maxSum = Math.max(maxSum, currSum);
            if(currSum<0){
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int nums[] = { 2, 14, 5, -7, 9, -1 };
        System.out.println(kadanesAlgo(nums));
    }
}
