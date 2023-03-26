/*
 * @lc app=leetcode.cn id=617 lang=java
 * @lcpr version=21801
 *
 * [617] 合并二叉树
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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null){
            return root1;
        }
        if(root1==null){
            return root2;
        }
        if(root2==null){
            return root1;
        }
        root1.val=root1.val+root2.val;
        TreeNode left= mergeTrees(root1.left, root2.left);
        TreeNode right= mergeTrees(root1.right, root2.right);
        root1.left=left;
        root1.right=right;
        return root1;
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
// [1,3,2,5]\n[2,1,3,null,4,null,7]
// @lcpr case=end

// @lcpr case=start
// [1]\n[1,2]
// @lcpr case=end

 */


