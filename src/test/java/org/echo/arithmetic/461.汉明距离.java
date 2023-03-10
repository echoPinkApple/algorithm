/*
 * @lc app=leetcode.cn id=461 lang=java
 * @lcpr version=21801
 *
 * [461] 汉明距离
 */

// @lc code=start
class Solution {
    public int hammingDistance(int x, int y) {
        int res=x^y;
        return Integer.bitCount(res);
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
// 10\n 4\n
// @lcpr case=end

// @lcpr case=start
// 35\n 10\n
// @lcpr case=end

 */


