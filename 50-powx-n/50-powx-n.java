class Solution {
    public double myPow(double x, int n) {
        if(n<0){
            n=Math.abs(n);
        double val= Pow(x,n);
            return 1/val*1.0;
        }
        double val= Pow(x,n);
        return val;
    }
    public double Pow(double x, int n) {
        if(n<0) {
            x = 1/x;
            n = -n;
        }
        if(n==0) return 1;
        double val = myPow(x*x,n/2);
        return n%2==0?val:val*x;
    }
}