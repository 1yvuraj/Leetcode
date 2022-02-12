class Solution {
    public long smallestNumber(long num) {
        if(num==0)return 0;
        String str="";
        if(num<0){
        long n=Math.abs(num);
        int c=0;
        while(n!=0)
        {
            n/=10;
            ++c;
        }
        long[]ans=new long[c];
         num=Math.abs(num);
        for(int i=0;i<ans.length;i++)
        {
            long rem=num%10;
            ans[i]=rem;
            num/=10;
        }
        Arrays.sort(ans);
            
        for(int i=ans.length-1;i>=0;i--)
        {
              str+=ans[i];
           
        }
        
          return - Long.parseLong(str);  
        }else{
        long n=num;
        int c=0;
        while(n!=0)
        {
            n/=10;
            ++c;
        }
        long[]ans=new long[c];
         num=num;
        for(int i=0;i<ans.length;i++)
        {
            long rem=num%10;
            ans[i]=rem;
            num/=10;
        }
        Arrays.sort(ans);
            c=0;
            int k=0;
        for(int i=0;i<ans.length;i++)
        {
             if(ans[i]==0){
                 c++;
             }else{
                 k=i;
                 break;
                 
             }
           
        } 
        if(k<ans.length)str+=ans[k];
        for(int i=0;i<c;i++){
            str+=0;
        }
            for(int i=k+1;i<ans.length;i++)
            {
                str+=ans[i];
            }
        }
        return Long.parseLong(str);  
        
        
    }
}