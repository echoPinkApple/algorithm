/*
 * @lc app=leetcode.cn id=1022 lang=java
 * @lcpr version=21901
 *
 * [1022] 从根到叶的二进制数之和
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
    public int sumRootToLeaf(TreeNode root) {
        dfs(root,0);
        return res;
    }
    private void dfs(TreeNode root, int i) {
        if(root==null){
            return;
        }
        int sum=((i<<1)+root.val);
        if(root.left==null && root.right==null){
            res+=sum;
            return;
        }
        dfs(root.left, sum);
        dfs(root.right, sum);

    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,0,1,0,1,0,1]\n
// @lcpr case=end

// @lcpr case=start
// [0]\n
// @lcpr case=end

 */


