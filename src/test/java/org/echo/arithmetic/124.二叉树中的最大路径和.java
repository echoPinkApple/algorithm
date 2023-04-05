/*
 * @lc app=leetcode.cn id=124 lang=java
 * @lcpr version=21901
 *
 * [124] 二叉树中的最大路径和
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
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPath(root);
        return max;
    }
    public int maxPath(TreeNode node){
        if(node==null){
            return 0;
        }
        int leftMax=Math.max(maxPath(node.left), 0);
        int rightMax=Math.max(maxPath(node.right), 0);
        int pathSum=leftMax+rightMax+node.val;
        max=Math.max(max, pathSum);
        return node.val+Math.max(leftMax, rightMax);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3]\n
// @lcpr case=end

// @lcpr case=start
// [-10,9,20,null,null,15,7]\n
// @lcpr case=end

 */


