import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=628 lang=java
 * @lcpr version=21801
 *
 * [628] 三个数的最大乘积
 */

// @lc code=start
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int size=nums.length;
        int res1=nums[0]*nums[1]*nums[size-1];
        int res2=nums[size-1]*nums[size-2]*nums[size-3];
        return Math.max(res1, res2);
    }
}
// @lc code=end

// @lcpr-div-debug-arg-start
// funName=
// paramTypes= []
// returnType=
// @lcpr-div-debug-arg-end


/*
// @lcpr case=start
// [1,2,3]
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4]
// @lcpr case=end

// @lcpr case=start
// [-1,-2,-3]
// @lcpr case=end

 */


