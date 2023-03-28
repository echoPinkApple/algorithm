/*
 * @lc app=leetcode.cn id=643 lang=java
 * @lcpr version=21901
 *
 * [643] 子数组最大平均数 I
 */

// @lc code=start
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double avg=0;
        for (int i = 0; i < k; i++) {
            sum+=nums[i];
        }
        avg=sum/k;
        for (int i = k; i < nums.length; i++) {
            sum-=nums[i-k];
            sum+=nums[i];
            avg=Math.max(avg, sum/k);
        }
        return avg;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,12,-5,-6,50,3]\n4\n
// @lcpr case=end

// @lcpr case=start
// [5]\n1\n
// @lcpr case=end

 */


