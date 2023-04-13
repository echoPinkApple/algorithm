/*
 * @lc app=leetcode.cn id=1038 lang=java
 * @lcpr version=21906
 *
 * [1038] 从二叉搜索树到更大和树
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
    public TreeNode bstToGst(TreeNode root) {
        if(root== null){
            return root;
        }
        buildTree(root);
        return root;
    }

    private void buildTree(TreeNode root) {
        if(root==null){
            return ;
        }
        buildTree(root.right);
        int add=sum+root.val;
        root.val=add;
        sum=add;
        buildTree(root.left);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]\n
// @lcpr case=end

// @lcpr case=start
// [0,null,1]\n
// @lcpr case=end

 */

