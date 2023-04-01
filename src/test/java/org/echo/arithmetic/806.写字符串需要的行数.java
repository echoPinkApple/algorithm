/*
 * @lc app=leetcode.cn id=806 lang=java
 * @lcpr version=21901
 *
 * [806] 写字符串需要的行数
 */

// @lc code=start
class Solution {
    public static final int MAX_WIDTH = 100;

    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1;
        int width = 0;
        for (int i = 0; i < s.length(); i++) {
            int need = widths[s.charAt(i) - 'a'];
            width += need;
            if (width > MAX_WIDTH) {
                lines++;
                width = need;
            }
        }
        return new int[]{lines, width};
    }
}
// @lc code=end



/*
// @lcpr case=start
// [10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10 "abcdefghijklmnopqrstuvwxyz"
// @lcpr case=end

// @lcpr case=start
// [4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10 "bbbcccdddaaa"
// @lcpr case=end

 */


