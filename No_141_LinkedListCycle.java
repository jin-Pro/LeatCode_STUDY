package LeetCode;

public class No_141_LinkedListCycle {
	public boolean hasCycle(ListNode head) {
		ListNode compareNode = head;
		ListNode moveNode = head;
		
		while(compareNode != null && compareNode.next != null) {
			compareNode = compareNode.next.next;
			moveNode = moveNode.next;
			
			if(compareNode == moveNode) return true;
		}
		
		return false;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java
//Memory Usage: 40 MB, less than 38.24% of Java