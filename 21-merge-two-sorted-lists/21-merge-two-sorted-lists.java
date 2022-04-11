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
        ListNode dummy=new ListNode(01111);
        ListNode p=dummy;
        
        ListNode c1=list1;
        ListNode c2=list2;
        while(c1!=null && c2!=null)
        {
            if(c1.val>c2.val)
            {
                p.next=c2;
                c2=c2.next;
            }else{
                p.next=c1;
                c1=c1.next;
            }
            if(p!=null)p=p.next;
        }
        if(c1!=null)p.next=c1;
        if(c2!=null)p.next=c2;
        return dummy.next;
    }
}