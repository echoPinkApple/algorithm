/*
 * @lc app=leetcode.cn id=434 lang=java
 * @lcpr version=21801
 *
 * [434] 字符串中的单词数
 */

// @lc code=start
class Solution {
    public int countSegments(String s) {
        // int slow=0;
        int fast=0;
        int res=0;
        while(fast<s.length() && s.charAt(fast)==' '){
            fast++;
        }
        while(fast<s.length()){
            while(fast<s.length() && s.charAt(fast)!=' '){
                fast++;
            }
            res++;
            while(fast<s.length() && s.charAt(fast)==' '){
                fast++;
            }
        }
        return res;
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
// 
// @lcpr case=end

 */


