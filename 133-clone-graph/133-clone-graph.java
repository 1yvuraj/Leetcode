/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    HashMap<Integer,Node> hp=new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node==null)
            return null;
        Node newnode=new Node(node.val);
        hp.put(node.val,newnode);
        for(Node x:node.neighbors)
        {
            if(!hp.containsKey(x.val))
            {
                Node temp=cloneGraph(x);
                newnode.neighbors.add(temp);
            }
            else
                newnode.neighbors.add(hp.get(x.val));
        }
        return newnode;
    }
}