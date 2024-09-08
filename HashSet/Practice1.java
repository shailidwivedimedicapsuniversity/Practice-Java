// HashSet : no duplicate, unordered, null allowed
// HashSet internally  implemented in form of  Hashmap
// basic  operation : add, contains , remove, size , clear ,clone, isEmpty
// Linked HashSet : ordered; insertion order will be maintained

package HashSet;

import java.util.HashSet;

public class Practice1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // 1. add(key)
        set.add(1);
        set.add(2);
        set.add(1);
        System.out.println(set);
        // 2. contains(key)
        if(set.contains(2)){
            System.out.println("congratulations, you contains 2");
        }
        // 3. remove(key)
        set.remove(2);
        System.out.println(set);
        // 4. size
        System.out.println(set.size());
        // 5. clear
        set.clear();
        System.out.println(set.isEmpty());
    }
}
