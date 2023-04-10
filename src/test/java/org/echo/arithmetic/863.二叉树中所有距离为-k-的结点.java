import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import apple.laf.JRSUIUtils.Tree;
import ch.qos.logback.core.joran.conditional.ElseAction;

/*
 * @lc app=leetcode.cn id=863 lang=java
 * @lcpr version=21901
 *
 * [863] 二叉树中所有距离为 K 的结点
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<Integer> res = new ArrayList<>();
    Map<Integer, TreeNode> parents = new HashMap<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        findParent(root);
        dfs(target, null, k, 0);
        return res;
    }

    private void findParent(TreeNode root) {
        if (root.left != null) {
            parents.put(root.left.val, root);
            findParent(root.left);
        }
        if (root.right != null) {
            parents.put(root.right.val, root);
            findParent(root.right);
        }

    }

    private void dfs(TreeNode node, TreeNode from, int k, int depth) {
        if (node == null) {
            return;
        }
        if (k == depth) {
            res.add(node.val);
            return;
        }
        //防止走回头路，用from记录来源于哪个节点
        if (node.left != from) {
            dfs(node.left, node, k, depth + 1);
        }
        if (node.right != from) {
            dfs(node.right, node, k, depth + 1);
        }
        if (parents.get(node.val) != from) {
            dfs(parents.get(node.val), node, k, depth + 1);
        }
    }
}
// @lc code=end

/*
 * // @lcpr case=start
 * // [3,5,1,6,2,0,8,null,null,7,4]\n5\n0\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // [1]\n1\n3\n
 * // @lcpr case=end
 * 
 */
