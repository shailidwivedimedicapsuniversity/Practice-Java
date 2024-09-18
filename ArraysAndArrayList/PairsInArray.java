package ArraysAndArrayList;

public class PairsInArray {

    public static void pairsInArray(int arr[]){
        // pairs = [n(n-1)]/2
        // TC = O(n^2)
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j= i+1; j<arr.length; j++){
                System.out.print(arr[i]+", "+ arr[j]+"    ");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total pairs in this array is : "+ count);
    }
    public static void main(String[] args) {
        int nums[] = {2,4,5,7,9};
        pairsInArray(nums);
    }
}
