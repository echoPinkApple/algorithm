/*
 * @lc app=leetcode.cn id=1008 lang=java
 * @lcpr version=21901
 *
 * [1008] 前序遍历构造二叉搜索树
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
    public TreeNode bstFromPreorder(int[] preorder) {
        return build(preorder,0,preorder.length-1);
    }

    private TreeNode build(int[] preorder, int left, int right) {
        if(left>right){
            return null;
        }
        if(left==right){
            return new TreeNode(preorder[left]);
        }
        int rootVal=preorder[left];
        TreeNode root=new TreeNode(rootVal);
        int index=right+1;
        for (int i = left+1; i <=right; i++) {
            if(preorder[i]>rootVal){
                index=i;
                break;
            }
        }
        root.left=build(preorder, left+1, index-1);
        root.right=build(preorder, index, right);
        return root;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [8,5,1,7,10,12]\n
// @lcpr case=end

// @lcpr case=start
// [4,2]\n
// @lcpr case=end

 */


