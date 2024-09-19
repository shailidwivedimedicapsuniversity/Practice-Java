// Def: pick an element from the unsorted part and place in right position in sorted part. 
// TC = O(n^2)
package SortingAlgorithms;

public class InsertionSort {
    public static void insertionSort(int n , int[] arr) {
		// Write your code here.
		for(int i=1; i<n; i++){
			int curr = arr[i];
			int j= i-1;
			while(j>=0 && arr[j]>curr){
				arr[j+1]= arr[j];
				j--;
			}
			// place to current element
			arr[j+1]= curr;
		}
	}
    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]= {3,2,5,1,3,4,8,0};
        printArr(arr);
        insertionSort(arr.length, arr);
        printArr(arr);
    }
}
