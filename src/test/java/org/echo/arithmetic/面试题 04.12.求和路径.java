/*
 * @lc app=leetcode.cn id=面试题 04.12 lang=java
 * @lcpr version=21906
 *
 * [面试题 04.12] 求和路径
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
    int res=0;
    public int pathSum(TreeNode root, int sum) {
        dfs(root,sum);
        return res;
    }
    private void dfs(TreeNode root, int sum) {
        if(root==null){
            return;
        }
        dfs2(root, sum);
        dfs(root.left, sum);
        dfs(root.right, sum);
    }
    private void dfs2(TreeNode node, int sum ) {
        if(node==null){
            return;
        }
        if((sum-node.val)==0){
            res++;
        }
        dfs2(node.left, sum-node.val);
        dfs2(node.right, sum-node.val);
    }
}
// @lc code=end



