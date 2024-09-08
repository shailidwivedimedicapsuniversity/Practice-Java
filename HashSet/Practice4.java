// Count distinct element
// remove duplicate elements 
package HashSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Practice4 {
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

    public static int countUniqueElement(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,5,6,7,3,4,2,1};
        System.out.println(countDistinctElement(nums));
        System.out.println(countUniqueElement(nums));
    }
}
