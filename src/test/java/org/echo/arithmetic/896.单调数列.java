/*
 * @lc app=leetcode.cn id=896 lang=java
 * @lcpr version=21901
 *
 * [896] 单调数列
 */

// @lc code=start
class Solution {
    public boolean isMonotonic(int[] nums) {
        return isAsc(nums) || isDesc(nums);
    }
    public boolean isAsc(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1]<nums[i]){
            return false;
            }
        }
        return true;
    }

    public boolean isDesc(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1]>nums[i]){
                return false;
            }
        }
        return true;
    }

}
// @lc code=end



/*
// @lcpr case=start
// [1,2,2,3]\n
// @lcpr case=end

// @lcpr case=start
// [6,5,4,4]\n
// @lcpr case=end

// @lcpr case=start
// [1,3,2]\n
// @lcpr case=end

 */


