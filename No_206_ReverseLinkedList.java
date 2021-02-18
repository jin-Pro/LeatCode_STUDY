package LeetCode;

public class No_206_ReverseLinkedList {
	public static void main(String[] args) {
		ListNode ln = new ListNode(1,new ListNode(2,new ListNode(3, new ListNode(4, new ListNode (5)))));
		ListNode answer = reverseList(ln);
		while(answer != null) {
			System.out.println(answer.val);
			answer = answer.next;
		}
	}
	
	public static ListNode reverseList(ListNode head) {
		ListNode prevNode = null;
		ListNode curNode = null;
		
		while(head != null) {
			curNode = new ListNode(head.val);
			
			curNode.next = prevNode;
			prevNode = curNode;
			
			head = head.next;
		}
		return prevNode;
	}
}
