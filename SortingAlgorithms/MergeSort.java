// Merge Sort Algorithm - Merge sort is a Divide and Conquer based Algorithm. It divides
// the input array into two-parts, until the size of the input array is not ‘1’.
// In the return part, it will merge two sorted arrays a return a whole merged sorted array.
// TC= O(nlogn) SC=O(n)
// Quick sort is better than merge sort because in merge sort we use extra array
package SortingAlgorithms;

public class MergeSort {

    public static void mergeSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int[] arr, int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                // arr[j]<arr[i]
                temp[k++] = arr[j++];
            }
        }
        // for remaining elements
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        // copy temp to the origional array
        for (i = si, k = 0; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void printArr(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 1, 6, 2, 5, 7 };
        printArr(arr);
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
