/*
 * @lc app=leetcode.cn id=剑指 Offer 54 lang=java
 * @lcpr version=21906
 *
 * [剑指 Offer 54] 二叉搜索树的第k大节点
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
    int res, k;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }
    void dfs(TreeNode root) {
        if(root == null) return;
        dfs(root.right);
        if(k == 0) return;
        if(--k == 0) res = root.val;
        dfs(root.left);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,1,4,null,2]\n13/ \1   4\2\n
// @lcpr case=end

// @lcpr case=start
// [5,3,6,2,4,null,null,1]\n35/ \3   6/ \2   4/1\n
// @lcpr case=end

 */

