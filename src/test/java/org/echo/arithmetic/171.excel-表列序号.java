/*
 * @lc app=leetcode.cn id=171 lang=java
 *
 * [171] Excel 表列序号
 */

// @lc code=start
class Solution {
    public int titleToNumber(String columnTitle) {
        int size=columnTitle.length()-1;
        int res=0;
        for (int i = 0; i <=size; i++) {
            res=res*26+columnTitle.charAt(i)-64;
        }
        return res;
    }
}
// @lc code=end

