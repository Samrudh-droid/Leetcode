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
        // Create a dummy head node to anchor the result list
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;

        // Continue looping if there are nodes left in l1 OR l2, OR if there's a leftover carry
        while (l1 != null || l2 != null || carry != 0) {
            // Extract values, default to 0 if the list has reached the end
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            // Calculate the total sum for the current position
            int sum = x + y + carry;
            
            // Update carry for the next position
            carry = sum / 10;
            
            // Create a new node with the single-digit value and link it
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            // Move to the next nodes in the input lists if available
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // Return the actual head of the result list (skipping the dummy node)
        return dummyHead.next;
    }
}
