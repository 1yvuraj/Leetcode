class Solution {
   
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>>ans=new ArrayList<>();
         ArrayList<Integer>a=new ArrayList<>();
         combinationSums(candidates,0,target,a,ans);
         
         return ans;
    }
    public void combinationSums(int[] candidates, int idx,int amt,  ArrayList<Integer>a, List<List<Integer>>ans) {
        if(amt<0)
        {
            return;
        }
        if(idx==candidates.length)
        {
            if(amt==0)
            {
                
                ans.add(new ArrayList<>(a));
                return;
            }
        }
        if(idx<candidates.length){
        a.add(candidates[idx]);
        combinationSums(candidates,idx,amt-candidates[idx],a,ans);
        a.remove(a.size() - 1);
        combinationSums(candidates,idx+1,amt,a,ans);
        //a.remove(a.size() - 1);
        }
       
        
    }
}