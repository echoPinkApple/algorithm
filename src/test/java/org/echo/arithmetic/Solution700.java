package org.echo.arithmetic;

import org.echo.arithmetic.domain.TreeNode;

/**
 * @projectName: arithmetic
 * @package: org.echo.arithmetic
 * @className: Solution700
 * @author: xin
 * @description: TODO
 * @date: 2023/1/3 8:54
 * @version: 1.0
 */

public class Solution700 {
    public TreeNode searchBST(TreeNode root, int target) {
        if (root == null) {
            return null;
        }
        //去左子树找
        if (root.val > target) {
            return searchBST(root.left, target);
        }
        //右子树找
        if (root.val < target) {
            return searchBST(root.right, target);
        }
        return root;
    }
}
