class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
       ArrayList<Integer>ans=new ArrayList<>();        
       TreeNode cur=root;
       while(cur!=null)
       {
           if(cur.left==null)
           {
               ans.add(cur.val);
               cur=cur.right;
           }else{
               TreeNode p=cur.left;
               while(p.right!=null && p.right!=cur){
                   p=p.right;
               }
               if(p.right==null)
               {
                   p.right=cur;
                   ans.add(cur.val);
                   cur=cur.left;
                   
               }
               if(p.right==cur)
               {
                   p.right=null;
                   cur=cur.right;
                   
               }
           }
       }
        return ans;
    }
}
