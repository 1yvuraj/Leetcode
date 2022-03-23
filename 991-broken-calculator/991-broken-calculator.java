class Solution {
    public int brokenCalc(int startValue, int target) {
      int i=0;
        while(startValue<target){
            if(target%2==0){
              target=target/2;
            }
            else{
                target++;
            }
            i++;
        }
      return i+(startValue-target);  
    }
}