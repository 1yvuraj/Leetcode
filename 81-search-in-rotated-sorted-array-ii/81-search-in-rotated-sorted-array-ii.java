class Solution {
    public boolean search(int[] nums, int target) {
               int s=0;
        int e=nums.length-1;
        int ans=0;
       
        while(s<=e)
        {
            int mid=(s+e)/2;
            if(mid<e&& nums[mid]>nums[mid+1])
            {
                ans=mid;
                break;
            }
            else if ( s<mid && nums[mid]<nums[mid-1])
            {
                ans=mid-1;
                break;
            }
           else if ( nums[mid]==nums[s] && nums[s]==nums[e])
            {
               //
                if (s < e && nums[s] > nums[s + 1]) {
                    ans=s;
                    break;
                }
                s=s+1;
                if (e > s && nums[e] < nums[e - 1]) {
                   ans= e - 1;
                    break;
                }
                e=e-1;
            }
            else if(nums[mid]<nums[s])
            {
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        if(nums[ans]==target)
        {
            return true;
        }
        else 
        {
            int ans1=binerysearch(nums,0,ans,target);
            if(ans1!=-1)
            {
                return true;
            }
           
            
        }
        return binerysearch(nums,ans+1,nums.length-1,target)!=-1?true:false;
        
    }
     public int binerysearch(int[] nums, int s,int e,int target) {
      
        
        while(s<=e)
        {
            int mid=(s+e)/2;
            if(nums[mid]==target)
            {
               return mid;
            }
            else if (nums[mid]<target)
            {
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
        }
        return -1;
    }
}