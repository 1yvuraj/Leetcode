class Solution {
   
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>a=new ArrayList<>();
        ArrayList<Integer>ans=new ArrayList<>();
        help(nums,0,ans,a);
        return a;
        
    }
     public void  help(int[] nums,int idx,ArrayList<Integer>ans,List<List<Integer>>a) {
       if(idx==nums.length)
       {
           
           a.add(new ArrayList<>(ans));
           return;
       }
         ans.add(nums[idx]);
         
         help(nums,idx+1,ans,a);

         ans.remove(ans.size()-1);
         help(nums,idx+1,ans,a);
    }
}