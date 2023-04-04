/*
 * @lc app=leetcode.cn id=905 lang=java
 * @lcpr version=21901
 *
 * [905] 按奇偶排序数组
 */

// @lc code=start
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            while(left<right && (nums[left]&1)==0){
                left++;
            }
            while(left<right&&(nums[right]&1)==1){
                right--;
            }
            if(left<right){
                int tmp=nums[left];
                nums[left]=nums[right];
                nums[right]=tmp;
                left++;
                right--;
            }
        }
        return nums;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,1,2,4]\n
// @lcpr case=end

// @lcpr case=start
// [0]\n
// @lcpr case=end

 */


