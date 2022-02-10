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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
    if(depth==1)
    {
        TreeNode node=new TreeNode(val);
        node.left=root;
        return node;
    }
      
    LinkedList<TreeNode>q=new LinkedList<>();
    ArrayList<TreeNode>store=new ArrayList<>();
    q.addLast(root);
    while(depth-->2)
    {
       int size=q.size();
       //LinkedList<TreeNode>tq=new LinkedList<>();
       while(size-->0)
       {
          TreeNode r=q.removeFirst();
          
          if(r.left!=null)
          {
            q.addLast(r.left);
          }
          if(r.right!=null)
          {
            q.addLast(r.right);
          }
       }
       
       

    }
    while(q.size()>0)
    {
      TreeNode r=q.removeFirst();
       TreeNode rootl=r.left;
        TreeNode rootr=r.right;
        r.left=new TreeNode(val);
        r.right=new TreeNode(val);
        r.left.left=rootl;
        r.right.right=rootr;
    }

    return root;
    
  }  
    
}