import ch.qos.logback.core.joran.conditional.ElseAction;

/*
 * @lc app=leetcode.cn id=657 lang=java
 * @lcpr version=21901
 *
 * [657] 机器人能否返回原点
 */

// @lc code=start
class Solution {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;
        for (int i = 0; i < moves.length(); i++) {
            char charAt = moves.charAt(i);
            if(charAt=='R'){
                x+=1;
            }
            else if(charAt=='L'){
                x-=1;
            }
            else if(charAt=='U'){
                y+=1;
            }
            else if(charAt=='D'){
                y-=1;
            }
        }
        return x==0 && y==0;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "UD"
// @lcpr case=end

// @lcpr case=start
// "LL"
// @lcpr case=end

 */


