//package easy;
//
////class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }
// 
//public class No_21_MergeTwoSortedLists {
//    ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//            if(l1 == null){
//                return l2;
//            }
//            if(l2 == null){
//                return l1;
//            }
//        
//            ListNode merge = new ListNode();
//        
//            if(l1.val > l2.val){
//                merge.val = l2.val;
//                merge.next = mergeTwoLists(l1, l2.next);
//            }
//            else{
//                merge.val = l1.val;
//                merge.next = mergeTwoLists(l1.next, l2);
//            }
//        return merge;
//    }
//}