
// contains duplicate 
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice2 {

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // insert array values in map
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() > 1) {
                return true;
            }
        }

        return false;
    }

    public static HashSet<Integer> printRepeating(int[] arr) {
        HashSet<Integer> set = new HashSet();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) > 1) { // map.get(key) will return value
                set.add(key);
            }
        }
        return set;
    }

    public static HashSet<Integer> printNonRepeating(int[] arr) {
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

    public static int[] removeDuplicate(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int[] ans = new int[map.size()];
        int i = 0;
        for (int key : map.keySet()) {
            ans[i] = key;
            i++;
        }
        return ans;
        // HashSet<Integer> set = new HashSet<>();
        // for (int i : arr) {
        // set.add(i);
        // }
        // return set;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 2, 4, 6, 2, 3, 5 };
        // is contains duplicate
        System.out.println(containsDuplicate(arr));

        // print all non duplicate numbers
        System.out.println(printNonRepeating(arr));
        // this will print all duplicate numbers
        System.out.println(printRepeating(arr));
        // this will remove duplicates numbers and print unique numbers
        arr = removeDuplicate(arr);
        for (int i : arr) {
            System.out.print(i + "  ");
        }

    }
}