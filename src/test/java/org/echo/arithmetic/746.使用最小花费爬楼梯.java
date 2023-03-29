import net.bytebuddy.asm.Advice.Return;

/*
 * @lc app=leetcode.cn id=746 lang=java
 * @lcpr version=21901
 *
 * [746] 使用最小花费爬楼梯
 */

// @lc code=start
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int pre=0;
        int next=0;
        for (int i = 2; i <= cost.length; i++) {
            int cur=Math.min(next+cost[i-1], pre+cost[i-2]);
            pre=next;
            next=cur;
        }
        return next;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [10,15,20]\n
// @lcpr case=end

// @lcpr case=start
// [1,100,1,1,1,100,1,1,100,1]\n
// @lcpr case=end

 */


