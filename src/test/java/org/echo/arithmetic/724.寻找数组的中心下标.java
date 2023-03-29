/*
 * @lc app=leetcode.cn id=724 lang=java
 * @lcpr version=21901
 *
 * [724] 寻找数组的中心下标
 */

// @lc code=start
class Solution {
    
    public int pivotIndex(int[] nums) {
        int[] sum=new int[nums.length+1];
        sum[0]=0;
        for (int i = 1; i < sum.length; i++) {
            sum[i]=sum[i-1]+nums[i-1];
        }
        for (int i = 0; i < sum.length-1; i++) {
            if(sum[i]==sum[sum.length-1]-sum[i+1]){
                return i;
            }
        }
        return -1;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1, 7, 3, 6, 5, 6] \n
// @lcpr case=end

// @lcpr case=start
// [1, 2, 3] \n
// @lcpr case=end

// @lcpr case=start
// [2, 1, -1] \n
// @lcpr case=end

 */


