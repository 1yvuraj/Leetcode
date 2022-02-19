class Solution {
    public String removeKdigits(String num, int k) {
        
        Stack<Character> st=new Stack<>();
        int size=num.length();
        
        if(k==size)
            return "0";
        
        int i=0;
        while(i<size)
        {
            while(k>0 && !st.isEmpty() && st.peek()>num.charAt(i))
            {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
            i++;
        }
        while(k>0 && !st.isEmpty())
        {
            st.pop();
            k--;
        }
        
        StringBuilder sb=new StringBuilder();
        
        while(!st.isEmpty())
        {
            char curr_char=st.pop();
            sb.append(curr_char);
        }
        sb.reverse();
        
        while(sb.toString().startsWith("0"))
        {
           sb.deleteCharAt(0); 
        }
            
    return sb.length() == 0 ? "0" : sb.toString();
}
}