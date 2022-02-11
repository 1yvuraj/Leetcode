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

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode>ans=set(root,to_delete);
        return ans;
    }
    public List<TreeNode> set( TreeNode root,int[] to_delete) {
        List<TreeNode>ans=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        for(int val:to_delete)set.add(val);
        help(root,set,ans);
        if(!set.contains(root.val))
        {
            ans.add(root);
        }
            return ans;
    }
     public TreeNode help(TreeNode root,HashSet<Integer>set ,List<TreeNode>ans) {
         if(root==null)return null;
         root.left=help(root.left,set,ans);
         root.right=help(root.right,set,ans);
         if(set.contains(root.val))
         {
             if(root.left!=null)ans.add(root.left);
             if(root.right!=null)ans.add(root.right);
             return null;
             
         }
         return root;
         
    }
}