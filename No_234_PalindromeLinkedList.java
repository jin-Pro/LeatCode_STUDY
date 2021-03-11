package LeetCode;

public class No_234_PalindromeLinkedList {
	public static boolean isPalindrome(ListNode head) {
        
		int count = 0;
		
		ListNode countNode = head;
		
		while(countNode != null) {
			countNode = countNode.next;
			count++;
		}
		
		count /= 2;
		int num = count;
		
		ListNode current = head;
		
		while(count != 0) {
			current = current.next;
			count--;
		}
		
		ListNode prev = null;
		ListNode next = null;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;	
		}
		
		for(int i = 0; i < num; i++) {
			if(prev.val != head.val) return false;
			prev = prev.next;
			head = head.next;
		}
		
		return true;
    }
}

//Runtime: 5 ms, faster than 11.68% of Java
//Memory Usage: 49.1 MB, less than 5.69% of Java 
// count를 구하지말고 fast,slow를 두어서 중간부분을 구하게되면 더 빨라질것으로 예상
