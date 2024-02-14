/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;                   // Value of the node
 *     ListNode next;            // Reference to the next node in the linked list
 *     ListNode() {}             // Default constructor
 *     ListNode(int val) {       // Constructor with value parameter
 *         this.val = val;
 *     }
 *     ListNode(int val, ListNode next) {  // Constructor with value and next node parameters
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

/**
 * Solution class implementing a method to merge two sorted linked lists.
 */
class Solution {
    /**
     * Merges two sorted linked lists into a single sorted linked list.
     * @param list1 The head of the first sorted linked list.
     * @param list2 The head of the second sorted linked list.
     * @return The head of the merged sorted linked list.
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        ListNode ilk = new ListNode(-1);   // Create a dummy node to start the merged list
        ListNode temp = ilk;               // Initialize a temporary pointer to the dummy node

        // Iterate over both lists while they are not empty
        while (list1 != null && list2 != null) {
            // Compare values of the current nodes from both lists and append the smaller one to the merged list
            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;   // Move the temporary pointer forward
        }

        // Append remaining nodes from list1 to the merged list
        while(list1 != null){
            temp.next = list1;
            list1 = list1.next;
            temp = temp.next;
        }

        // Append remaining nodes from list2 to the merged list
        while(list2 != null){
            temp.next = list2;
            list2 = list2.next;
            temp = temp.next;
        }

        return ilk.next;   // Return the head of the merged list (skipping the dummy node)
    }
}
