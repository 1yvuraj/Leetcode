// { Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
class Solution{
		

	public:
	int minOp(string &s1, string &s2, int n, int m, vector<vector<int>>&dp) {
	if (n == 0 || m == 0) {
		return dp[n][m] = (n != 0) ? n : m;
	}
	if (dp[n][m] != -1)return dp[n][m];
	int a = minOp(s1, s2, n - 1, m - 1, dp);
	int b = minOp(s1, s2, n - 1, m, dp); //delete character
	int c = minOp(s1, s2, n, m - 1, dp);//insert character
	if (s1[n - 1] == s2[m - 1]) {
		return dp[n][m] = a;
	}
	else return dp[n][m] = min(b, c) + 1;
}
int minOperations(string s1, string s2) {
	int n = s1.size(), m = s2.size();
	vector<vector<int>>dp(n + 1, vector<int>(m + 1, -1));
	return minOp(s1, s2, n, m, dp);
}
};

// { Driver Code Starts.
int main() 
{
   	
   
   	int t;
    cin >> t;
    while (t--)
    {
        string s1, s2;
        cin >> s1 >> s2;

	    Solution ob;
	    cout << ob.minOperations(s1, s2) << "\n";
	     
    }
    return 0;
}

  // } Driver Code Ends