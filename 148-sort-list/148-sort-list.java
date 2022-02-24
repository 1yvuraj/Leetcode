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
     public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode mid=middleNode(head);
        ListNode nHead=mid.next;
        mid.next=null;
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(nHead);
        return mergeTwoLists(l1,l2);
        
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null ||list2==null)
        {
            return list1!=null?list1:list2;
        }
        ListNode c1=list1;
        ListNode c2=list2,dummy=new ListNode(-1), pre=dummy;
        
        while(c1!=null &&c2!=null)
        {
           
            if(c1.val<c2.val)
            {
                pre.next=c1;
                c1=c1.next;
            }
            else
            {
                pre.next=c2;
                c2=c2.next;
            }
            pre=pre.next;
        }
        pre.next=c1!=null?c1:c2;
        ListNode head=dummy.next;
        dummy.next=null;
        return head;
        
    }
    public ListNode middleNode(ListNode head) {
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    public int Length(ListNode head)
    {
        int size=0;
        for(ListNode i=head;i!=null;i=i.next )
        {
            ++size;
        }
        return size;
    }
}
