package Arrays;

public class PrintSubArrays {
    public static void printSubArrays(int arr[]){
        //  subaarays = [n(n+1)]/2
        //  TC = O(n^3)
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                count++;
                System.out.println();
            }
        }
        System.out.println("total subarrays are : "+ count);
    }
    public static void main(String[] args) {
        int nums[] = {2,4,5,7,9};
        printSubArrays(nums);
    }
}
