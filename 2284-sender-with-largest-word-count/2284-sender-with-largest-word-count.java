class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String,Integer>map=new HashMap<>();
        String ans="";
        for(int i=0;i<senders.length;i++)
        {
            
                String[]str=messages[i].split(" ");  
                if(map.containsKey(senders[i]))
                {
                    map.put(senders[i],map.get(senders[i])+str.length);
                }else{
                     map.put(senders[i],str.length);
                }
            
        }
        int max=-1;
        
        for(int i=0;i<senders.length;i++)
        {
            if(max<map.get(senders[i]))
            {
                max=map.get(senders[i]);
                ans=senders[i];
                
            }else if (max==map.get(senders[i])){
                  if(senders[i].compareTo(ans) > 0)
                      ans=senders[i];
             }
            
               
        }
       
        
        
        return ans;
    }
}