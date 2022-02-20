class Solution {
    public int minFlipsMonoIncr(String s) {
        int i=0;
        while(i<s.length()&&s.charAt(i)=='0')
        {
            ++i;
        }
        int one =0;
        int zero=0;
        while(i<s.length())
        {
            if(s.charAt(i)=='0')
            {
                ++zero;
            }
            else
            {
                ++one;
            }
            if(zero>one)
            {
                zero=one;
            }
            ++i;
        }
        return zero;

        }
}