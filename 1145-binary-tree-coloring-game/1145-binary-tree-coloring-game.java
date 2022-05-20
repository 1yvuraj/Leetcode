class Solution {
    int ls=0;
    int rs=0;
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        size(root,n,x);
        int others=n-ls-rs-1;
        int max=Math.max(others,Math.max(ls,rs));
        return max>n/2;
        
    }
     public int  size(TreeNode root, int n, int x) {
        if(root==null)return 0;
        int left=size(root.left,n,x);
        int right=size(root.right,n,x);
        if(root.val==x)
        {
            ls=left;
            rs=right;
        }
        return left+right+1;
         
    }
}