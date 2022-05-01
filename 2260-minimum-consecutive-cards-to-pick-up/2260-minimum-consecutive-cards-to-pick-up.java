class Solution {
    public int minimumCardPickup(int[] cards) {
     HashMap<Integer,Integer>map=new HashMap<>();
         int min=(int)1e9;
        for(int i=0;i<cards.length;i++)
        {
            if(map.containsKey(cards[i]))
            {
                min=Math.min(min,i-map.get(cards[i])+1);
               
                
            }
             map.put(cards[i],i);
        }
        
        return min==(int)1e9?-1:min;
    }
}