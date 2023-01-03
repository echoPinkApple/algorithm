package org.echo.arithmetic;

import org.echo.arithmetic.domain.TreeNode;

/**
 * @projectName: arithmetic
 * @package: org.echo.arithmetic
 * @className: Solution98
 * @author: xin
 * @description: TODO
 * @date: 2022/12/30 16:39
 * @version: 1.0
 */

public class Solution98 {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode root, TreeNode min, TreeNode max) {
        if (root == null)
            return true;
//        若root不符合max，min的限定，则是不合法的二叉搜索树
        if (min != null && min.val > root.val)
            return false;
        if (max != null && max.val < root.val)
            return false;
//        限定左子树最大值为root，右子树最小值为root
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }
}
