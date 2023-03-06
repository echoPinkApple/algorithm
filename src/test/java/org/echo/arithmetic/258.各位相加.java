/*
 * @lc app=leetcode.cn id=258 lang=java
 * @lcpr version=21801
 *
 * [258] 各位相加
 */

// @lc code=start
class Solution {
    public int addDigits(int num) {
        while(num>=10){
            int temp=num;
            int sum=0;
            while(temp!=0){
                sum+=temp%10;
                temp=temp/10;
            }
            num=sum;
        }
        return num;
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
// 38\n
// @lcpr case=end

// @lcpr case=start
// 0\n
// @lcpr case=end

 */


