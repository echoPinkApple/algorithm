/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        // int[][] dp=new int[n][2];
        int dp_0=0,dp_1=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            dp_0=Math.max(dp_0, dp_1+prices[i]);
            dp_1=Math.max(dp_1, -prices[i]);
        }
        return dp_0;
    }
}
// @lc code=end

