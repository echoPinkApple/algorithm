/*
 * @lc app=leetcode.cn id=231 lang=java
 * @lcpr version=21801
 *
 * [231] 2 的幂
 */

// @lc code=start
class Solution {
    public boolean isPowerOfTwo(int n) {
        int res= n&1;
        return res==1?false:true;
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
// 1\n
// @lcpr case=end

// @lcpr case=start
// 16\n
// @lcpr case=end

// @lcpr case=start
// 3\n
// @lcpr case=end

// @lcpr case=start
// 4\n
// @lcpr case=end

// @lcpr case=start
// 5\n
// @lcpr case=end

 */


