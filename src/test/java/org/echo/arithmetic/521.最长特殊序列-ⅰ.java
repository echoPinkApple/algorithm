/*
 * @lc app=leetcode.cn id=521 lang=java
 * @lcpr version=21801
 *
 * [521] 最长特殊序列 Ⅰ
 */

// @lc code=start
class Solution {
    public int findLUSlength(String a, String b) {
        return a.equals(b)? -1:Math.max(a.length(), b.length());
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
// "aba"\n"cdc"\n
// @lcpr case=end

// @lcpr case=start
// "aaa"\n"bbb"\n
// @lcpr case=end

// @lcpr case=start
// "aaa"\n"aaa"\n
// @lcpr case=end

 */


