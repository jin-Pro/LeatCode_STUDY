package LeetCode;

public class No_21_MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) {
        	return l2;
        }
        if(l2 == null) {
        	return l1;
        }
        
        ListNode merge = new ListNode();
        
        if(l1.val > l2.val) {
        	merge.val = l2.val;
        	merge.next = mergeTwoLists(l1,l2.next);
        }else {
        	merge.val = l1.val;
        	merge.next = mergeTwoLists(l1.next,l2);
        }
        
        return merge;
    }
	
	//Runtime: 0 ms, faster than 100.00%
	//Memory Usage: 38.6 MB, less than 28.42%
}
