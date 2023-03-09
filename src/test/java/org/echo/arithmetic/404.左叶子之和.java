/*
 * @lc app=leetcode.cn id=404 lang=java
 * @lcpr version=21801
 *
 * [404] 左叶子之和
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
    public int sumOfLeftLeaves(TreeNode root) {
        return traverse(root);
    }

    public int traverse(TreeNode root){
        if(root==null){
            return 0;
        }
        int sum=0;
        if(root.left!=null && root.left.left==null && root.left.right==null){
            sum+=root.left.val;
        }
        sum+= traverse(root.left);
        sum+= traverse(root.right);
        return sum;
    }
}
// @lc code=end

// @lcpr-div-debug-arg-start
// funName=
// paramTypes= []
// returnType=
// @lcpr-div-debug-arg-end


/*
// @lcpr case=start
// [3,9,20,null,null,15,7]\n
// @lcpr case=end

// @lcpr case=start
// [1]\n
// @lcpr case=end

 */


