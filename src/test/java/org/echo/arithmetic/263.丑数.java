/*
 * @lc app=leetcode.cn id=263 lang=java
 * @lcpr version=21801
 *
 * [263] 丑数
 */

// @lc code=start
class Solution {
    public boolean isUgly(int n) {
        if(n<=0)
            return false;
        while(n%2==0)
            n=n/2;
        while(n%3==0)
            n=n/3;
        while(n%5==0)
            n=n/5;
        return n==1;
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
// 6
// @lcpr case=end

// @lcpr case=start
// 1
// @lcpr case=end

// @lcpr case=start
// 14
// @lcpr case=end

 */


