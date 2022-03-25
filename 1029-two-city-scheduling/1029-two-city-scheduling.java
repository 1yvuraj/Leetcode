class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a, b) -> {
            return ( (b[1] - b[0])-(a[1] - a[0])); //descending order  so that we achieve maximum profit first
        });
        int l=costs.length;
        int cost = 0;
        for(int i = 0; i <l/2 ; i++){  //as we know by sorting a[0] would be less than a[1] so adding a[0]s for the first half
            cost += costs[i][0];
        }
        for(int i = l / 2; i < costs.length; i++){    
            cost += costs[i][1];
        }
        return cost;
    }
}