package java_LEET;

import java.util.LinkedList;

public class numof206_reverselinklist {
	 public ListNode reverseList(ListNode head) {
		 ListNod prev = null;
		 ListNode current = node;
		 ListNode next = null;
	        while (current != null) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }
	        node = prev;
	        return node;
	      
	    }
}
/*Definition for singly-linked list.
* public class ListNode {
*     int val;
*     ListNode next;
*     ListNode() {}
*     ListNode(int val) { this.val = val; }
*     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
* }
*/