class Solution {
    int[][] directions = new int[][]{{1,0}, {0,1}, {-1,0}, {0,-1}};
    int[][] cache;
    int res;
    public int longestIncreasingPath(int[][] matrix) {
        cache = new int[matrix.length][matrix[0].length];
        res = 0;
        for(int i=0; i<matrix.length; ++i){
            for(int j=0; j<matrix[0].length; ++j){
                dfs(matrix, i, j, 1);
            }
        }
        return res;
    }
    public void dfs(int[][] matrix, int i, int j, int len){
        cache[i][j] = Math.max(len, cache[i][j]);
        res = Math.max(len, res);
        for(int[] dir: directions){
            int x = dir[0]+i, y = dir[1]+j;
            if(x<0 || y<0 || x>=matrix.length || y>=matrix[0].length || cache[x][y]>=len+1 || matrix[x][y]<=matrix[i][j]) continue;
            dfs(matrix, x, y, len+1);
        }
    }
}