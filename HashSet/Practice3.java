//  Linked HashSet and TreeSet
// Linked HashSet : same as hashset but ordered; insertion order will be maintained
// Performance -  Linked Hashset< Hashset , Linked HashMap < HashMap ; Time Complexity - constant(same)
// TreeSet : same as hashset but sorted in asc order and null values are not allowed
// Treeset : time complexity - logn
// Treeset internally treemap ke form me implement hote hai
package HashSet;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Practice3 {
    public static void main(String[] args) {
        // LinkedHashSet <String> set = new LinkedHashSet<>();
        TreeSet <String> set = new TreeSet<>();
        set.add("shaili");
        set.add("naili");
        set.add("rhituraj");
        set.add("shaili");
        System.out.println(set);
    }
}
