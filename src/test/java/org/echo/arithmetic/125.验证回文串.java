/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            while (left <= right && (s.charAt(left) < '0' || (s.charAt(left) < 'A' && s.charAt(left) > '9')
                    || s.charAt(left) > 'x' || (s.charAt(left) > 'X' && s.charAt(left) < 'a'))) {
                left++;
            }
            while (right >= left && (s.charAt(right) < '0' || (s.charAt(right) < 'A' && s.charAt(right) > '9')
                    || s.charAt(right) > 'x' || (s.charAt(right) > 'X' && s.charAt(right) < 'a'))) {
                right--;
            }
            if (left <= right && right >= 0 && s.charAt(left) != s.charAt(right)
                    && Math.abs(s.charAt(left) - s.charAt(right)) != 32) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
// @lc code=end
