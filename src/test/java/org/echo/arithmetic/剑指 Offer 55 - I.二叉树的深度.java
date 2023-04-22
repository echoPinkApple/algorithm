/*
 * @lc app=leetcode.cn id=剑指 Offer 55 - I lang=java
 * @lcpr version=21906
 *
 * [剑指 Offer 55 - I] 二叉树的深度
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
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftDepth=maxDepth(root.left);
        int rightDepth=maxDepth(root.right);
        return Math.max(leftDepth, rightDepth)+1;
    }
}
// @lc code=end



