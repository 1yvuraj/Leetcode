class Solution {
    public int tribonacci(int N) {
        int a=0,b=1,c=1;
        for(int n=0;n<N;n++)
        {
            int sum=a+b+c;
            a=b;
            b=c;
            c=sum;
        }
        return a;
    }
}