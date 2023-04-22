import apple.laf.JRSUIUtils.Tree;

/*
 * @lc app=leetcode.cn id=剑指 Offer 28 lang=java
 * @lcpr version=21906
 *
 * [剑指 Offer 28] 对称的二叉树
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
// class Solution {
//     public boolean isSymmetric(TreeNode root) {
//         if (root == null) {
//             return true;
//         }
//         return isSymmetric(root.left, root.right);
//     }

//     public boolean isSymmetric(TreeNode node1, TreeNode node2) {
//         if (node1 == node2) {
//             return true;
//         }
//         if (node1 == null || node2 == null) {
//             return false;
//         }
//         return node1.val == node2.val && isSymmetric(node1.left, node2.right) && isSymmetric(node1.right, node2.left);

//     }
// }
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode node1, TreeNode node2) {
        if (node1 == node2) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        return node1.val == node2.val && isSymmetric(node1.left, node2.right) && isSymmetric(node1.right, node2.left);

    }
}
// @lc code=end

/*
 * // @lcpr case=start
 * [1,2,2,3,4,4,3]\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * [1,2,2,null,3,null,3]\n
 * // @lcpr case=end
 * 
 */
