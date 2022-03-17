class Solution {
    int i=0;
    public int scoreOfParentheses(String s) {
        return helper(s);
    }
    private int helper(String s){
        if(i>=s.length()) return 0;
        Stack<Character> stack=new Stack<>();
        int score=0;
        while(i<s.length()){
        if(s.charAt(i)=='('){
            stack.push('(');
            i=i+1;
            score=score+helper(s);
        }else{
            i++;
            if(stack.empty()) return 1;
            stack.pop();
            return score*2;
        }
        }
        return score;
    }
}