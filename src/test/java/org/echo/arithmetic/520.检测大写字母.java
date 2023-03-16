/*
 * @lc app=leetcode.cn id=520 lang=java
 * @lcpr version=21801
 *
 * [520] 检测大写字母
 */

// @lc code=start
class Solution {
    public boolean detectCapitalUse(String word) {
        char first = word.charAt(0);
        if (first >= 'a' && first <= 'z') {
            for (int i = 1; i < word.length(); i++) {
                char temp = word.charAt(i);
                if (temp >= 'A' && temp <= 'Z') {
                    return false;
                }
            }
        } else {
            boolean hasLower = false;
            boolean hasUpper = false;
            for (int i = 1; i < word.length(); i++) {
                char temp = word.charAt(i);
                if (temp >= 'A' && temp <= 'Z') {
                    hasUpper = true;
                }
                if (temp >= 'a' && temp <= 'z') {
                    hasLower = true;
                }
                if (hasLower && hasUpper) {
                    return false;
                }
            }
        }
        return true;
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
// "USA"\n
// @lcpr case=end

// @lcpr case=start
// "FlaG"\n
// @lcpr case=end

 */


