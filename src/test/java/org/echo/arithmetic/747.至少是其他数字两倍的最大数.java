import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=747 lang=java
 * @lcpr version=21901
 *
 * [747] 至少是其他数字两倍的最大数
 */

// @lc code=start
class Solution {
    public int dominantIndex(int[] nums) {
        int maxNum1=0;
        int index=-1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>maxNum1){
                maxNum1=nums[i];
                index=i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(i!=index){
                if(nums[i]*2>maxNum1){
                    return -1;
                }
            }
        }
        return index;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,6,1,0]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4]\n
// @lcpr case=end

// @lcpr case=start
// [1,1]\n
// @lcpr case=end

 */


