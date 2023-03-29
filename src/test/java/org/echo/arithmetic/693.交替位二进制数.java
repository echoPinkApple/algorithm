/*
 * @lc app=leetcode.cn id=693 lang=java
 * @lcpr version=21901
 *
 * [693] 交替位二进制数
 */

// @lc code=start
class Solution {
    public boolean hasAlternatingBits(int n) {
        int flag=n&1;
        n=n>>>1;
        while(n!=0){
            int tmp= n&1;
            n=n>>>1;
            if(tmp==flag){
            return false;
            }
            flag=tmp;
        }
        return true;
        // int tmp1=0xAAAAAAAA;
        // int tmp2=0x55555555;
        // return ((n&tmp1)==0 && (n&tmp2)==n) ||((n&tmp2)==0 && (n&tmp1)==n);
    }
}
// @lc code=end



/*
// @lcpr case=start
// 345
// @lcpr case=end

// @lcpr case=start
// 4
// @lcpr case=end

// @lcpr case=start
// 33
// @lcpr case=end

 */


