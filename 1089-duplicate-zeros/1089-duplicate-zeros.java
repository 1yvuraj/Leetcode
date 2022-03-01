
class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
			//if we found zero we have to shift all by one place to right till where we found zero
                for(int j=arr.length-1;j>i;j--)
                {
                    arr[j]=arr[j-1];
                }
				// i is incremented because if we shift by one next we be zero only that's we have skip that
                i++;
            }
        }
    }
}