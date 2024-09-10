package Arrays;

public class LinearSearch {
    public static int linearSearch(int arr[],int key){
    // TC = O(n)
    for(int i=0;i<arr.length;i++){
        if(arr[i]==key){
            return i;
        }
    }
    return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2,4,5,7,9,8};
        System.out.print("index of key is : ");
        System.out.println(linearSearch(nums, 4));
    }
    
}
