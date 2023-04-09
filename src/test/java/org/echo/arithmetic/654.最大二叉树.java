/*
 * @lc app=leetcode.cn id=654 lang=java
 * @lcpr version=21901
 *
 * [654] 最大二叉树
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return buildTree(nums,0,nums.length-1);
    }

    private TreeNode buildTree(int[] nums, int left, int right) {
        if(left>right){
            return null;
        }
        int max=Integer.MIN_VALUE;
        int index=left;
        for (int i = left; i <=right; i++) {
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }
        TreeNode root=new TreeNode(max);
        TreeNode leftNode=buildTree(nums, left, index-1);
        TreeNode rightNode=buildTree(nums, index+1, right);
        root.left=leftNode;
        root.right=rightNode;
        return root;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,2,1,6,0,5]\n
// @lcpr case=end

// @lcpr case=start
// [3,2,1]\n
// @lcpr case=end

 */


