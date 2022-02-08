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
class BSTIterator {
    LinkedList<TreeNode>s;
    public BSTIterator(TreeNode root) {
      s=new LinkedList<>();
      addleftnode(root);

    }
    private void addleftnode(TreeNode node) {
     while(node!=null)
     {
         this.s.addFirst(node);
         node=node.left;
     }

    }
    public int next() {
     TreeNode node=this.s.removeFirst();
      addleftnode(node.right);
      return node.val;
    }

    public boolean hasNext() {
      return this.s.size()!=0;
    }
   
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */