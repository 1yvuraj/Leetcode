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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // if(head==null)return null;
        // else if(head.next==null && n==1)return null;
        ListNode dummy=new ListNode(1000);
        dummy.next=head;
        ListNode fast=head;
        ListNode slow=dummy;
        int i=0;
        while(i<=n-1)
        {
            fast=fast.next;
            i++;
        }
        while(fast!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
            
    }
}