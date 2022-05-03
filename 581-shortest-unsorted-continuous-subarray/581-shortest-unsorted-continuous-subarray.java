class Solution {
    public int findUnsortedSubarray(int[] nums) {
      int []arr=nums.clone();
      int i=0;
        int j=nums.length-1;
        Arrays.sort(arr);
        while(i<j)
        {
            if(nums[i]==arr[i])
            {
                i++;
            }else if(nums[j]==arr[j])
            {
                j--;
            }
            else{
                break;
            }
            
        }
        return j-i==0?0:j-i+1;
    }
}