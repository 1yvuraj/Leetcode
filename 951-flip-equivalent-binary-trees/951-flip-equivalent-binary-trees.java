class Solution {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        //if(root1==null && root2==null)return true;
        return help(root1, root2);
    }
    public boolean help(TreeNode root1, TreeNode root2) {
        
         if(root1 == null && root2 == null){
            return true;
         }
       else if (root1!=null && root2!=null &&root1.val==root2.val) {
            return  help(root1.left, root2.left) && help(root1.right, root2.right) || help(root1.left, root2.right) && help(root1.right, root2.left);
        }else{
            return false;
        }
        
        
        //return b;
    }
}
