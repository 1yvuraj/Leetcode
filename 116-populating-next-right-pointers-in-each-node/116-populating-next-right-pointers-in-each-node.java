class Solution {
    public Node connect(Node root) {
        if (root==null || root.left == null) return root;
        
        // up down approach, all the process before the recursive function
        // for nodes share same root, simply assign the next of right node to left node
        root.left.next = root.right;
        
        // for nodes not sharing same root，we need to find out if the root have next, 
        // if it does，point the next node to the left node of root.next
        if (root.next != null)
        root.right.next = root.next.left;
        
        // recursive function
        connect(root.right);
        connect(root.left);
        return root;
        
    }    
    
}
