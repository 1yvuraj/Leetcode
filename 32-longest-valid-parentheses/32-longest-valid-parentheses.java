class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> nm = new Stack<>();
        int m=0;
        int left=-1;
        for(int j=0;j<s.length();j++)
        {
            if(s.charAt(j)=='(')
                nm.push(j);            
            else 
            {
                if (nm.isEmpty())
                    left=j;
                else
                {
                    nm.pop();
                    if(nm.isEmpty())
                        m=Math.max(m,j-left);
                    else
                        m=Math.max(m,j-nm.peek());
                }
            }
        }
        return m;
    }
}