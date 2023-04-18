/*
 * @lc app=leetcode.cn id=剑指 Offer II 051 lang=java
 * @lcpr version=21906
 *
 * [剑指 Offer II 051] 节点之和最大的路径
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
    int res=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxSubPath(root);
        return res;
    }
    public int maxSubPath(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftMax=maxSubPath(root.left);
        if(leftMax<0){
            leftMax=0;
        }
        int rightMax=maxSubPath(root.right);
        if(rightMax<0){
            rightMax=0;
        }
        res=Math.max(res, leftMax+rightMax+root.val);
        return root.val+Math.max(leftMax,rightMax);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,-1]\n
// @lcpr case=end

// @lcpr case=start
// [-10,9,20,null,null,15,7]\n
// @lcpr case=end

 */

