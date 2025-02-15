package ArraysAndArrayList;
import java.util.ArrayList;
// print all repeting and non repeating numbers, remove duplicate numbers'
// count distinct/unique elements
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Duplicate {
    // public static HashSet<Integer> printDuplicates(int[] arr) {
    //     Arrays.sort(arr);
    //     HashSet<Integer> set = new HashSet();
    //     for (int i = 0; i < arr.length - 1; i++) {
    //         if (arr[i] == arr[i + 1]) {
    //             set.add(arr[i]);
    //         }
    //     }
    //     return set;
    // }

    public static int countDistinctElement(int[] arr) {
        int count = 0;    
        for (int i = 0; i < arr.length; i++) {
            boolean isDistinct = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                count++;
            }
        }
        return count;
    }

    public static void printDuplicates(int[] arr) {
        List<Integer> list = new ArrayList();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) > 1) { // map.get(key) will return value
                System.out.println(key +" count : "+ map.get(key));
            }
        }
    }

    public static HashSet<Integer> nonRepeating(int[] arr) {
        HashSet<Integer> set = new HashSet();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) == 1) { // map.get(key) will return value
                set.add(key);
            }
        }
        return set;
    }

    public static void main(String[] args) {
        int arr[] = {  4, 5, 2, 3, 4, 1, 3, 4, 1, 3, 3, 1, 4 };
        System.out.println("Duplicate numbers are : ");
        printDuplicates(arr);
    }
}
