/*
 * @lc app=leetcode.cn id=392 lang=java
 * @lcpr version=21801
 *
 * [392] 判断子序列
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        int index=0;
        int size=s.length();
        int tSize=t.length();
        if(size>tSize){
            return false;
        }
        if(size==0 || tSize==0){
            return true;
        }
        for (int i = 0; i < tSize; i++) {
            char ch=t.charAt(i);
            if(index<size && ch==s.charAt(index)){
                index++;
            }
            if(index==size){
                return true;
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
// "abc"\n"ahbgdc"\n
// @lcpr case=end

// @lcpr case=start
// "axc"\n"ahbgdc"\n
// @lcpr case=end

 */


