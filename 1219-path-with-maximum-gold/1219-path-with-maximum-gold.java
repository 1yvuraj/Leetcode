class Solution {
    public int getMaximumGold(int[][] grid) {
        int [][]dp=new int[grid.length][grid[0].length];
        boolean [][]b=new boolean[grid.length][grid[0].length];
        int min=0;
        for (int j = 0; j < grid.length; j++) {
             for (int i = 0; i < grid[0].length; i++) {
             if(grid[j][i]!=0)
            min = Math.max(min, goldmine(grid, j, i));
             }
        }
        return min;
    }

    public int goldmine(int[][] a, int sr, int sc) {
        if (sr < 0 || sc < 0 || sr >= a.length || sc >= a[0].length||a[sr][sc]==0) {
            return 0;
        }
        

        int temp=a[sr][sc];
        a[sr][sc]=0;
        int l = goldmine(a, sr, sc + 1);
        int r = goldmine(a, sr, sc - 1);
        int d= goldmine(a, sr - 1, sc );
        int u= goldmine(a, sr+1, sc);
        a[sr][sc]=temp;
        
        //dp[sr][sc] = Math.max(l, Math.max(r,Math.max(u, d))) + a[sr][sc];

        return Math.max(l, Math.max(r,Math.max(u, d))) + a[sr][sc];
    }
}
        