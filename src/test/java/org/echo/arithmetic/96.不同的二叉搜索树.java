/*
 * @lc app=leetcode.cn id=96 lang=java
 * @lcpr version=21901
 *
 * [96] 不同的二叉搜索树
 */

// @lc code=start
class Solution {
    int[][] memo;
    public int numTrees(int n) {
        memo=new int[n+1][n+1];
        return count(1,n);
    }

    private int count(int left, int right) {
        if(left>right){
            return 1;
        }
        if(memo[left][right]!=0){
            return memo[left][right];
        }
        int res=0;
        for (int i = left; i <= right; i++) {
            int leftCount=count(left, i-1);
            int rightCount=count(i+1, right);
            res+=leftCount*rightCount;
        }
        memo[left][right]=res;
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 3\n
// @lcpr case=end

// @lcpr case=start
// 1\n
// @lcpr case=end

 */


