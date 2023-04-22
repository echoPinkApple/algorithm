import apple.laf.JRSUIUtils.Tree;

/*
 * @lc app=leetcode.cn id=面试题 17.12 lang=java
 * @lcpr version=21906
 *
 * [面试题 17.12] BiNode
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode convertBiNode(TreeNode root) {
        return dfs(root);
    }

    public TreeNode dfs(TreeNode root){
        if(root==null || (root.left==null) && root.right==null){
            return root;
        }
        TreeNode lNode= dfs(root.left);
        root.left=null;
        if(lNode!=null){
            TreeNode tmpNode=lNode;
            while(tmpNode.right!=null){
                tmpNode=tmpNode.right;
            }
            tmpNode.right=root;
        }
        else{
            lNode=root;
        }
        TreeNode rNode= dfs(root.right);
        root.right=rNode;
        return lNode;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,2,5,1,3,null,6,0]\n
// @lcpr case=end

 */

