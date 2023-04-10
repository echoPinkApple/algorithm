/*
 * @lc app=leetcode.cn id=938 lang=java
 * @lcpr version=21901
 *
 * [938] 二叉搜索树的范围和
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
    int res=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        traverse(root,low,high);
        return res;
    }

    private void traverse(TreeNode root, int low, int high) {
        if(root==null){
            return;
        }
        if(root.val<low){
            traverse(root.right, low, high);
        }
        else if(root.val>high){
            traverse(root.left, low, high);
        }
        else{
            traverse(root.left, low, high);
            res+=root.val;
            traverse(root.right, low, high);
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// [10,5,15,3,7,null,18]\n7\n15\n
// @lcpr case=end

// @lcpr case=start
// [10,5,15,3,7,13,18,1,null,6]\n6\n10\n
// @lcpr case=end

 */


