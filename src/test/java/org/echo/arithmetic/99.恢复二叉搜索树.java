import java.rmi.registry.RegistryHandler;
import java.util.ArrayList;
import java.util.List;

import apple.laf.JRSUIUtils.Tree;

/*
 * @lc app=leetcode.cn id=99 lang=java
 * @lcpr version=21901
 *
 * [99] 恢复二叉搜索树
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
    TreeNode pre=new TreeNode(Integer.MIN_VALUE);
    TreeNode first=null;
    TreeNode last=null;
    public void recoverTree(TreeNode root) {
        traverse(root);
        if(last!=null && first!=null){}
        int tmp=first.val;
        first.val=last.val;
        last.val=tmp;
    }

    private void traverse(TreeNode root) {
        if(root==null){
            return;
        }
        traverse(root.left);
        if(root.val<pre.val){
            last=root;
            if(first==null){
                first=pre;
            }
        }
        pre=root;
        traverse(root.right);

    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,3,null,null,2]\n
// @lcpr case=end

// @lcpr case=start
// [3,1,4,null,null,2]\n
// @lcpr case=end

 */


