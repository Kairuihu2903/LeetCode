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
        boolean hold = false;
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        
        while (l1 != null || l2 != null) {
            int sum = 0;

            // if both lists have values
            if (l1 != null && l2 != null) {
                if (hold) {
                    sum = l1.val + l2.val + 1;
                } else {
                    sum = l1.val + l2.val;
                }
                l1 = l1.next;
                l2 = l2.next;
            } 
            // if l1 is empty
            else if (l1 == null && l2 != null) {
                if (hold) {
                    sum = l2.val + 1;
                } else {
                    sum = l2.val;
                }
                l2 = l2.next;
            } 
            // if l2 is empty
            else if (l2 == null && l1 != null) {
                if (hold) {
                    sum = l1.val + 1;
                } else {
                    sum = l1.val;
                }
                l1 = l1.next;
            }

            // handle carry and add to linked list
            if (sum > 9) {
                current.next = new ListNode(sum - 10);
                hold = true;
            } else {
                current.next = new ListNode(sum);
                hold = false;
            }
            current = current.next;
        }

        if (hold) {
            current.next = new ListNode(1);
        }

        return dummyHead.next;
    }
}
