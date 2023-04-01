/*
 * @lc app=leetcode.cn id=867 lang=java
 * @lcpr version=21901
 *
 * [867] 转置矩阵
 */

// @lc code=start
class Solution {
    public int[][] transpose(int[][] matrix) {
        int x=matrix.length;
        int y=matrix[0].length;
        int[][] res=new int[y][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                res[j][i]=matrix[i][j];
            }
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,2,3],[4,5,6],[7,8,9]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,2,3],[4,5,6]]\n
// @lcpr case=end

 */


