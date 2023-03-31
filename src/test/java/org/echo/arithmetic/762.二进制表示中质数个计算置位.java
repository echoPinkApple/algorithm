/*
 * @lc app=leetcode.cn id=762 lang=java
 * @lcpr version=21901
 *
 * [762] 二进制表示中质数个计算置位
 */

// @lc code=start
class Solution {
    public int countPrimeSetBits(int left, int right) {
        int res=0;
        for (int i = left; i <=right; i++) {
            int tmp=i;
            int count=0;
            while(tmp!=0){
                count+=tmp&1;
                tmp=tmp>>>1;
            }
            if(isPrime(count)){
                res++;
            }
        }
        return res;
    }
    public boolean isPrime(int num){
        return num == 2 || num == 3 || num == 5 || num == 7 || num == 11 || num == 13 || num == 17 || num == 19
                || num == 23 || num == 29 || num == 31;
    }
    
}
// @lc code=end



/*
// @lcpr case=start
// 6\n10\n
// @lcpr case=end

// @lcpr case=start
// 10\n15\n
// @lcpr case=end

 */


