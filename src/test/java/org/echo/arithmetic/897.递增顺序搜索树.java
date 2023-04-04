import static org.mockito.ArgumentMatchers.nullable;

import java.util.ArrayList;
import java.util.List;

import apple.laf.JRSUIUtils.Tree;

/*
 * @lc app=leetcode.cn id=897 lang=java
 * @lcpr version=21901
 *
 * [897] 递增顺序搜索树
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
    List<TreeNode> list=new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        traverse(root);
        TreeNode dummy=new TreeNode(-1);
        TreeNode head=dummy;
        for (TreeNode node : list) {
            node.left=null;
            node.right=null;
            head.right=node;
            head=node;
        }
        return dummy.right;
    }
    private void traverse(TreeNode root) {
        if(root==null){
            return;
        }
        traverse(root.left);
        list.add(root);
        traverse(root.right);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [5,3,6,2,4,null,8,1,null,null,null,7,9]\n
// @lcpr case=end

// @lcpr case=start
// [5,1,7]\n
// @lcpr case=end

 */


