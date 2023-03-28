/*
 * @lc app=leetcode.cn id=674 lang=java
 * @lcpr version=21901
 *
 * [674] 最长连续递增序列
 */

// @lc code=start
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxLength=1;
        int curMaxLength=1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>nums[i-1]){
                curMaxLength++;
                maxLength=Math.max(curMaxLength, maxLength);
            }
            else {
                curMaxLength=1;
            }
        }
        return maxLength;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,3,5,4,7]
// @lcpr case=end

// @lcpr case=start
// [2,2,2,2,2]
// @lcpr case=end

 */


