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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(-10000);
        dummy.next=head;
        ListNode cur=head;
        ListNode itr=dummy;
        while(cur!=null)
        {
            while(cur!=null && cur.val==itr.val)
            {
                cur=cur.next;
                
            }
            itr.next=cur;
            itr=itr.next;
            if(cur!=null)cur=cur.next;
        }
        return dummy.next;
    }
}