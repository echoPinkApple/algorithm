import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Git;

/*
 * @lc app=leetcode.cn id=892 lang=java
 * @lcpr version=21901
 *
 * [892] 三维形体的表面积
 */

// @lc code=start
class Solution {
    public int surfaceArea(int[][] grid) {
        int n=grid.length;
        int res=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int level=grid[i][j];
                if(level>0){
                    //两个底面积+4个侧面积
                    res+=(2+(level<<2));
                    //减去和相临的侧面积
                    res-=i>0?Math.min(level, grid[i-1][j])<<1:0;
                    //减去和j相邻的侧面积
                    res-=j>0?Math.min(level, grid[i][j-1])<<1:0;
                }
            }
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,2],[3,4]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,1,1],[1,0,1],[1,1,1]]\n
// @lcpr case=end

// @lcpr case=start
// [[2,2,2],[2,1,2],[2,2,2]]\n
// @lcpr case=end

 */


