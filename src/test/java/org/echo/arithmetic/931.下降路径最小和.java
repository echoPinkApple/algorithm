import static org.mockito.ArgumentMatchers.matches;

/*
 * @lc app=leetcode.cn id=931 lang=java
 * @lcpr version=21906
 *
 * [931] 下降路径最小和
 */

// @lc code=start
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][m];
        for (int i = 0; i < m; i++) {
            dp[0][i] = matrix[0][i];
        }
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < m; i++) {
                if (i == 0) {
                    dp[j][i] = Math.min(dp[j-1][i], dp[j-1][i+1]) + matrix[j][i];
                } else if (i == m - 1) {
                    dp[j][i] = Math.min(dp[j-1][i], dp[j-1][i-1]) + matrix[j][i];
                } else {
                    dp[j][i] = min(dp[j-1][i-1], dp[j-1][i], dp[j-1][i+1]) + matrix[j][i];
                }
            }
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            res = Math.min(res, dp[n-1][i]);
        }
        return res;
    }
    
    private int min(int i, int j, int k) {
        return Math.min(i, Math.min(j, k));
    }
    // public int minFallingPathSum(int[][] matrix) {
    //     int n=matrix.length;
    //     int m=matrix[0].length;
    //     int[][] dp=new int[n][m];
    //     for (int i = 0; i < m; i++) {
    //         dp[0][i]=matrix[0][i];
    //     }
    //     for (int j = 1; j < n; j++) {
    //         for (int i = 0; i < m; i++) {
    //             if(i==0){
    //                 dp[j][i]=Math.min(dp[j-1][i+1], dp[j-1][i])+matrix[j][i];
    //             }
    //             else if((i==m-1)){
    //                 dp[j][i]=Math.min(dp[j-1][i], dp[j-1][i-1])+matrix[j][i];
    //             }
    //             else{
    //                 dp[j][i]=min(dp[j-1][i], dp[j-1][i-1], dp[j-1][i+1])+matrix[j][i];
    //             }
    //         }
    //     }
    //     int res=Integer.MAX_VALUE;
    //     for (int i = 0; i < m; i++) {
    //         res=Math.min(res, dp[n-1][i]);
    //     }
    //     return res;

    // }

    // private int min(int i, int j, int k) {
    //     return Math.min(i, Math.min(j, k));
    // }
}
// @lc code=end



/*
// @lcpr case=start
// [[2,1,3],[6,5,4],[7,8,9]]\n
// @lcpr case=end

// @lcpr case=start
// [[1]]\n
// @lcpr case=end

 */

