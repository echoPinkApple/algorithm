/*
 * @lc app=leetcode.cn id=766 lang=java
 * @lcpr version=21901
 *
 * [766] 托普利茨矩阵
 */

// @lc code=start
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length-1; i++) {
            int x=i;
            for (int j = 0; j < matrix.length; j++) {
                int y=j;
                if(x<matrix[0].length && y<matrix.length){
                    if(matrix[y][x]!=matrix[0][i]){
                        return false;
                    }
                }
                x++;
            }
        }
        for (int i = 0; i < matrix.length-1; i++) {
            int x=i;
            for (int j = 0; j < matrix[0].length; j++) {
                int y=j;
                if(x<matrix.length && y<matrix[0].length){
                    if(matrix[x][y]!=matrix[i][0]){
                        return false;
                    }
                }
                x++;
            }
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,2,3,4],[5,1,2,3],[9,5,1,2]]\n
// @lcpr case=end

// @lcpr case=start
// [[11,74,0,93],[40,11,74,7]]\n
// @lcpr case=end

 */


