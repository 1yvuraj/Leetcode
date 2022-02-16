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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
         ListNode oh=null,ot=null;
         ListNode cur=head;
        int k=2;
        int l=Length(head);
        while(l>=k)
        {
            int temp=k;
            while(temp-->0){
            ListNode fr=cur.next;
            cur.next=null;
            addFirst(cur);
            cur=fr;
            }
            if(oh==null)
            {
            oh=th;
            ot=tt;
            }
            else
            {
              ot.next=th; 
               ot=tt;
              
            }
            
            th=null;
            tt=null;
            l-=k;
        }
        ot.next=cur;
        return oh;
    }
    public void addFirst(ListNode node)
    {
        if(th==null)
        {
            th=node;
            tt=node;
        }
        else
        {
            node.next=th;
            th=node;
        }
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
