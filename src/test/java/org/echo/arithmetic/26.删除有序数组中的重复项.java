/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除有序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
        return 0;
        int pre=0;
        for(int next=1;next<nums.length;next++){
            if(nums[pre]!=nums[next]){
                nums[++pre]=nums[next];
            }
        }
        return pre+1;
    }
}
// @lc code=end

