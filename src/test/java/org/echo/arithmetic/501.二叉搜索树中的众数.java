import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;

/*
 * @lc app=leetcode.cn id=501 lang=java
 * @lcpr version=21801
 *
 * [501] 二叉搜索树中的众数
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
    // 记录众数
    List<Integer> mode = new ArrayList<>();
    // 记录root节点
    TreeNode pre = null;
    // 记录当前数字出现次数
    int curCount = 0;
    // 记录众数出现次数
    int maxCount = 0;

    public int[] findMode(TreeNode root) {
        traverse(root);
        int[] res = new int[mode.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = mode.get(i);
        }
        return res;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(root.left);
        // 初始化众数
        if (pre == null) {
            maxCount = 1;
            curCount = 1;
            mode.add(root.val);
        } else {
            // 更新众数
            if (root.val == pre.val) {
                curCount++;
                if (curCount == maxCount) {
                    mode.add(root.val);
                } else if (curCount > maxCount) {
                    mode.clear();
                    maxCount = curCount;
                    mode.add(root.val);
                }
            } else {
                curCount = 1;
                if (curCount == maxCount) {
                    mode.add(root.val);
                }
            }
        }
        pre = root;
        traverse(root.right);
    }
}
// @lc code=end

// @lcpr-div-debug-arg-start
// funName=
// paramTypes= []
// returnType=
// @lcpr-div-debug-arg-end

/*
 * // @lcpr case=start
 * // [1,null,2,2]\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // [0]\n
 * // @lcpr case=end
 * 
 */
