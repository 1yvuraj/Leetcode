class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>>a= new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++){
            int l=j+1;
            int r=nums.length-1;
            int tar=target-nums[i]-nums[j];
            while(l<r)
            {
                if(nums[l]+nums[r]==tar) 
                {
                    ArrayList<Integer>ans=new ArrayList<>();
                    ans.add(nums[i]);
                     ans.add(nums[j]);
                     ans.add(nums[l]);
                     ans.add(nums[r]);
                     a.add(ans);
                    while(l+1<nums.length && nums[l]==nums[l+1])l++;
                    while( r>0 && nums[r]==nums[r-1])r--;
                    l++;
                    r--; 
                    
                }
                else if(nums[l]+nums[r]<tar)
                {
                    l++;
                }
                else
                {
                    r--;
                }
                
            }
             while(j+1<nums.length && nums[j]==nums[j+1])j++;
             }
         while(i+1<nums.length && nums[i]==nums[i+1])i++;
        }
        return a;
    }
}  
