package ArraysAndArrayList;

public class ReverseArray {

    public static int[] reverseArray(int arr[]){
        // without modifying origional array , also work with negative values
        // using extra space SC = O(n)
        // TC = O(n)
        int[] rev = new int[arr.length];
        int idx = 0;
        for(int i=arr.length-1; i>=0; i--){
            rev[idx] = arr[i];
            idx++;
        }
        return rev;
    }

    public static int[] reverse(int arr[]){
        //  more efficient and optimise approach
        //  reverse array with modifying origional, also work with negative values
        // TC = O(n) SC = O(1) 
        int si = 0;
        int ei = arr.length-1;
        int temp;
        while ( si <= ei) {
             temp = arr[si];
             arr[si] = arr[ei];
             arr[ei] = temp;
             si++;
             ei--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int nums[] = {2,4,5,7,9};
        System.out.println("originional array is : ");
        for(int i : nums){
            System.out.print(i+"    ");
        }
        System.out.println();
        System.out.println("reverse array is : ");
        reverse(nums);
        // int[] rev = reverseArray(nums);
        for(int i : nums){
            System.out.print(i+"    ");
        }
     
    }
}
