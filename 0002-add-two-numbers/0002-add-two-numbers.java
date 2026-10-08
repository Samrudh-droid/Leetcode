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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Create a dummy head node to simplify list assembly
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        // Traverse through both lists until both are empty and no carry remains
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            // Add value from list 1 if it exists
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            // Add value from list 2 if it exists
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // Calculate new carry and the single digit value for the current node
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            
            // Advance the pointer
            current = current.next;
        }

        // Return the actual head of the resultant linked list
        return dummyHead.next;
    }
}
