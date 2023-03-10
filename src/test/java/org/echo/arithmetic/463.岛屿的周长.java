/*
 * @lc app=leetcode.cn id=463 lang=java
 * @lcpr version=21801
 *
 * [463] 岛屿的周长
 */

// @lc code=start
class Solution {
    int[] dx={1,0,0,-1};
    int[] dy={0,1,-1,0};
    public int islandPerimeter(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==1){
                    return dfs(grid, i, j);
                }
            }
        }
        return 0;
    }
    public int dfs(int[][] grid,int x,int y){
        if(x<0 || y<0 || x>=grid.length || y>=grid[0].length || grid[x][y]==0 || grid[x][y]==-1){
            return 0;
        }
        grid[x][y]=-1;
        int res=0;
        for (int i = 0; i < 4; i++) {
            int x1=x+dx[i];
            int y1=y+dy[i];
            if((x1>=0 && y1>=0 && x1<grid.length && y1<grid[0].length && grid[x1][y1]==0) || x1<0 || y1<0 || x1>=grid.length || y1>=grid[0].length){
                res++;
            }
            res+=dfs(grid, x1, y1);
        }
        return res;
    }
}
// @lc code=end

// @lcpr-div-debug-arg-start
// funName=
// paramTypes= []
// returnType=
// @lcpr-div-debug-arg-end


/*
// @lcpr case=start
// [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]\n
// @lcpr case=end

// @lcpr case=start
// [[1]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,0]]\n
// @lcpr case=end

 */


