import static org.mockito.ArgumentMatchers.nullable;

import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=95 lang=java
 * @lcpr version=21901
 *
 * [95] 不同的二叉搜索树 II
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
    public List<TreeNode> generateTrees(int n) {
        return buildTree(1, n);
    }

    public List<TreeNode> buildTree(int left,int right){
        List<TreeNode> list=new ArrayList<>();
        if(left>right){
            list.add(null);
            return list;
        }
        for (int i = left; i <= right; i++) {
            List<TreeNode> leftTreeNodes = buildTree(left, i-1);
            List<TreeNode> rightTreeNodes = buildTree(i+1, right);
            for (TreeNode leftNode : leftTreeNodes) {
                for(TreeNode rightNode: rightTreeNodes){
                    TreeNode cur=new TreeNode(i);
                    cur.left=leftNode;
                    cur.right=rightNode;
                    list.add(cur);
                }
            }

        }
        return list;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 3\n
// @lcpr case=end

// @lcpr case=start
// 1\n
// @lcpr case=end

 */


