/*
 * @lc app=leetcode.cn id=剑指 Offer 55 - II lang=java
 * @lcpr version=21906
 *
 * [剑指 Offer 55 - II] 平衡二叉树
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    boolean balance=true;
    public boolean isBalanced(TreeNode root) {
        dfs(root);
        return balance;
    }

    private int dfs(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftDepth=dfs(root.left);
        int rightDepth=dfs(root.right);
        if(Math.abs(leftDepth-rightDepth)>1){
            balance=false;
            return 0;
        }
        return Math.max(leftDepth, rightDepth)+1;
    }
}
// @lc code=end



