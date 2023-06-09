/*
 * @lc app=leetcode.cn id=1325 lang=java
 * @lcpr version=21906
 *
 * [1325] 删除给定值的叶子节点
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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root==null){
            return null;
        }
        root.left= removeLeafNodes(root.left, target);
        root.right= removeLeafNodes(root.right, target);
        if(root.left==null && root.right==null && root.val==target){
            return null;
        }
        return root;    
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,2,null,2,4]\n2\n
// @lcpr case=end

// @lcpr case=start
// [1,3,3,3,2]\n3\n
// @lcpr case=end

// @lcpr case=start
// [1,2,null,2,null,2]\n2\n
// @lcpr case=end

// @lcpr case=start
// [1,1,1]\n1\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3]\n1\n
// @lcpr case=end

 */

