package LeetCode;

public class No_160_IntersectionofTwoLinkedLists {
	 public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
			if(headA == null || headB == null) return null;
	        int lengthA = count(headA);
			int lengthB = count(headB);
			
			ListNode A = headA;
			ListNode B = headB;
			
			while(lengthA > lengthB) {
				A = A.next;
				lengthA --;
			}
			while(lengthA < lengthB) {
				B = B.next;
				lengthB --;
			}
			
			ListNode compareA = A;
			ListNode compareB = B;

			while(A != null && B != null) {
				compareA = A;
				compareB = B;
				
				while(compareA == compareB) {
					compareA = compareA.next;
					compareB = compareB.next;
					if(compareA == null && compareB == null) {
						return A;
					}
				} 
				A = A.next;
				B = B.next;
				
			}
			
			return null;
	    }
		
	static int count(ListNode input) {
			int count = 1;
			while(input.next != null) {
				input= input.next;
				count ++;
			}
			
			return count;
		}
	public static void main(String[] args) {
		ListNode headA = new ListNode(4);
		headA.next = new ListNode(1);
		headA.next.next = new ListNode(8);
		headA.next.next.next = new ListNode(4);
		headA.next.next.next.next = new ListNode(5);
		
		ListNode headB = new ListNode(5);
		headB.next = new ListNode(6);
		headB.next.next = new ListNode(1);
		headB.next.next.next = new ListNode(8);
		headB.next.next.next.next = new ListNode(4);
		headB.next.next.next.next.next = new ListNode(5);
		
		
		System.out.println(getIntersectionNode(headA,headB));
	}
}
//Runtime: 1 ms, faster than 97.80% of Java
//Memory Usage: 41.6 MB, less than 87.83% of Java 