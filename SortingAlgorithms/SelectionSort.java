// def: pick the smallest from unsorted array and put it at the beginnig.
// TC = O(n^2)

package SortingAlgorithms;

public class SelectionSort {
    public static void selectionSort(int arr[], int n) {
		for(int i=0; i<n-1; i++){
			int min = i;
			for(int j=i+1; j<n; j++){
				if(arr[j]<arr[min]){
					min = j;
				}
			}
			// swap min and i
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {6, 2, 8, 4, 10};
        printArr(arr);
        selectionSort(arr, 5);
        printArr(arr);
        
    }
}
