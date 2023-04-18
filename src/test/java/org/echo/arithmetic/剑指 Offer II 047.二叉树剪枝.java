/*
 * @lc app=leetcode.cn id=剑指 Offer II 047 lang=java
 * @lcpr version=21906
 *
 * [剑指 Offer II 047] 二叉树剪枝
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
    public TreeNode pruneTree(TreeNode root) {
        if(root==null){
            return root;
        }
        if(root.val==0 && root.left==null && root.right==null){
            return null;
        }
        TreeNode left=pruneTree(root.left);
        TreeNode right=pruneTree(root.right);
        if(left==null && right==null && root.val==0){
            return null;
        }
        root.left=left;
        root.right=right;
        return root;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,null,0,0,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,0,1,0,0,0,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,1,0,1,1,0,1,0]\n
// @lcpr case=end

 */

