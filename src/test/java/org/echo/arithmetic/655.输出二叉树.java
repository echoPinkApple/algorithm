import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=655 lang=java
 * @lcpr version=21901
 *
 * [655] 输出二叉树
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<List<String>> printTree(TreeNode root) {
        int depth = calDepth(root);
        int row = depth + 1;
        int column = (1 << (depth + 1)) - 1;
        List<List<String>> res = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            List<String> tmp = new ArrayList<>();
            for (int j = 0; j < column; j++) {
                tmp.add("");
            }
            res.add(tmp);
        }
        dfs(root, res, 0, (column - 1) / 2, depth);
        return res;
    }

    private void dfs(TreeNode root, List<List<String>> res, int r, int c, int height) {
        res.get(r).set(c, Integer.toString(root.val));
        if (root.left != null) {
            dfs(root.left, res, r + 1, c - (1 << (height - r - 1)), height);
        }
        if (root.right != null) {
            dfs(root.right, res, r + 1, c + (1 << (height - r - 1)), height);
        }
    }

    private int calDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depth=0;
        if (root.left != null) {
            depth=Math.max(depth,calDepth(root.left) + 1);
        }
        if (root.right != null) {
            depth=Math.max(depth,calDepth(root.right) + 1);
        }
        return depth;
    }
}
// @lc code=end

/*
 * // @lcpr case=start
 * // [1,2]\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // [1,2,3,null,4]\n
 * // @lcpr case=end
 * 
 */
