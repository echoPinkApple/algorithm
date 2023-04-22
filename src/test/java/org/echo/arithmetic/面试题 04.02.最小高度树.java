/*
 * @lc app=leetcode.cn id=面试题 04.02 lang=java
 * @lcpr version=21906
 *
 * [面试题 04.02] 最小高度树
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums,0,nums.length-1);
    }

    private TreeNode build(int[] nums, int left, int right) {
        if(left>right){
            return null;
        }
        int mid=left+(right-left)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=build(nums, left, mid-1);
        root.right=build(nums, mid+1, right);
        return root;
    }
}
// @lc code=end



