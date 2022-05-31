class Solution {
   public Node connect(Node root) {
    Node cur = root;
    Node head=null;
    Node tail=null;
    while (cur != null) {
       while(cur!=null)
       {
           if(cur.left!=null)
           {
               if(head==null)
               {
                   head=tail=cur.left;
               }else {
                   tail.next=cur.left;
                   tail=cur.left;
               }
           }
           if(cur.right!=null)
           {
               if(head==null)
               {
                   head=tail=cur.right;
               }else {
                   tail.next=cur.right;
                   tail=cur.right;
               }
           }
           cur=cur.next;
          
       }
      cur=head;
      tail=null;
      head=null;
      
      
    }
    return root;
}
}