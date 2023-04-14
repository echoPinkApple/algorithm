/*
 * @lc app=leetcode.cn id=1315 lang=java
 * @lcpr version=21906
 *
 * [1315] 祖父节点值为偶数的节点和
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
    public int sumEvenGrandparent(TreeNode root) {
        dfs(root);
        return res;
    }
    private void dfs(TreeNode root) {
        if(root==null){
            return;
        }
        if((root.val&1)==0){
            if(root.left!=null){
                if(root.left.left!=null){
                    res+=root.left.left.val;
                }
                if(root.left.right!=null){
                    res+=root.left.right.val;
                }
            }
            if(root.right!=null){
                if(root.right.left!=null){
                    res+=root.right.left.val;
                }
                if(root.right.right!=null){
                    res+=root.right.right.val;
                }
            }
        }
        dfs(root.left);
        dfs(root.right);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]\n
// @lcpr case=end

 */

