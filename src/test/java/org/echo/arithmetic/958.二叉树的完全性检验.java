/*
 * @lc app=leetcode.cn id=958 lang=java
 * @lcpr version=21901
 *
 * [958] 二叉树的完全性检验
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
    int size=0;
    int maxIndex=0;
    public boolean isCompleteTree(TreeNode root) {
        traverse(root,1);
        return size==maxIndex;
    }
    private void traverse(TreeNode root, int index) {
        if(root==null){
            return;
        }
        size++;
        maxIndex=Math.max(maxIndex, index);
        traverse(root.left, index*2);
        traverse(root.right, index*2+1);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4,5,6]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4,5,null,7]\n
// @lcpr case=end

 */


