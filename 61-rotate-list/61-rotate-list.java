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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null ||head.next==null ||k==0)
        {
            return head;
        }
        ListNode dummy=head;
        int l=0;
        
        for(ListNode i=head;i.next!=null;i=i.next)
        {
            dummy=dummy.next;
            ++l;
        }
        ++l;
        if(k>l)
        {
            k=k%l;
        }
        
        dummy.next=head;
        for(int i=0;i<l-k;i++)
        {
            dummy=dummy.next;
        }
        head=dummy.next;
        dummy.next=null;
        return head;
        
    }
}