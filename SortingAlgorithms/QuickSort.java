//Quick sort is a divide and conquer algorithm in which we choose a pivot point and partition the array into two parts i.e, left and right. The left part contains the numbers smaller than the pivot element and the right part contains the numbers larger than the pivot element. Then we recursively sort the left and right parts of the array.
// TC =O(n^2)worst when pivot is always the smallest or largest ele in the array
// TC= O(nlogn) avg , SC = O(1)
package SortingAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static void quickSortAlgo(List<Integer> arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pIdx = partition(arr, si, ei);
        quickSortAlgo(arr, si, pIdx - 1);// left
        quickSortAlgo(arr, pIdx + 1, ei);// right
    }

    public static int partition(List<Integer> arr, int si, int ei) {
        int pivot = arr.get(ei);
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr.get(j) <= pivot) {
                // make places for smaller elements than pivot
                i++;
                int temp = arr.get(j);
                arr.set(j, arr.get(i));
                arr.set(i, temp);
            }
        }
        i++;
        int temp = arr.get(ei);
        arr.set(ei, arr.get(i));
        arr.set(i, temp);
        return i;
    }

    public static void printList(List<Integer> list) {
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 6, 4 };
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        printList(list);
        quickSortAlgo(list, 0, list.size() - 1);
        printList(list);
    }
}
