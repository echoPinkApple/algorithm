/*
 * @lc app=leetcode.cn id=965 lang=java
 * @lcpr version=21901
 *
 * [965] 单值二叉树
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
    public boolean isUnivalTree(TreeNode root) {
        if(root==null){
            return true;
        }
        if(root.left==null && root.right==null){
            return true;
        }
        return isUnivalTree(root,root.val);
    }

    private boolean isUnivalTree(TreeNode root, int val) {
        if(root==null){
            return true;
        }
        if(root.val!=val){
            return false;
        }
        return isUnivalTree(root.left,val)&& isUnivalTree(root.right,val);
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

 */


