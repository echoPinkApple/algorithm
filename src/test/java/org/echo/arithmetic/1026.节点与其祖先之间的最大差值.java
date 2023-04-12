/*
 * @lc app=leetcode.cn id=1026 lang=java
 * @lcpr version=21901
 *
 * [1026] 节点与其祖先之间的最大差值
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
    public int maxAncestorDiff(TreeNode root) {
        if(root==null){
            return 0;
        }
        dfs(root,root.val,root.val);
        return res;
    }
    private void dfs(TreeNode root,int preMax,int preMin) {
        if(root==null){
            return ;
        }
        if(root.val>preMax){
            preMax=root.val;
        }
        if(root.val<preMin){
            preMin=root.val;
        }
        if(root.left==null && root.right==null){
            res=Math.max(res, Math.abs(preMax-preMin));
        }
        dfs(root.left, preMax,preMin);
        dfs(root.right, preMax,preMin);

    }
}
// @lc code=end



/*
// @lcpr case=start
// [8,3,10,1,6,null,14,null,null,4,7,13]\n
// @lcpr case=end

// @lcpr case=start
// [1,null,2,null,0,3]\n
// @lcpr case=end

 */


