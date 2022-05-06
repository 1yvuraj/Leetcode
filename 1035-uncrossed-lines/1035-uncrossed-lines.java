class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
       int n=nums1.length;
	   int m=nums2.length;
	   int dp[][]=new int[n+1][m+1];
	   for(int[] d:dp) Arrays.fill(d,-1);
	   return help(nums1,nums2,n,m,dp);
    }
    public int help(int[] n1,int[] n2,int n,int m,int[][] dp){
	    if(n==0)return dp[n][m]=0;
        else if(m==0)return dp[n][m]=0;
	    
	    if(dp[n][m]!=-1){
	        return dp[n][m];
	    }
	    
	    int a=help(n1,n2,n-1,m-1,dp);
	    int b=help(n1,n2,n,m-1,dp);
	     int c=help(n1,n2,n-1,m,dp);
	    
	    if(n1[n-1]==n2[m-1]){
	       return dp[n][m]=a+1;
	    }
	    
	    else{
	        return dp[n][m]=Math.max(b,c);
	    }
	    
	    
	    
	    
	}
}