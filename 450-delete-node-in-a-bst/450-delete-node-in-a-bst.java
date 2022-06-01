class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        return help(root,key);
    }
     public TreeNode help(TreeNode root, int key) {
        if(root==null)return null;
        if(root.val<key)
        {
            root.right=help(root.right,key);
            return root;
        }else if(root.val>key){
            root.left=help(root.left,key);
            return root;
        }else{
            if(root.left==null && root.right==null)
            {
                return null;
            }else if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }else{
                int m=max(root.left);
                root.val=m;
                 root.left=help(root.left,m);
                return root;
            }
        }
    }
    public int max(TreeNode root) {
        while(root.right!=null)
        {
            root=root.right;
        }
        return root.val;
    }
}