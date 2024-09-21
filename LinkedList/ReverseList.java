package LinkedList;
import java.util.LinkedList;

import org.w3c.dom.Node;


public class ReverseList {
    public static void reverse(Node head) {
        // 3 var 4 steps
        Node prev = null; // before head
        Node curr = head; 
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
}
