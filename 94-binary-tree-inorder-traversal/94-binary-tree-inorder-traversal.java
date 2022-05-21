class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
       TreeNode cur=root;
        ArrayList<Integer>ans=new ArrayList<>();
       while(cur!=null)
       {
           if(cur.left==null)
           {
               ans.add(cur.val);
               cur=cur.right;
           }else{
               TreeNode p=cur.left;
               while(p.right!=null && p.right!=cur)
               {
                   p=p.right;
               }
               if(p.right==null)
               {
                   p.right=cur;
                   cur=cur.left;
               }
               if(p.right==cur)
               {
                   p.right=null;
                   ans.add(cur.val);
                   cur=cur.right;
               }
           }
       }
        return ans;
    }
}