class Solution {
    int[]di={-1,0,1,0};
    int[]dj={0,-1,0,1};
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        boolean[][]arr=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1 && arr[i][j]==false)
                {
                    ans=Math.max(ans,ok(grid,arr,i,j));
                }
            }
        }
        return ans;
    }
    public int ok(int[][] grid,boolean [][]visit,int i,int j) {
      if(i>=grid.length || j>=grid[0].length || i<0 || j<0 ||grid[i][j]==0|| visit[i][j]==true )
      {
          return 0;
      }
        int nextans=0;
        visit[i][j]=true;
     for(int d=0;d<4;d++)
     {
         nextans+=ok(grid,visit,i+di[d],j+dj[d]);
     }
        
        return nextans+1;
    
    }
}