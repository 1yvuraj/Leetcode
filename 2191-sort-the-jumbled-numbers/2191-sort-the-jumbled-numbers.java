class Solution {
    public class Pair implements Comparable<Pair>{
        int idx;
        int no;
        Pair(int idx,int no){
            this.idx=idx;
            this.no=no;
        }
        public int compareTo(Pair o)
        {
            if(this.no == o.no) return this.idx - o.idx;
            else return this.no - o.no;
        }
    }
    public int[] sortJumbled(int[] mapping, int[] nums) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int []ans=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            String ans1=nums[i]+"";
            String ans2="";
            for(int j=0;j<ans1.length();j++){
                ans2+=mapping[ans1.charAt(j)-'0'];
            }
            
          
           pq.add(new Pair(i,Integer.parseInt(ans2)));
        }
        int i=0;
        while(pq.size()!=0)
        {
            Pair r=pq.remove();
            ans[i]=nums[r.idx];
            i++;
        }

       
        return ans;
    }
    
    
}