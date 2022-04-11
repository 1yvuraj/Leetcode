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
    public void reorderList(ListNode head) {
       ListNode mid=middleNode(head);
        ListNode nhead=mid.next;
        mid.next=null;
        nhead=reverseList(nhead);
        
        ListNode cur1=head;
         ListNode cur2=nhead;
        
        while(cur2!=null)
        {
            ListNode f1=cur1.next;
            ListNode f2=cur2.next;
            cur1.next=cur2;
            cur2.next=f1;
            cur1=f1;
            cur2=f2;
            
           
        }
       
    }
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
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