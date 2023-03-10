/*
 * @lc app=leetcode.cn id=459 lang=java
 * @lcpr version=21801
 *
 * [459] 重复的子字符串
 */

// @lc code=start
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        for (int i = 1; i*2 <=n; i++) {
            if(n%i==0){
                boolean match=true;
                for (int j = i; j < n; j++) {
                    if(s.charAt(j)!=s.charAt(j-i)){
                        match=false;
                    }
                }
                if(match){
                    return true;
                }
            }
        }
        return false;
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
// "abab"\n
// @lcpr case=end

// @lcpr case=start
// "aba"\n
// @lcpr case=end

// @lcpr case=start
// "abcabcabcabc"\n
// @lcpr case=end

 */


