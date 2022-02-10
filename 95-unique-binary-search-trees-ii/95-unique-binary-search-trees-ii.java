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
    public List<TreeNode> generateTrees(int n) {
        return help(1,n);
    }
    public List<TreeNode> help(int si,int e) {
        if(si>e)
        {
           List<TreeNode>a=new ArrayList<>();
            a.add(null);
            return a;
        }
         List<TreeNode>ans=new ArrayList<>();
        for(int i=si;i<=e;i++)
        {
            List<TreeNode>l=help(si,i-1);
            List<TreeNode>r=help(i+1,e);
            for(TreeNode Left:l)
            {
                for(TreeNode right:r)
                {
                  TreeNode root=new TreeNode(i);
                  root.left=Left;
                    root.right=right;
                    ans.add(root);
                }
            }
        }
        return ans;
    }
}