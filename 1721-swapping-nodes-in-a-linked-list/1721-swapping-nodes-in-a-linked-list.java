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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast=head;
        ListNode slow=head;
        ListNode fi=null;
        for(int i=1;i<k;i++)
        {
            fast=fast.next;
        }
        fi=fast;
        while(fast!=null&& fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        int temp =fi.val;
        fi.val=slow.val;
        slow.val=temp;
        return head;
    }
}