/*
 * @lc app=leetcode.cn id=剑指 Offer II 050 lang=java
 * @lcpr version=21906
 *
 * [剑指 Offer II 050] 向下的路径节点之和
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
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return 0;
        }
        dfs(root,targetSum,0);
        return res;
    }
    private void dfs(TreeNode root, int targetSum, int sum) {
        if(root==null){
            return ;
        }
        dfs2(root,targetSum,0);
        dfs(root.left, targetSum, 0);
        dfs(root.right, targetSum, 0);
    }
    private void dfs2(TreeNode root, int targetSum, long sum) {
        if(root==null){
            return;
        }
        sum=sum+root.val;
        if(targetSum==sum){
            res++;
        }
        dfs2(root.left, targetSum, sum);
        dfs2(root.right, targetSum, sum);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [10,5,-3,3,2,null,11,3,-2,null,1]\n8\n
// @lcpr case=end

// @lcpr case=start
// [715827882,715827882,null,715827882,null,1,null,715827882,null,715827882,null,715827882,null]\n-3\n
// @lcpr case=end

 */

