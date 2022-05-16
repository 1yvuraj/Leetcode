class Solution {
    public int largestCombination(int[] candidates) {
       int[]ans=new int[32];
       for(int i=0;i<ans.length;i++)
       {
          for(int j=0;j<candidates.length;j++)
          {
              if(((candidates[j]>>i)&1)==1)ans[i]++;
          }
       }
        int max=-(int)1e9;
        for(int i=0;i<ans.length;i++)
       {
           max=Math.max(max,ans[i]);
       }
        return max;
        
    }
}