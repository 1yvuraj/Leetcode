class Solution {

    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                while (st.size() > 0 &&  st.peek ()> 0 && st.peek() < arr[i] * -1) {
                    st.pop();
                }
                if (st.size() > 0 && st.peek() == arr[i] * -1) {
                    st.pop();
                } else if (st.size() > 0 && st.peek() >arr[i] * -1) {
                    continue;
                } else {
                    st.push(arr[i]);
                }
            } else {
                st.push(arr[i]);
            }
        }
        int[] ans = new int[st.size()];
        int idx = st.size()-1;
        while (st.size() > 0) {
            ans[idx] = st.pop();
            idx--;
        }
        return ans;
    }
}

// class Solution {
// public int[] asteroidCollision(int[] ast)
// {

//     Stack<Integer> st = new Stack<>();
//     int n=ast.length;
//    for(int i=0;i<n;i++)
//     {
//         if(ast[i]<=0)
//         {
//             while(!st.isEmpty() && st.peek ()> 0 && st.peek()<ast[i]*-1)
//                 st.pop();
            
//             if(!st.isEmpty() && st.peek()==ast[i]*-1)
//                 st.pop();
            
//             else if(!st.isEmpty() && st.peek() >= -1*ast[i])
//                 continue;
//             else
//                 st.push (ast[i]);
//         }
//        else
//            st.push(ast[i]);
        
        
//     }
    
//     n=st.size();
//     int arr[]=new int[n];
    
//     for(int i=n-1;i>=0;i--)
//     arr[i]=st.pop();
//     return arr;
	
	
// 	}
// }
