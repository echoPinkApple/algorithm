/*
 * @lc app=leetcode.cn id=543 lang=java
 * @lcpr version=21801
 *
 * [543] 二叉树的直径
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
    int max;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        max=1;
        traverse(root);
        return max-1;

    }
    public int traverse(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=traverse(root.left);
        int right=traverse(root.right);
        max=Math.max(max, left+right+1);
        return Math.max(left, right)+1;
    }
}
// @lc code=end

// @lcpr-div-debug-arg-start
// funName=
// paramTypes= []
// returnType=
// @lcpr-div-debug-arg-end



