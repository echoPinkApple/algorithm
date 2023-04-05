import static org.mockito.Mockito.when;

/*
 * @lc app=leetcode.cn id=114 lang=java
 * @lcpr version=21901
 *
 * [114] 二叉树展开为链表
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
    public void flatten(TreeNode root) {
        traverse(root);
    }
    public TreeNode traverse(TreeNode root){
        if(root==null){
            return null;
        }
        // if(root.left==null && root.right==null){
        //     return root;
        // }
        TreeNode left= traverse(root.left);
        TreeNode right= traverse(root.right);
        root.right=left;
        root.left=null;
        TreeNode tmp=root;
        while(tmp.right!=null){
            tmp=tmp.right;
        }
        tmp.right=right;
        return root;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,5,3,4,null,6]\n
// @lcpr case=end

// @lcpr case=start
// []\n
// @lcpr case=end

// @lcpr case=start
// [0]\n
// @lcpr case=end

 */


