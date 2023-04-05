/*
 * @lc app=leetcode.cn id=222 lang=java
 * @lcpr version=21901
 *
 * [222] 完全二叉树的节点个数
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
    public int countNodes(TreeNode root) {
        //traverse(root);
        //return res;
        int leftH=0;
        int rightH=0;
        TreeNode l=root;
        while(l!=null){
            l=l.left;
            leftH++;
        }
        TreeNode r=root;
        while(r!=null){
            r=r.right;
            rightH++;
        }
        if(leftH==rightH){
            return (int)Math.pow(2, leftH)-1;
        }
        return 1+countNodes(root.left)+countNodes(root.right);
    }
    private void traverse(TreeNode root) {
        if(root==null){
            return;
        }
        res++;
        traverse(root.left);
        traverse(root.right);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4,5,6]\n
// @lcpr case=end

// @lcpr case=start
// []\n
// @lcpr case=end

// @lcpr case=start
// [1]\n
// @lcpr case=end

 */


