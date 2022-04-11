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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;
        ListNode mid=midp(head);
        ListNode midn=reverseList(mid.next);
        mid.next=null;
        ListNode s=head;
        while(s!=null&&midn!=null)
        {
            if(s.val!=midn.val)return false;
            else{
                if(s!=null)s=s.next;
                if(midn!=null)midn=midn.next;
            }
        }
        return true;
        
    }
    public  ListNode midp(ListNode head) {
        ListNode slow=head;
        ListNode  fast=head;
        while(fast.next!=null && fast.next.next != null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode forw = curr.next; // backup

            curr.next = prev; // link

            prev = curr;
            curr = forw;
        }

        return prev;
    }
}