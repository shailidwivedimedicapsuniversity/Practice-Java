package Arrays;

public class PrefixSum {

    public static int prefixSum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefix[] = new int[arr.length];
         prefix[0] = arr[0];
         for(int i=1; i<prefix.length; i++){
            prefix[i]= prefix[i-1]+ arr[i];
         }
         for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                currSum = (i==0)? prefix[j] : prefix[j]-prefix[i-1];
                maxSum = Math.max(maxSum, currSum);
            }
         }
         return maxSum;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 14, 5, -7, 9, -1 };
        System.out.println(prefixSum(nums));
    }
}
