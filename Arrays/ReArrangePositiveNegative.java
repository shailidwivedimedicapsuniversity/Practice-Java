package Arrays;

import java.util.ArrayList;

public class ReArrangePositiveNegative {
    public static void rearrange(ArrayList<Integer> arr) {
    // Separate positive and negative numbers
    int n = arr.size();
    ArrayList<Integer> positives = new ArrayList<>();
    ArrayList<Integer> negatives = new ArrayList<>();
    
    for (int i = 0; i < n; i++) {
        if (arr.get(i) >= 0) {
            positives.add(arr.get(i));
        } else {
            negatives.add(arr.get(i));
        }
    }
    
    int pIdx = 0;
    int nIdx = 0;
    int idx = 0;
   
    // Alternating positives and negatives
    while (pIdx < positives.size() && nIdx < negatives.size()) {
        arr.set(idx++, positives.get(pIdx++));  // Set positive number
        arr.set(idx++, negatives.get(nIdx++));  // Set negative number
    }

    // If negative elements are exhausted, add remaining positives
    while (pIdx < positives.size()) {
        arr.set(idx++, positives.get(pIdx++));
    }

    // If positive elements are exhausted, add remaining negatives
    while (nIdx < negatives.size()) {
        arr.set(idx++, negatives.get(nIdx++));
    }
}
public static void main(String[] args) {
    int arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2};
    ArrayList<Integer> list = new ArrayList<>();
    for(int i : arr){
        list.add(i);
        System.out.print(i+"  ");
    }
    System.out.println();
    rearrange(list);
    for(int i: list ){
        System.out.print(i+"  ");
    }
    System.out.println();
}

}
