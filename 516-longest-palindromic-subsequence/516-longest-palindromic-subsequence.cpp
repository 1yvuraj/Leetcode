class Solution {
public:
//     int longestPalindrome(string s,int i,int j,vector<vector<int>>&dp){
//         if(i>=j){
//             return dp[i][j] = (i==j) ? 1 : 0;
//         }
//         if(dp[i][j]!=0)return dp[i][j];
        
//         int a = longestPalindrome(s,i+1,j-1,dp);
//         int b = longestPalindrome(s,i+1,j,dp);
//         int c = longestPalindrome(s,i,j-1,dp);
        
//         if(s[i]==s[j]){
//             return dp[i][j]=a+2;
//         }else{
//             return dp[i][j]=max(b,c);
//         }
//     }
//     int longestPalindromeSubseq(string s) {
//         int n = s.size();
//         int i = 0, j = s.size()-1;
//         vector<vector<int>>dp(n,vector<int>(n,0));
//         return longestPalindrome(s,i,j,dp);
//     }
    int LPStabu(string &s, vector<vector<int>>&dp, int I, int J) {
	int n = s.size();
	for (int gap = 0; gap < n; gap++) {
		for (int i = 0, j = gap; j < n; i++, j++) {
			if (i >= j) {
				dp[i][j] = (i == j) ? 1 : 0; //single letter then its a palindrome return 1
				continue;
			}
			int a = dp[i + 1][j - 1]; //both letters were same
			int b = dp[i + 1][j]; //moved i pointer to next character
			int c = dp[i][j - 1]; //moved j pointer to prev character
			if (s[i] == s[j]) {
				dp[i][j] = a + 2;
			}
			else {
				dp[i][j] = max(b, c);
			}
		}
	}
	return dp[I][J];
}
int longestPalindromeSubseq(string s) {
	int i = 0, j = s.size() - 1;
	vector<vector<int>>dp(j + 1, vector<int>(j + 1, 0));

	// int ans = LPSmemo(s, dp, i, j);
	int ans2 = LPStabu(s, dp, i, j);
	// display(dp);
	return ans2;
}
};