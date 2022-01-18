// class Solution {
//   public int maxDistance(int[] arr, int m) {
//     Arrays.sort(arr);
//     int lo = 0;
//     int h = arr[arr.length-1];

//     int ans = 0;

//     // for (int i = 0; i < arr.length; i++)
//     // {
//     //   lo = Math.max(lo, arr[i]);
//     //   h += arr[i];
//     // }

//     while (lo <= h)
//     {
//       int mid = (lo + h)/ 2;
//       if (ok(arr, mid, m))
//       {
//         ans = mid;
//        // h = mid - 1;
//           lo = mid + 1;
//       }
//       else {
//         //lo = mid + 1;
//            h = mid - 1;
//       }


//     }
//     return ans;
//   }
//   public static boolean ok(int []arr, int mid, int m)
//   {
//     int p = 1;
//       int last=arr[0];
    
//     for (int i = 1; i < arr.length; i++)
//     {
      

//       if (arr[i]-last >= m)
//       {
//            ++p;
          
//           if (p == mid)
//          {
//          return true;
//           }
//          last=arr[i]; 
          
//       }
       
        
//     }
    
//     return false;
//   }
// }
class Solution {
    static boolean isValid(int[] A,int M, int F){
        //function to validate if at current distance F, it is possible to place M balls
        int recentPos=A[0];
        int ballsPlaced=1;
        
        for(int i=1;i<A.length;i++){
            if(A[i]-recentPos>=F){
                recentPos=A[i];
                ballsPlaced++;
                
                if(ballsPlaced==M){
                    return true;
                }
            }
        }
        return false;
    }
    
    public int maxDistance(int[] position, int m) {
        //sorting for binary search application
        Arrays.sort(position);
        int low=0,high=position[position.length-1]-position[0], ans=0;
        
        while(low<=high){
            int mid=(low+high)/2;
            if(isValid(position,m,mid)){
                //go right for better ans if there any
                ans=mid;
                low=mid+1;
            }
            else{
                //ans should be on left
                high=mid-1;
            }
            
        }
        return ans;
        
        
        
    }
}