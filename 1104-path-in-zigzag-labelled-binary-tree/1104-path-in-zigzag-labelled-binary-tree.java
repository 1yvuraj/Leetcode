class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        List<Integer>ans=new ArrayList<>();
        int n=label;
        int level=1;
        int curvalue=0;
        while(curvalue<n)
        {
           curvalue+=level;
            level*=2;
        }
        level/=2;
        while(n!=1)
        {
            ans.add(n);
            int c=3*level-n-1;
            int p=(c/2);
            n=p;
            level/=2;
        }
        ans.add(1);
        Collections.sort(ans);
        return ans;
    }
}