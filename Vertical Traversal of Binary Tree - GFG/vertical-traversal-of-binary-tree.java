// { Driver Code Starts
//Initial Template for Java

//Contributed by Sudarshan Sharma
import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
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
                Solution obj = new Solution();
                ArrayList <Integer> res = obj.verticalOrder(root);
                for (Integer num : res) System.out.print(num + " "); 
                System.out.println();
    	        
	        }
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to find the vertical order traversal of Binary Tree.
    static class pair{
        Node node;
        int h;
        pair(Node node,int h)
        {
            this.node=node;
            this.h=h;
        }
    }
    static ArrayList <Integer> verticalOrder(Node root)
    {
       LinkedList<pair>list=new LinkedList<>();
       HashMap<Integer,ArrayList<Integer>>map=new HashMap<>();
       int min =(int)1e9;
       int max=-(int)1e9;
       list.add(new pair(root,0));
       while(list.size()>0)
       {
           pair p=list.removeFirst();
           if(!map.containsKey(p.h))
           {
               map.put(p.h, new ArrayList<>());
               map.get(p.h).add(p.node.data);

           }else{
            map.get(p.h).add(p.node.data);
           }
           min=Math.min(min,p.h);
           max=Math.max(max,p.h);
           if(p.node.left!=null)
           {
               list.addLast(new pair(p.node.left,p.h-1));
           }
           if(p.node.right!=null)
           {
               list.addLast(new pair(p.node.right,p.h+1));
           }
       }
       ArrayList<Integer>main=new ArrayList<>();
       for(int i=min;i<=max;i++)
       {
        ArrayList<Integer>ans=map.get(i);
        //Collections.sort(ans);
        for(int j=0;j<ans.size();j++)
        {
            main.add(ans.get(j));
        }
       }
       return main;

    }
}