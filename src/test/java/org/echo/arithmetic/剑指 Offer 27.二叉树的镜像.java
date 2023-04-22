/*
 * @lc app=leetcode.cn id=剑指 Offer 27 lang=java
 * @lcpr version=21906
 *
 * [剑指 Offer 27] 二叉树的镜像
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
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null){
        return root;
        }
        TreeNode left=mirrorTree(root.left);
        TreeNode right=mirrorTree(root.right);
        root.left=right;
        root.right=left;
        return root;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 4/   \2     7/ \   / \1   3 6   9\n
// @lcpr case=end

// @lcpr case=start
// [4,2,7,1,3,6,9]\n
// @lcpr case=end

 */

