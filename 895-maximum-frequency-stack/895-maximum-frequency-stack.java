class FreqStack {
    HashMap<Integer,Integer> fmap;
    HashMap<Integer,Stack<Integer>> smap;
    public FreqStack() {
        fmap=new HashMap<>();
        smap=new HashMap<>();
    }
    
    public void push(int val) {
       
        fmap.put(val,fmap.getOrDefault(val,0)+1);
        int freq=fmap.get(val);
        
        if(smap.containsKey(freq)){
            smap.get(freq).push(val);
        }
        else{
            smap.put(freq,new Stack<Integer>());
            smap.get(freq).push(val);
        }
    }
    
    public int pop() {
        int maxf=smap.size();
        
        int pval=smap.get(maxf).pop();
        fmap.put(pval,fmap.getOrDefault(pval,0)-1);
        
        if(smap.get(maxf).size()==0){
            smap.remove(maxf);
        }
        
        if(fmap.get(pval)==0){
            fmap.remove(pval);
        }
        
        return pval;
    }
}

/**
 * Your FreqStack bject will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */