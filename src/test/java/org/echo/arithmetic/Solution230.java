package org.echo.arithmetic;

import org.echo.arithmetic.domain.TreeNode;

/**
 * @projectName: arithmetic
 * @package: org.echo.arithmetic
 * @className: Solution234
 * @author: xin
 * @description: TODO
 * @date: 2022/12/29 15:17
 * @version: 1.0
 */

public class Solution230 {
    public int kthSmallest(TreeNode root, int k) {
        traverse(root, k);
        return res;
    }
    int res = 0;
    int rank = 0;
    private void traverse(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        traverse(root.left, k);
        rank++;
        if (k == rank) {
            res = root.val;
            return;
        }
        traverse(root.right, k);
    }
}
