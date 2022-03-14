class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] paths = path.split("/");
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<paths.length;i++){
            if(!stack.isEmpty() && paths[i].equals("..")){
                stack.pop();
            }else if(!paths[i].equals(".")&& !paths[i].equals("..") && !paths[i].equals("")){
                stack.push(paths[i]);
            }
        }
        if(stack.isEmpty()) sb.append("/");
        
        while(!stack.isEmpty()){
            sb.insert(0,stack.pop()).insert(0,"/");
        }
        return sb.toString();
        
        
    }
}