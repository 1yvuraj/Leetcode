class Solution {
    public boolean isValid(String str) {
        Stack<Character> st = new Stack<>();

        for(char ch: str.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            } else if(ch == ')'){
                if(st.size() == 0){
                    
                    return false;
                } else if(st.peek() != '('){
                    return false;
                } else {
                    st.pop();
                }
            } else if(ch == '}'){
                if(st.size() == 0){
                    return false;
                } else if(st.peek() != '{'){
                    return false;
                } else {
                    st.pop();
                }
            } else if(ch == ']'){
                if(st.size() == 0){
                    return false;
                } else if(st.peek() != '['){
                    return false;
                } else {
                    st.pop();
                }
            }
        }

        if(st.size() > 0){
            return false;
        } 
        return true;
    }
}