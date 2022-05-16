// class Solution {

//     public class pair {
//         int x = 0;
//         int y = 0;
//         int move = 0;

//         pair(int x, int y, int move) {
//             this.x = x;
//             this.y = y;
//             this.move = move;
//         }
//     }

//     public int shortestPathBinaryMatrix(int[][] grid) {
//         int[][] dir = { { -1, 0 }, { -1, 1 }, { 0, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 }, { 0, -1 }, { -1, -1 } };
//         shortesPath(grid.length - 1, grid[0].length - 1, grid, dir);
//         return ans.move;
//     }

//     // pair<int,string>
//     public int shortesPath(int er, int ec, int[][] mat, int[][] dir) {
//         LinkedList<pair> list = new LinkedList<>();
//         list.add(new pair(0, 0, 0));
//         while (list.size() > 0) {
//             pair ans = list.remove();
//             int x = ans.x;
//             int y = ans.y;
//             int move = ans.move;

//             for (int d = 0; d < dir.length; d++) {
//                 if (x == er && y == ec) return ans.move;
//                 int r = x + dir[d][0];
//                 int c = y + dir[d][1];
//                 mat[r][c] = 1;
//                 if (r >= 0 && c >= 0 && r <= er && c <= ec && mat[x][y] == 0) {
//                     list.add(pair(x, y, move + 1));
//                 }
//                 mat[r][c] = 0;
//             }
//         }
//     }
// }
 class Solution {

     class Pair{
    int x;
    int y;
    int count;
    
    Pair(int x, int y, int count){
        this.x = x;
        this.y = y;
        this.count = count;
    }
}


public int shortestPathBinaryMatrix(int[][] grid) {
    
    return BFS(grid, 0, 0, grid.length-1, grid[0].length-1);
    
}


public int BFS(int grid[][], int start_x, int start_y , int target_x, int target_y){
    
    Queue<Pair> q = new LinkedList<>();
  
    q.add(new Pair(start_x, start_y, 1));
    
    while(q.size()>0){
        
        Pair rem = q.remove();
        int x = rem.x;
        int y = rem.y;
        int count = rem.count;
       
if(x>=0 && y>=0 && x<grid.length && y<grid[0].length && grid[x][y]!=1 ){
        
        grid[x][y] = 1;
            
        if(x==target_x && y== target_y)
            return rem.count;
        
        q.add(new Pair(x-1, y, count+1 ));
        q.add(new Pair(x-1, y+1, count+1));
        q.add(new Pair(x, y+1 , count+1));
        q.add(new Pair(x+1, y+1, count+1));
        q.add(new Pair(x+1, y, count+1));
        q.add(new Pair(x+1, y-1, count+1));
        q.add(new Pair(x, y-1, count+1));
        q.add(new Pair(x-1, y-1, count+1));
            
      }

   }
    return -1;
}
}
// }

