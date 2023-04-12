/*
 * @lc app=leetcode.cn id=998 lang=java
 * @lcpr version=21901
 *
 * [998] 最大二叉树 II
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
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        TreeNode parent=null;
        TreeNode cur=root;
        while(cur!=null){
            if(val>cur.val){
                if(parent==null){
                    TreeNode node=new TreeNode(val);
                    node.left=root;
                    return node;
                }
                else{
                    TreeNode node=new TreeNode(val);
                    parent.right=node;
                    node.left=cur;
                    return root;
                }
            }
            else {
                parent=cur;
                cur=cur.right;
            }
        }
        TreeNode node=new TreeNode(val);
        parent.right=node;
        return root;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,1,3,null,null,2]\n5\n
// @lcpr case=end

// @lcpr case=start
// [5,2,4,null,1]\n3\n
// @lcpr case=end

// @lcpr case=start
// [5,2,3,null,1]\n4\n
// @lcpr case=end

 */


