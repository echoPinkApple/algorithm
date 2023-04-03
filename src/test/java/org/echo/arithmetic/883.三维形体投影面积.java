import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Git;

/*
 * @lc app=leetcode.cn id=883 lang=java
 * @lcpr version=21901
 *
 * [883] 三维形体投影面积
 */

// @lc code=start
class Solution {
    public int projectionArea(int[][] grid) {
        int size=grid.length;
        int xyArea=0;
        int yzArea=0;
        int xzArea=0;
        for (int i = 0; i < size; i++) {
            int xzMax=0;
            int yzMax=0;
            for (int j = 0; j < size; j++) {
                xyArea+=grid[i][j]==0?0:1;
                xzMax=Math.max(xzMax, grid[i][j]);
                yzMax=Math.max(yzMax, grid[j][i]);
            }
            xzArea+=xzMax;
            yzArea+=yzMax;
        }
        return xyArea+yzArea+xzArea;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 
// @lcpr case=end

// @lcpr case=start
// [[2]]\n
// @lcpr case=end

// @lcpr case=start
// 
// @lcpr case=end

 */


