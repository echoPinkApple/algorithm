import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=561 lang=java
 * @lcpr version=21801
 *
 * [561] 数组拆分
 */

// @lc code=start
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        for (int i = 0; i < nums.length; i=i+2) {
            max+=nums[i];
        }
        return max;
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
// [1,4,3,2]\n
// @lcpr case=end

// @lcpr case=start
// [6,2,6,5,1,2]\n
// @lcpr case=end

 */


