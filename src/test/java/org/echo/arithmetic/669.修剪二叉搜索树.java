import static org.mockito.ArgumentMatchers.refEq;

/*
 * @lc app=leetcode.cn id=669 lang=java
 * @lcpr version=21901
 *
 * [669] 修剪二叉搜索树
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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root==null){
            return root;
        }
        if(root.val<low){
            return trimBST(root.right, low, high);
        }
        if(root.val>high){
            return trimBST(root.left, low, high);
        }
        root.left=trimBST(root.left, low, high);
        root.right=trimBST(root.right, low, high);
        return root;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,null,2]\n2\n4\n
// @lcpr case=end

// @lcpr case=start
// [3,0,4,null,2,null,null,1]\n1\n3\n
// @lcpr case=end

 */


