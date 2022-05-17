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
    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode>list=new LinkedList<>();
        List<List<Integer>>ans=new ArrayList<>();
        list.addLast(root);
        if(root==null)return ans;
        while(list.size()>0)
        {
           int size=list.size();
             ArrayList<Integer>main=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode node=list.removeFirst();
                 main.add(node.val);
                if(node.left!=null)
                {
                    list.addLast(node.left);
                }
                if(node.right!=null)
                {
                    list.addLast(node.right);
                }
                
                    
            }
            ans.add(main);
            
            
        }
        
        return ans;
    }
}