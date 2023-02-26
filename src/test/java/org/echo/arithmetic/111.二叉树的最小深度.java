/*
 * @lc app=leetcode.cn id=111 lang=java
 *
 * [111] 二叉树的最小深度
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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftDepth=minDepth(root.left);
        int rightDepth=minDepth(root.right);
        if(leftDepth==0)
            return 1+rightDepth;
        else if(rightDepth==0)
            return 1+leftDepth;
        return 1+Math.min(leftDepth, rightDepth);
    }
}
// @lc code=end

