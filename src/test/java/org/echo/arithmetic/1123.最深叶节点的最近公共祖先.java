/*
 * @lc app=leetcode.cn id=1123 lang=java
 * @lcpr version=21906
 *
 * [1123] 最深叶节点的最近公共祖先
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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if(root==null){
            return root;
        }
        int lDepth=maxDepth(root.left);
        int rDepth=maxDepth(root.right);
        if(lDepth==rDepth){
            return root;
        }
        else if(lDepth>rDepth){
            return lcaDeepestLeaves(root.left);
        }
        else{
            return lcaDeepestLeaves(root.right);
        }
    }

    private int maxDepth(TreeNode node) {
        if(node==null){
            return 0;
        }
        return Math.max(maxDepth(node.left),maxDepth(node.right))+1;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,5,1,6,2,0,8,null,null,7,4]\n
// @lcpr case=end

// @lcpr case=start
// [1]\n
// @lcpr case=end

// @lcpr case=start
// [0,1,3,null,2]\n
// @lcpr case=end

 */

