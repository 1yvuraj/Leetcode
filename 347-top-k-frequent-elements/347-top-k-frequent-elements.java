class Solution {
    //Pair Class
    public class Pair implements Comparable<Pair>{
        int val;
        int freq;
        Pair(int val,int freq){
            this.val=val;
            this.freq=freq;
        }
        
        public int compareTo(Pair o){
           return  this.freq-o.freq;
        }
    }
    
    //Approach-> 
    // 1. Create a hashmap and store frequencies in it(WHy hashmap-->because we can store frequencies using only hashmap efficiently)
    // 2. Now we want k frequent so use priority queue to take out k  frequent
    // 3. Our priority queue should be able to remove elements having  less frequency,so we can achieve this using Comparable and  compareTo function
    // 4. Now add the elements along with freq in priority queue and keep removing when size become greater than k
    // 5. Finally we will be left with just k elements with max freq
        
                 
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        for(int val:nums){
            if(hm.containsKey(val)){
                hm.put(val,hm.get(val)+1);
            }
            else{
                hm.put(val,1);
            }
        }
        
        int arr[]=new int[k];
        
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(int v:hm.keySet()){
            pq.add(new Pair(v,hm.get(v)));
            if(pq.size()>k){
                pq.remove();
            }
        }
        
        int i=0;
        while(pq.size()>0){
            Pair peek=pq.remove();
            arr[i++]=peek.val;
        }
        
        return arr;
    }
}