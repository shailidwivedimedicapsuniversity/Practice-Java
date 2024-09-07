//  basic operations in hashmap : get, put, containsKey, remove, clear, size, isEmpty
//  iterate on hashmap : keySet, entrySet

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice1{
    public static void main(String args[]){
        // creating hashmap
        HashMap<String, Integer> hm = new HashMap<>();
        // 1.put insert O(1) 

        hm.put("shaili", 1);
        hm.put("bhupendra", 2);
        hm.put("naili", 3);
        System.out.println(hm);
        // 2.get , 3.containsKey  search O(1)
        System.out.println(hm.get("f"));
        System.out.println(hm.containsKey("bhupendra"));
        // 4. remove 
        // System.out.println(hm.remove("bhupendra", 2)); // return boolean value and remove entry
        // System.out.println(hm.remove("shaili")); //return value and remove entry
        // System.out.println(hm);
        // hm.clear();
        // System.out.println(hm.isEmpty());
        // System.out.println(hm.size());

        // iterate on hashmap using keyset
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for(String key: keys){
            System.out.println("key :"+key+", value: "+ hm.get(key));
        }

        // iterate on hashmap using entryset and find max value in hashmap
        Set<Map.Entry <String, Integer> > entries = hm.entrySet();
        System.out.println(entries);
        int max = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : entries) {
            if(max < entry.getValue()){
                max = entry.getValue();
            }
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println("max value in hashmap is : "+ max);

    }
}