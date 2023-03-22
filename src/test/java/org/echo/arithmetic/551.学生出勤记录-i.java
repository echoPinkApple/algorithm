/*
 * @lc app=leetcode.cn id=551 lang=java
 * @lcpr version=21801
 *
 * [551] 学生出勤记录 I
 */

// @lc code=start
class Solution {
    public boolean checkRecord(String s) {
        int absent = 0;
        int late = 0;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == 'L') {
                late++;
                i++;
                while (i < s.length() && s.charAt(i) == 'L') {
                    late++;
                    i++;
                }
                if (late >= 3) {
                    return false;
                } else {
                    late = 0;
                }
                if (i<s.length()&&s.charAt(i) == 'A') {
                    absent++;
                    if(absent>=2){
                        return false;
                    }
                }
            } else if (temp == 'A') {
                absent++;
                if (absent >= 2) {
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
 * // @lcpr case=start
 * // "PPALLP"\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // "PPALLL"\n
 * // @lcpr case=end
 * 
 */
