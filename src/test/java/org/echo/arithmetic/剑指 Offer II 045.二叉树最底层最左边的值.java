/*
 * @lc app=leetcode.cn id=剑指 Offer II 045 lang=java
 * @lcpr version=21906
 *
 * [剑指 Offer II 045] 二叉树最底层最左边的值
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
    int maxDepth=Integer.MIN_VALUE;
    int res=Integer.MIN_VALUE;
    public int findBottomLeftValue(TreeNode root) {
        dfs(root,0);
        return res;
    }

    private void dfs(TreeNode root,int depth) {
        if(root==null){
            return;
        }
        if(depth>maxDepth){
            res=root.val;
            maxDepth=depth;
        }
        dfs(root.left, depth+1);
        dfs(root.right, depth+1);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,1,3]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4,null,5,6,null,null,7]\n
// @lcpr case=end

 */

