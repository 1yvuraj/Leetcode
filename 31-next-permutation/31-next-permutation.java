class Solution {
    public void nextPermutation(int[] n) {
        int piv=0;
        if(n.length<=1){
            return;
        }
        for(int i=n.length-1;i>0;i--){//searching from right 
            if(n[i-1]<n[i]){
                piv=i-1;
                break;
            }
        }
        int nex=0;
        for(int i=n.length-1;i>piv;i--){
            //searching big num than piviot from end->piviot point
            if(n[piv]<n[i]){
                nex=i;
                break;
            }
        }
        if(nex==0){//if big num =0 then just sort & return
            Arrays.sort(n);
            // return;
        }else{//else just swap then sort after the pivot point & you got your next big permutation :)
            int t=n[nex];
            n[nex]=n[piv];
            n[piv]=t;
            Arrays.sort(n,piv+1,n.length);
        }
        
        
    }
}