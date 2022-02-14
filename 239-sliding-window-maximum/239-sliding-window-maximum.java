class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {
       int[]nge= ngeR(a);
     int[]ans=new int[a.length-k+1];
     
     for(int i=0;i<=a.length-k;i++)
     {
        int j=i;
        while(nge[j]<i+k)
        {
           j=nge[j];
        }
        ans[i]=a[j];
     } 
        return ans;
    }
    public static int[] ngeR(int[] arr){
    Stack<Integer> st = new Stack<>();
    int[] ans = new int[arr.length];

    ans[arr.length-1] = arr.length;
    st.push(arr.length-1);

    for(int i=arr.length-2; i>=0; i--){
       while(st.size()>0 && arr[st.peek()]<arr[i]){
          st.pop();
       }
       if(st.size()==0){
          ans[i] = arr.length;
       }else{
          ans[i] = st.peek();
       }
       st.push(i);

    }
    return ans;
 }
}