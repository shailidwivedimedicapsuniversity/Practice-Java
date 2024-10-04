// union and intersection of 2 arrays 

package HashSets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice5 {

    public static List<Integer> findUnion(int[] arr1, int[] arr2) {
        List<Integer> union = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            if (!union.contains(arr1[i])) {
                union.add(arr1[i]);
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if (!union.contains(arr2[i])) {
                union.add(arr2[i]);
            }
        }

        return union;
    }

    // optimise way to calculate size of union
    public static int sizeUnion(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }
        return set.size();
    }

    public static int sizeIntersection(int arr1[],  int arr2[]){
        HashSet <Integer> set = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        int ans = 0;
        for(int i=0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
                ans++;
                set.remove(arr2[i]);
            }
        }
        return ans;
    }

    public static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] &&  !ans.contains(arr1[i])) {
                 ans.add(arr1[i]);
                 break; 
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 4, 5, 6, 7, 8 };

        List<Integer> unionResult = findUnion(array1, array2);
        List<Integer> intersectionResult = findIntersection(array1, array2);

        System.out.println("Union of the two arrays: " + unionResult );
        System.out.println("size of union : " + sizeUnion(array1, array2));
        System.out.println("Intersection of the two arrays: " + intersectionResult);
        System.out.println("size of intersection : " + sizeIntersection(array1, array2));

    }
}
