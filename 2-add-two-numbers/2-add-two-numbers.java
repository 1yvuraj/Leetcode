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
        ListNode dummy = new ListNode(-1);
        ListNode itr=dummy ;
        
        ListNode c1 = l1;
        ListNode c2 = l2;
        int c = 0;
        while (c1 != null || c2 != null || c != 0) {
            int sum=(c1==null?0:c1.val)+(c2==null?0:c2.val)+c;
            int rem=sum%10;
             c=sum/10;
            ListNode n=new ListNode(rem);
            itr.next=n;
            if(c1!=null)c1=c1.next;
            if(c2!=null)c2=c2.next;
            itr=itr.next;
        }
        return dummy.next;
    }
}
