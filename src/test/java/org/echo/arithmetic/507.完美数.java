/*
 * @lc app=leetcode.cn id=507 lang=java
 * @lcpr version=21801
 *
 * [507] 完美数
 */

// @lc code=start
class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num<2){
            return false;
        }
        int sum = 1;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
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
// 28\n
// @lcpr case=end

// @lcpr case=start
// 7\n
// @lcpr case=end

 */


