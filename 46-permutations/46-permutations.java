class Solution {
    List<List<Integer>> out = new ArrayList<>() ; 
    int n ; 
    int[] nums ; 
    public List<List<Integer>> permute(int[] nums) {
        this.nums = nums ; 
        this.n = nums.length ; 
        List<Integer> l = new ArrayList<>() ; 
        dfs(l , new HashSet<Integer>()); 
        return out ;
    }
    
    
    public void dfs(List<Integer> currentList, HashSet<Integer>s ){
        if(currentList.size() == n){
            out.add(new ArrayList<>(currentList)); 
            return ; 
        }
        
        for(int i = 0 ; i < n ; i++){
            if(!s.contains(nums[i])){
                currentList.add(nums[i]); 
                s.add(nums[i]); 
                dfs(currentList , s ); 
                currentList.remove(currentList.size() -1);  
                s.remove(nums[i]);
            }
        }
    }
}