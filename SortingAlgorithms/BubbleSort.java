// Def: large elements come to the end of the array by swapping with 2 adjacent elements
// TC = O(n^2)

package SortingAlgorithms;

public class BubbleSort {
    public static void bubbleSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int flag = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                // swap if first element is greater
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
    }

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 10, 9, 4, 3, 2, 18, 7, 6, 5, };
        printArr(arr);
        bubbleSort(arr, arr.length);
        printArr(arr);
    }
}
