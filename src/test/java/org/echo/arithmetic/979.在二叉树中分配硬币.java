/*
 * @lc app=leetcode.cn id=979 lang=java
 * @lcpr version=21901
 *
 * [979] 在二叉树中分配硬币
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int res=0;
    public int distributeCoins(TreeNode root) {
        dfs(root);
        return res;
    }
    private int dfs(TreeNode root) {
        if(root==null){
            return 0;
        }
        int l=dfs(root.left);
        int r=dfs(root.right);
        res+=Math.abs(l)+Math.abs(r);
        return l+r-1+root.val;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 
// @lcpr case=end

// @lcpr case=start
// 
// @lcpr case=end

// @lcpr case=start
// 
// @lcpr case=end

// @lcpr case=start
// 
// @lcpr case=end

 */


