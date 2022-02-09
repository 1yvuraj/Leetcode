class Solution {
    public int findPairs(int[] a, int k) {
        int n=a.length,count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(a[i]-k) && map.get(a[i]-k)!=0 && k!=0)
            {
                count++;
                map.put(a[i]-k,0);
            }
            if(map.containsKey(a[i]-k) && map.get(a[i]-k)>1)
            {
                count++;
                map.put(a[i]-k,0);
            }
            
        }
        return count;
    }
}