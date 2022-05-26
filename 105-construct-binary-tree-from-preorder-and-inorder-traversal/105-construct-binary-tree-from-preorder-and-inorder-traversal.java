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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
            
        }
        return contruct(0,preorder.length-1,0,inorder.length-1,inorder,preorder,map);
    }
    public TreeNode contruct(int pl,int ph,int il,int ih,int[]inorder,int []preorder,HashMap<Integer,Integer>map) {
        if(pl>ph || il>ih)return null;
        TreeNode node=new TreeNode();
        node.val=preorder[pl];
        int idx=map.get(preorder[pl]);
        int lhs=map.get(preorder[pl])-il;
        node.left=contruct(pl+1,pl+lhs,il,idx-1,inorder,preorder,map);
        node.right=contruct(pl+lhs+1,ph,idx+1,ih,inorder,preorder,map);
        return node;
    }
}