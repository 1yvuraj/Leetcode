// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        if(m[0][0]==0|| m[m.length-1][m[0].length-1]==0)
        {
            ArrayList<String>ans=new ArrayList<>();
            String a="-1";
            ans.add(a);
            return ans;
        }
        int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 },{0,1}};
        String[] dirS = { "U", "D", "L","R" };
        ArrayList<String>ans=new ArrayList<>();
        floodFill(0, 0, m.length-1, m[0].length-1, dir, dirS, "",ans,m);
        return ans;
    }
    public static int floodFill(int sr, int sc, int er, int ec,int[][] dir, String[] dirS,
            String psf,ArrayList<String>ans,int[][]m) {
        if (sr == er && sc == ec) {
            ans.add(psf);
            return 1;
        }

        m[sr][sc] = 0;
        int count = 0;
        for (int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if (r >= 0 && c >= 0 && r <= er && c <= ec && m[r][c]==1) {
                count += floodFill(r, c, er, ec, dir, dirS, psf + dirS[d],ans,m);
            }

        }
        m[sr][sc] = 1;
        return count;
    }

}