	class Solution {

	public List<List<Integer>> combine(int n, int k) {
		List<Integer> temp=new ArrayList<>();
		List<List<Integer>> finalans=new ArrayList<>();

		helper(n,k,1,temp,finalans);
		return finalans;
	}
	public void helper(int n,int k, int idx, List<Integer> temp,List<List<Integer>> finalans)
	{
		if(temp.size()==k)
		{
			finalans.add(new ArrayList<>(temp));
			return;
		}
		for(int i=idx;i<=n;i++)
		{
			temp.add(i);
			helper(n,k,i+1,temp,finalans);
			temp.remove(temp.size()-1);
		}
	}
}