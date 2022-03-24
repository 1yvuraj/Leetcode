class Solution {
public int numRescueBoats(int[] people, int limit) {
Arrays.sort(people);

    int n = people.length;
    int i = 0, j = n - 1;
    int ans = 0;
    while(i <= j){
        int sum = people[i] + people[j];
        if(sum <= limit){
            i++;
            j--;
        }else{
            j--;
        }
        ans++;
    }
    return ans;
}
}