/*
 * @lc app=leetcode.cn id=437 lang=java
 * @lcpr version=21901
 *
 * [437] 路径总和 III
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
    int sum=0;
    public int pathSum(TreeNode root, int targetSum) {
        traverse(root,targetSum);
        return sum;
    }

    private void traverse(TreeNode root, int targetSum) {
        if(root==null){
            return;
        }
        find(root,targetSum);
        traverse(root.left, targetSum);
        traverse(root.right, targetSum);
    }

    private void find(TreeNode root, long targetSum) {
        if(root==null){
            return;
        }
        if((targetSum-root.val)==0){
            sum+=1;
        }
        find(root.left,targetSum-root.val);
        find(root.right,targetSum-root.val);
    }
    
}
// @lc code=end



/*
// @lcpr case=start
// [10,5,-3,3,2,null,11,3,-2,null,1]\n8\n
// @lcpr case=end

// @lcpr case=start
// [1000000000,1000000000,null,294967296,null,1000000000,null,1000000000,null,1000000000]\n0\n

// @lcpr case=end

 */


