/*
 * @lc app=leetcode.cn id=804 lang=java
 * @lcpr version=21901
 *
 * [804] 唯一摩尔斯密码词
 */

// @lc code=start
class Solution {
    public static final String[] MORSE = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.",
            "---", ".--.", "--.-", ".-.", "...", "-", "..-",
            "...-", ".--", "-..-", "-.--", "--.." };

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> seen = new HashSet<String>();
        for (String word : words) {
            StringBuilder code = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                code.append(MORSE[c - 'a']);
            }
            seen.add(code.toString());
        }
        return seen.size();
    }
}
// @lc code=end

/*
 * // @lcpr case=start
 * // ["gin", "zen", "gig", "msg"]\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // ["a"]\n
 * // @lcpr case=end
 * 
 */
