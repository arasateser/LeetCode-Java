/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class reverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;  
        ListNode target = head;
    
        
        while(target != null) { 
            ListNode next = target.next; 
            target.next = prev;
            prev = target;
            target = next;
        }
       return prev; 
    }
}
