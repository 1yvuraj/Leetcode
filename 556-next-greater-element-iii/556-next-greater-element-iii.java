class Solution {
    public int nextGreaterElement(int n) {
      char[]ans=(Integer.toString(n)).toCharArray();
      int i=ans.length-2;
        StringBuilder s=new StringBuilder(); 
    while(i>=0 &&ans[i]>=ans[i+1])
    {
        --i;
    }
        if(i==-1)
        {
            return -1;
        }
        int k=ans.length-1;
        while(ans[k]<=ans[i])
        {
            k--;
        }
        swap(ans,k,i);
        for(int j=0;j<=i;j++)
        {
            s.append(ans[j]);
        }
        for(int j=ans.length-1;j>i;j--)
        {
            s.append(ans[j]);
        }
       long main=Long.parseLong(s.toString());
        return main>Integer.MAX_VALUE?-1:(int)main;
        
    }
    public void swap(char[]ans,int k,int i) {
        char temp=ans[k];
        ans[k]=ans[i];
        ans[i]=temp;
    }
}

