/*
 * @lc app=leetcode.cn id=796 lang=java
 * @lcpr version=21901
 *
 * [796] 旋转字符串
 */

// @lc code=start
class Solution {
    public boolean rotateString(String s, String goal) {
        int lengthS=s.length();
        int lengthGoal=goal.length();
        if(lengthGoal!=lengthS){
            return false;
        }
        for (int i = 0; i < lengthGoal; i++) {
            if(s.charAt(0)==goal.charAt(i)){
                int shift=lengthGoal-i;
                if(goal.substring(i, lengthGoal).equals(s.substring(0,shift))
                &&goal.substring(0,i).equals(s.substring(shift,lengthS))){
                    return true;
                }
            }
        }
        return false;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abcde"\n"cdeab"\n
// @lcpr case=end

// @lcpr case=start
// "abcde"\n"abced"\n
// @lcpr case=end

 */


