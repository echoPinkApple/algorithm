/*
 * @lc app=leetcode.cn id=441 lang=java
 * @lcpr version=21801
 *
 * [441] 排列硬币
 */

// @lc code=start
class Solution {
    public int arrangeCoins(int n) {
        int left=1;
        int right=n;
        while(left<=right){
            int mid=(left+right)>>>1;
            long sum =(1L+mid)*mid/2;
            if(sum==n){
                return mid;
            }
            else if(sum<n){
                left=mid+1;
            }
            else if(sum>n){
                right=mid-1;
            }
        }
        return left-1;

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
// 5
// @lcpr case=end

// @lcpr case=start
// 8
// @lcpr case=end

// @lcpr case=start
// 105
// @lcpr case=end

// @lcpr case=start
// 89
// @lcpr case=end

 */


