/*
 * @lc app=leetcode.cn id=450 lang=java
 * @lcpr version=21901
 *
 * [450] 删除二叉搜索树中的节点
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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return root;
        }
        if(root.val==key){
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }
            TreeNode rightMin=findMin(root.right);
            root.right=deleteNode(root.right, rightMin.val);
            rightMin.left=root.left;
            rightMin.right=root.right;
            root=rightMin;
        }
        else if(root.val<key){
            root.right= deleteNode(root.right, key);
        }
        else if(root.val>key){
            root.left= deleteNode(root.left, key);
        }
        return root;
    }

    private TreeNode findMin(TreeNode right) {
        while(right!=null && right.left!=null){
            right=right.left;
        }
        return right;
    }

}
// @lc code=end



/*
// @lcpr case=start
// [5,3,6,2,4,null,7]\n3\n
// @lcpr case=end

// @lcpr case=start
// [5,3,6,2,4,null,7]\n0\n
// @lcpr case=end

// @lcpr case=start
// []\n0\n
// @lcpr case=end

 */


