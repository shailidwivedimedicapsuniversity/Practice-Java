// Iteration on HashSet (traverse)
//  1. using iterator 2. using for each loop

package HashSets;

import java.util.HashSet;
import java.util.Iterator;

public class Practice2 {

    static void iterationOnHashSet(HashSet<String> set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    private static void traverseOnHashSet(HashSet<String> set) {
        for (String s : set) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        HashSet<String> actress = new HashSet<>();
        actress.add("Aish");
        actress.add("bhumi");
        actress.add("chitangrada");
        actress.add("dhanush");
        // TC = O(n)
        iterationOnHashSet(actress);
        traverseOnHashSet(actress);

    }
}
