/*
 * @lc app=leetcode.cn id=278 lang=java
 * @lcpr version=21801
 *
 * [278] 第一个错误的版本
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left=0;
        int right=n;
        while(left<=right){
            int mid=(left+right)>>>1;
            if(isBadVersion(mid)){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left;
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
// 5\n4\n
// @lcpr case=end

// @lcpr case=start
// 1\n1\n
// @lcpr case=end

 */


