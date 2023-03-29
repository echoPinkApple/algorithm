/*
 * @lc app=leetcode.cn id=709 lang=java
 * @lcpr version=21901
 *
 * [709] 转换成小写字母
 */

// @lc code=start
class Solution {
    public String toLowerCase(String s) {
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char tmp=s.charAt(i);
            if(tmp>='A' && tmp<='Z'){
                builder.append((char)(tmp+32));
            }
            else{
                builder.append(tmp);
            }
        }
        return builder.toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "Hello"\n
// @lcpr case=end

// @lcpr case=start
// "here"\n
// @lcpr case=end

// @lcpr case=start
// "LOVELY"\n
// @lcpr case=end

 */


