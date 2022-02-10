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
     public static class pair {
        int RtNpath = -(int)1e9;
        int NtNpath = -(int)1e9;
    }
    public int maxPathSum(TreeNode root) {
        if(root==null)return 0;
        if(root.left==null && root.right==null )return root.val;
        
        return Math.max(maxPathSu(root).NtNpath,maxPathSu(root).RtNpath);
    }

    
    public static int max(int... arr)
    {
        int maxsum=arr[0];
        for(int e:arr)
        {
            maxsum=Math.max(e,maxsum);
        }
        return maxsum;
    }

    public static pair maxPathSu(TreeNode root) {
        if (root == null) return new pair();
       
        pair l = maxPathSu(root.left);
        pair r = maxPathSu(root.right);
        pair ans = new pair();
        int RtNpath=Math.max(l.RtNpath,r.RtNpath)+root.val;
        int NtNpath=max(l.NtNpath,r.NtNpath,l.RtNpath+r.RtNpath+root.val,root.val,RtNpath);
        ans.RtNpath=Math.max(root.val,RtNpath);
        ans.NtNpath=NtNpath;
        
        return ans;
    }
}
