class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        HashSet<String>map=new HashSet<>();
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            StringBuilder sb=new StringBuilder();
            c=0;
            
            for(int j=i;j<nums.length ;j++)
            {
                sb.append(nums[j]+" ");
                //System.out.println(ans);
                if(nums[j]%p==0) c++;
                if(c>k)break;
                // if(countDistinct(sb.toString(),k,p))map.add(sb.toString());
                map.add(sb.toString());
            }
        }
        return map.size();
    }
//     public boolean countDistinct(String str, int k, int p) {
//         int c=0;
//         String[]ans=str.split(" ");
//         for(int i=0;i<ans.length;i++)
//         {
            
//             if(Integer.parseInt(ans[i])%p==0)
//             {
//                 c++;
//             }
//         }
//         return c<=k;
//     }
}