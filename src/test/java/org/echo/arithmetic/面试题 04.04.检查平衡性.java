/*
 * @lc app=leetcode.cn id=面试题 04.04 lang=java
 * @lcpr version=21906
 *
 * [面试题 04.04] 检查平衡性
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

    public int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftDepth=dfs(root.left);
        int rightDepth=dfs(root.right);
        if(Math.abs(leftDepth-rightDepth)>1){
            balance=false;
        }
        return Math.max(leftDepth, rightDepth)+1;
    }

    
}
// @lc code=end



