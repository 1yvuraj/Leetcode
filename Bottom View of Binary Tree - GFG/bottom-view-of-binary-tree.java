// { Driver Code Starts
//Initial Template for Java


//Contributed by Sudarshan Sharma
import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node
{
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references
 
    // Constructor of tree node
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}



class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t-- > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
    	        Solution ob = new Solution();
			    ArrayList <Integer> res = ob.bottomView(root);
			    for (Integer num : res) System.out.print (num + " ");
		     	System.out.println();
	        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static class pair{
        Node node;
        int cn;
        pair(Node node,int cn)
        {
            this.node=node;
            this.cn=cn;
        }
    }
    static ArrayList<Integer> bottomView(Node root)
    {
        ArrayList<Integer>ans=new ArrayList<>();
        int min=(int)1e9;
        int max=-(int)1e9;
        
        LinkedList<pair>list=new LinkedList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        list.addLast(new pair(root,0));
        if(root==null)return ans;
        while(list.size()>0)
        {
            int size=list.size();
            
                pair p=list.removeFirst();
                
                map.put(p.cn,p.node.data);
                  min=Math.min(min,p.cn);
                  max=Math.max(max,p.cn);
                
                if(p.node.left!=null)
                {
                     list.addLast(new pair(p.node.left,p.cn-1));
                }
                if(p.node.right!=null)
                {
                    list.addLast(new pair(p.node.right,p.cn+1));
                }
            
        }
         for(int i=min;i<=max;i++)
         {
             ans.add(map.get(i));
         }
       
        return ans;
        
    }
}