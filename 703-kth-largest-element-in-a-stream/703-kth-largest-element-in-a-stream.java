class KthLargest {
    int k;
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int i=0; i<nums.length; i++){
            pq.add(nums[i]);
            if(pq.size()>k)
                pq.poll();
        }
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size()>k)
            pq.poll();
        return pq.peek();
    }
}