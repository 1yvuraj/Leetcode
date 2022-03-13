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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null)return head;
        
        ListNode l1=new ListNode(-1);
        ListNode l2=new ListNode(-1);
        ListNode p1=l1;
        ListNode p2=l2;
        
        ListNode curr=head;

        while(curr!=null)
        {
            if(curr.val<x)
            {
                p1.next=curr;
                p1=p1.next;
            }
            else
            {
                p2.next=curr;
                p2=p2.next;
            }
            if(curr!=null)curr=curr.next;
        }
        p1.next=l2.next;
        p2.next=null;
        return l1.next;
    }
}