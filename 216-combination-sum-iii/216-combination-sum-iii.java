class Solution {
  public List<List<Integer>> combinationSum3(int k, int n) {
    ArrayList<Integer>ans = new ArrayList<>();
    List<List<Integer>>main = new ArrayList<>();
   
    combinationSum(n, 1, ans, main, k,n);

    return main;
  }
  public void combinationSum(int n, int idx, ArrayList<Integer>ans, List<List<Integer>>main, int k,int amt) {
        
      
      if(idx>n || amt<0)
      {
          return;
      }
      if(amt==0 && ans.size()==k)
      {
          main.add(new ArrayList<>(ans));
          return;
      }
    
    if(idx<=9){
    ans.add(idx);
    
    combinationSum(n, idx + 1, ans, main, k,amt-idx);
    ans.remove(ans.size() - 1);
     while(idx+1<n && idx==idx+1)idx++;
    combinationSum(n, idx + 1, ans, main, k,amt);
    }
    
  }
}
