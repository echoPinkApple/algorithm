/*
 * @lc app=leetcode.cn id=836 lang=java
 * @lcpr version=21901
 *
 * [836] 矩形重叠
 */

// @lc code=start
class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return (Math.min(rec1[2], rec2[2]) > Math.max(rec1[0], rec2[0]) &&
                Math.min(rec1[3], rec2[3]) > Math.max(rec1[1], rec2[1]));
    }
}
// @lc code=end



/*
// @lcpr case=start
// [0,0,2,2]\n[1,1,3,3]\n
// @lcpr case=end

// @lcpr case=start
// [0,0,1,1]\n[1,0,2,1]\n
// @lcpr case=end

// @lcpr case=start
// [0,0,1,1]\n[2,2,3,3]\n
// @lcpr case=end

 */


