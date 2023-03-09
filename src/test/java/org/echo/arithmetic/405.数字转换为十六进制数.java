/*
 * @lc app=leetcode.cn id=405 lang=java
 * @lcpr version=21801
 *
 * [405] 数字转换为十六进制数
 */

// @lc code=start
class Solution {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 7; i >= 0; i--) {
            //取出来的值已经是补码形式表示了
            int val = (num >> (4 * i)) & 0xf;
            if (sb.length() > 0 || val > 0) {
                char digit = val < 10 ? (char) ('0'+val) :(char) ('a' + val - 10);
                sb.append(digit);
            }
        }
        return sb.toString();
    }
}
// @lc code=end

// @lcpr-div-debug-arg-start
// funName=
// paramTypes= []
// returnType=
// @lcpr-div-debug-arg-end

/*
 * // @lcpr case=start
 * //
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * //
 * // @lcpr case=end
 * 
 */
