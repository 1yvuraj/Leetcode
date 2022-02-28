class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String>anss=new ArrayList<>();
       
        String ans="";
        int i=0;
       while(i<nums.length)
       {
          int start=nums[i];
           ans="";
          while(i+1<nums.length && nums[i]+1==nums[i+1])i++;
           if(start!=nums[i])
           {
               ans+=start+"->"+nums[i];
               anss.add(ans);
            }else{
               ans+=nums[i];
               anss.add(ans);
           }
           i++;
           
           
       }
        return anss;
    }
}