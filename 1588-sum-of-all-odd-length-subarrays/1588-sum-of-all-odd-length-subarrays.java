class Solution {

    public int sumOddLengthSubarrays(int[] arr) {
        int mainsum=0;
        for (int i = 0; i < arr.length; i++) {
            int c=0 ;
            int sum=0;
            for (int j = i; j <arr.length; j++) {
                c++;
                sum+=arr[j];
                if(c%2!=0)
                {
                    mainsum+=sum;
                }
            }
            
        }
        return mainsum;
    }
}
