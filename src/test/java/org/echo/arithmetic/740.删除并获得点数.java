import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=740 lang=java
 * @lcpr version=21906
 *
 * [740] 删除并获得点数
 */

// @lc code=start
class Solution {
    public int deleteAndEarn(int[] nums) {
        int maxVal=0;
        for (int num : nums) {
            if(num>maxVal){
                maxVal=num;
            }
        }
        int[] sum=new int[maxVal+1];
        for (int num : nums) {
            sum[num]++;
        }
        int max=0;
        int[] dp=new int[sum.length];
        dp[0]=0;
        dp[1]=sum[1];
        for (int i = 2; i < dp.length; i++) {
            dp[i]=Math.max(dp[i-2]+sum[i]*i, dp[i-1]);
        }
        return dp[maxVal];

    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,4,2]\n
// @lcpr case=end

// @lcpr case=start
// [2,2,3,3,3,4]\n
// @lcpr case=end

 */

