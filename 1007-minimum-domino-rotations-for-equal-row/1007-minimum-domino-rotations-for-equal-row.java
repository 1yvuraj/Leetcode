class Solution {
public int minDominoRotations(int[] tp, int[] bt) {
HashMap<Integer,Integer> hm = new HashMap<>();
int i=0,n=tp.length;
for(i=0;i<n;i++)
{
hm.put(tp[i],hm.getOrDefault(tp[i],0)+1);
hm.put(bt[i],hm.getOrDefault(bt[i],0)+1);
}

    int mf =0,mi=0;
    int t=0,b=0;
    for(int x:hm.keySet())
    {
            if(hm.get(x)>mf)
            {
                mf=hm.get(x);
                mi=x;
            }
    }
    System.out.println(mi+" "+mf);
    if(mf<n)
        return -1;
    
    for(i=0;i<n;i++){
      
            if(tp[i]==mi)
            {
                t++;
               
            }
     if(bt[i]==mi)
            {
                b++;
               
            }
        if(tp[i] ==mi && bt[i]==mi)
        {
            t--;
            b--;
        }
            
      if(tp[i] != mi && bt[i] != mi){
          //  System.out.println(t+" "+b);
            return -1;
        }
    }
    //System.out.println(t+" "+b);
    return  Math.min(t,b);
    
}
}