/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int h(TreeNode root) {
        return root==null?0:Math.max(h(root.left),h(root.right))+1;
    }
    public boolean isEvenOddTree(TreeNode root) {
        int hth=h(root);
        int[]ans=new int[hth];
        for(int i=1;i<ans.length;i+=2)ans[i]=Integer.MAX_VALUE;
        return help(root,0,ans);
    }
    
     public  boolean help (TreeNode root,int level,int[]ans) {
      if(root==null)return true;
      if(level%2==0)
      {
          if(root.val%2==0)return false;
          if(ans[level]>=root.val)return false;
          ans[level]=root.val;
      }else{
           if(root.val%2==1)return false;
          if(ans[level]<=root.val)return false;
          ans[level]=root.val;
      }    
    return help(root.left,level+1,ans)&&help(root.right,level+1,ans);
    }
}