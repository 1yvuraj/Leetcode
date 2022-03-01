class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        
        int max =0;
        
        for(int j=0;j<k ;j++)
        {
                sum=sum+nums[j];
        } 
        max=sum;
        for(int i=k;i<nums.length;i++)
        {  
             
             sum=sum+nums[i]-nums[i-k];
             max=Math.max(max,sum);
        }
        
         
        
        return (max*1.0)/k;
    }
}