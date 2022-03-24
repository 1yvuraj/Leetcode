class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>>a= new ArrayList<>();
        HashSet<ArrayList<Integer>>set=new HashSet<>();
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
                     set.add(ans);
                    
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
            
             }
        
        }
        
        for (ArrayList<Integer> i : set) {
			a.add(i);
		}
        return a;
    }
}  
