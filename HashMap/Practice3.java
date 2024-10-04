//find Majority elements : find all eles which appears more than n/3 times where
// n = size of arrayi
import java.util.HashMap;
import java.util.Set;

public class Practice3 {

    public static void majorityElement(int[] arr){
        HashMap <Integer, Integer> map = new HashMap<>();
        // put all ele of arr into map and count frequency of all numbers
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
            //  we can also write above line - 
            // if(map.containsKey(arr[i])){
            //     map.put(arr[i], map.get(arr[i])+1);
            // }else{
            //     map.put(arr[i], 1);
            // }
        }

        // keyset : for find keys from hashmap
        // Set <Integer> keySet =  map.keySet();
        for(Integer key : map.keySet()){
            if(map.get(key)> arr.length/3){
                System.out.println(key);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,5,1,3,1,5,1};
        majorityElement(arr);
    }
    
}
