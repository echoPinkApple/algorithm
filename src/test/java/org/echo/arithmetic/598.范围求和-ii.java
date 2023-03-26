/*
 * @lc app=leetcode.cn id=598 lang=java
 * @lcpr version=21801
 *
 * [598] 范围求和 II
 */

// @lc code=start
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int x=m;
        int y=n;
        for (int[] temp : ops) {
            x=Math.min(x, temp[0]);
            y=Math.min(y, temp[1]);
        }
        return x*y;
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
// 3 3 [[2,2],[3,3]]
// @lcpr case=end

// @lcpr case=start
// 3 3 [[2,2],[3,3],[3,3],[3,3],[2,2],[3,3],[3,3],[3,3],[2,2],[3,3],[3,3],[3,3]]
// @lcpr case=end

// @lcpr case=start
// 3 3 []
// @lcpr case=end

 */


