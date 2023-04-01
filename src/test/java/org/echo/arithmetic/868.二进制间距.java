/*
 * @lc app=leetcode.cn id=868 lang=java
 * @lcpr version=21901
 *
 * [868] 二进制间距
 */

// @lc code=start
class Solution {
    public int binaryGap(int n) {
        int last = -1;
        int res = 0;
        for (int i = 0; n != 0; i++) {
            if ((n & 1) == 1) {
                if(last!=-1){
                    res=Math.max(res, i-last);
                    
                }
                last=i;
            }
            n>>=1;
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 22\n
// @lcpr case=end

// @lcpr case=start
// 8\n
// @lcpr case=end

// @lcpr case=start
// 5\n
// @lcpr case=end

 */


