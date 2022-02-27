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
        ListNode tt=null;
        ListNode th=null;
    public ListNode reverseKGroup(ListNode head, int k) {
         ListNode pt=null;
        ListNode ph=null;
        int l=length(head);
        ListNode cur=head;
        ListNode fr=null;
        
        while(l>=k)
        {
            int temp=k;
            while(temp-->0)
            {
               fr=cur.next;
               cur.next=null;
               AddFirst(cur);
                if(cur!=null)cur=cur.next;
                cur=fr;
            }
            if(ph==null)
            {
                ph=th;
                pt=tt;
            }else{
                pt.next=th;
                pt=tt;
            }
            l-=k;
            tt=null;
            th=null;
        }
        pt.next=cur;
        return ph;
    }
    public void AddFirst(ListNode head) {
        if(th==null)
        {
            th=head;
            tt=head;
        }else{
            head.next=th;
            th=head;
        }
       
    }
    public int length(ListNode head) {
        int l=0;
        for(ListNode node=head;node!=null;node=node.next)
        {
           ++l; 
        }
       return l;
    }
}