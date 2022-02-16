/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return firstBadVersion(0 , n);
    }
    
    public int firstBadVersion(int l, int r) {
        if(l == r){
            return l;
        }
		// calculating mid with (l+r)/2 will not handle int max value scenario
        int mid = l + (r - l)/2;

        if(isBadVersion(mid)){
            return firstBadVersion(l, mid);
        }
        else{
            return firstBadVersion(mid+1, r);
        }
    }
}