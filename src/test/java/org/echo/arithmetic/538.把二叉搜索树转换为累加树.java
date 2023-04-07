/*
 * @lc app=leetcode.cn id=538 lang=java
 * @lcpr version=21901
 *
 * [538] 把二叉搜索树转换为累加树
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
    int pre=0;
    public TreeNode convertBST(TreeNode root) {
        traverse(root);
        return root;
    }
    private void traverse(TreeNode root) {
        if(root==null){
            return;
        }

        traverse(root.right);
        root.val=root.val+pre;
        pre=root.val;
        traverse(root.left);
    }
}
// @lc code=end



/*
// @lcpr case=start
// 
// @lcpr case=end

// @lcpr case=start
// [0,null,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,0,2]\n
// @lcpr case=end

// @lcpr case=start
// [3,2,4,1]\n
// @lcpr case=end

 */


