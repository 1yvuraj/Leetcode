class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int MAX = Integer.MAX_VALUE/2;
        int[][] dis = new int[n+1][n+1];        
        for (int i=0;i<=n;i++) {
            Arrays.fill(dis[i], MAX);
            dis[i][i] = 0;
        }
        
        for (int[] time : times) {
            dis[time[0]][time[1]] = time[2];
        }

        for (int i=1; i<=n; ++i)
            for (int s=1; s<=n; ++s) 
                for (int d=1; d<=n; ++d) 
                    if (dis[s][d] > dis[s][i] + dis[i][d]) 
                        dis[s][d] = dis[s][i] + dis[i][d];
        
        int ans = 0;
        for (int i=1; i<=n; ++i) {
            ans = Math.max(ans, dis[k][i]);
        }
        return (ans == MAX) ? -1 : ans; 
    }
}