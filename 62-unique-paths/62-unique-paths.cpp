class Solution {
public:
    int mypaths2(int sr, int sc, int dr, int dc, vector<vector<int>> &dir,
             vector<vector<int>>&dp) {
	if (sr == dr && sc == dc) {
		return dp[sr][sc] = 1;
	}
	if (dp[sr][sc] != 0) {
		return dp[sr][sc];
	}
	int count = 0;
	for (int d = 0; d < dir.size(); d++) {
		int r = sr + dir[d][0];
		int c = sc + dir[d][1];
		if (r >= 0 && c >= 0 && r <= dr && c <= dc) {
			count += mypaths2(r, c, dr, dc, dir, dp);
		}
	}
	return dp[sr][sc] = count;
    }
    int uniquePaths(int n, int m) {
        vector<vector<int>>dir = {{0, 1}, {1, 0}};
	    vector<vector<int>>dp(n + 1, vector<int>(m + 1, 0));
        return mypaths2(0,0,n-1,m-1,dir,dp);
    }
};