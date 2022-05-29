class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long[]arr=new long[n];
        long ans=0;
        long fact=1;
        for(int[]p:roads)
        {
            arr[p[0]]++;
            arr[p[1]]++;
            
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            ans+=arr[i]*fact;
            fact++;
        }
        return ans;
        
        
    }
}