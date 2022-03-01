class Solution {    
    public int[][] bfs(int[][] mat){
        int dist = 1;
        int[] dir = {0,1,0,-1,0};
        int n = mat.length, m = mat[0].length;
        boolean[][] vis = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == 0) {
                    q.add(new int[]{i,j});
                    vis[i][j] = true;
                }
            }
        }
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                int[] curr = q.poll();
                for(int j=0;j<dir.length-1;j++){
                    int x = curr[0] + dir[j], y = curr[1] + dir[j+1];
                    if(x < 0 || x == n || y < 0 || y == m || vis[x][y]) continue;
                    vis[x][y] = true;
                    mat[x][y] = dist;
                    q.add(new int[]{x,y});
                }
            }
            dist++;
        }        
        return mat;   
    }
    public int[][] updateMatrix(int[][] mat) {   
        if(mat == null || mat.length == 0) return mat;
        return bfs(mat);  
    }
}