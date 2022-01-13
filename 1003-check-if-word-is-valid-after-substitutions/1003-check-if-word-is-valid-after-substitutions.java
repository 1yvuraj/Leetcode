class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            
            if(s.charAt(i)=='c')
            {   
                if(stack.size()>=2 && stack.pop()=='b'&&stack.pop()=='a'){
                  
                }
                else
                {
                    return false;
                }
                
             } 
            else{
            stack.push(s.charAt(i));
            }
        }
        
        return stack.size()==0;
    }
}