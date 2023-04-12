/*
 * @lc app=leetcode.cn id=993 lang=java
 * @lcpr version=21901
 *
 * [993] 二叉树的堂兄弟节点
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
    TreeNode xParent=null;
    int xDepth=0;
    TreeNode yParent=null;
    int yDepth=0;
    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(null,root,x,y,0);
        if(xDepth!=yDepth){
            return false;
        }
        if(xParent==yParent){
            return false;
        }
        return true;
    }
    private void dfs(TreeNode pre, TreeNode root, int x, int y,int depth) {
        if(root==null){
            return;
        }
        if(root.val==x){
            xDepth=depth;
            xParent=pre;
        }
        if(root.val==y){
            yDepth=depth;
            yParent=pre;
        }
        dfs(root, root.left, x, y, depth+1);
        dfs(root, root.right, x, y, depth+1);

    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4]\n4\n3\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,null,4,null,5]\n5\n4\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,null,4]\n2\n3\n
// @lcpr case=end

 */


