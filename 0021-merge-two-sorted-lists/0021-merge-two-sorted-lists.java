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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = null;
        ListNode current = null;
        //edge case
        if (list1 == null){
            return list2;
        }
        else if(list2 == null){
            return list1;
        }
        
        //initialize list3 with the smaller headnode
        if(list1.val <= list2.val){
            list3 = list1;
            list1 = list1.next;
        }else{
            list3 = list2;
            list2 = list2.next;
        }
        current = list3;

        //merge list1 and 2
        while (list1 != null && list2 != null){
            // if list1 is empty but list2 is not add list2.val to list3
                if(list1.val <= list2.val){
                    current.next = list1;
                    list1 = list1.next;
                }
                else{
                    current.next = list2;
                    list2 = list2.next;
                }
                current = current.next;
            }
        // Append remaining nodes of list1 or list2 to list3
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }
        return list3;
    }

}