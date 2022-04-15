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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd=new ListNode(-1);
        ListNode even=new ListNode(-1);
        ListNode cur1=head;
        ListNode itr1=even;
        ListNode itr2=odd;
        int b=1;
        while(cur1!=null)
        {
            if(b%2==0)
            {
                itr1.next=cur1;
                
                itr1=itr1.next;
            }else{
                itr2.next=cur1;
                
                itr2=itr2.next;
            }
            if(cur1!=null)cur1=cur1.next;
            b++;
        }
        itr2.next=even.next;
        itr1.next=null;
        
        return odd.next;
        
        
        
    }
}