/*
 * @lc app=leetcode.cn id=剑指 Offer II 049 lang=java
 * @lcpr version=21906
 *
 * [剑指 Offer II 049] 从根节点到叶节点的路径数字之和
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
    public int sumNumbers(TreeNode root) {
        dfs(root,0);
        return sum;
    }
    private void dfs(TreeNode root,int add) {
        if(root==null){
            return;
        }
        add=add*10+root.val;
        if(root.left==null && root.right==null){
            sum+=add;
        }
        dfs(root.left, add);
        dfs(root.right, add);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3]\n
// @lcpr case=end

// @lcpr case=start
// [4,9,0,5,1]\n
// @lcpr case=end

 */

