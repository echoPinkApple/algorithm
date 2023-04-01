/*
 * @lc app=leetcode.cn id=859 lang=java
 * @lcpr version=21901
 *
 * [859] 亲密字符串
 */

// @lc code=start
class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        if (s.equals(goal)) {
            int[] count = new int[26];
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
                if (count[s.charAt(i) - 'a'] > 1) {
                    return true;
                }
            }
            return false;
        } else {
            int first = -1, second = -1;
            for (int i = 0; i < goal.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    if (first == -1)
                        first = i;
                    else if (second == -1)
                        second = i;
                    else
                        return false;
                }
            }

            return (second != -1 && s.charAt(first) == goal.charAt(second) &&
                    s.charAt(second) == goal.charAt(first));
        }
    }
}
// @lc code=end

/*
 * // @lcpr case=start
 * // "ab"\n"ba"\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // "ab"\n"ab"\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // "aa"\n"aa"\n
 * // @lcpr case=end
 * 
 */
