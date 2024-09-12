// Search in rotated and sorted array
package Arrays;

import Arrays.LinearSearch;

public class SearchInRotatedAndSortedArray {
    public static int searchInRotatedSortedArray(int arr[], int target) {
        // Binary Search Optimise Approach TC = O(logn)
        int si = 0;
        int ei = arr.length;
        int mid;
        while (si <= ei) {
            mid = si + (ei - si) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            // identify the sorted half, either left or right part
            if (arr[si] <= arr[mid]) {
                // That means left half is sorted
                if (arr[si] <= target && arr[mid] >= target) {
                    ei = mid - 1;
                } else {
                    si = mid + 1;
                }
            } else if (arr[mid] <= arr[ei]) {
                // That means right half is sorted
                if (arr[mid] <= target && arr[ei] >= target) {
                    si = mid + 1;
                } else {
                    ei = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // nums is previously sorted in asc order but possibly rotated at an unknown
        // pivot index k.
        // nums = {0,1,2,4,5,6,7}
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        // bruteforce: we can simply use linear search for searching TC = O(n)
        System.out.println(LinearSearch.linearSearch(nums, target));
        System.out.println(searchInRotatedSortedArray(nums, target));

    }
}
