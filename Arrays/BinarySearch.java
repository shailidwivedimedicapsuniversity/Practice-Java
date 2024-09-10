//  Array is sorted
package Arrays;

public class BinarySearch {
    // TC = O(logn)
    public static int binarySearch(int arr[],int key){
        int si = 0;
        int ei = arr.length-1;
        while (si<=ei) {
            int mid = (si+ei)/2;
            // or mid = si + (ei-si)/2
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid]<key){
                si = mid+1;
            }else if(arr[mid]>key){
                ei = mid-1;
            }
            si++;
            ei--;
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {2,4,5,7,9};
        System.out.println(binarySearch(nums, 5));
    }
}
