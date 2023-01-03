package org.echo.arithmetic;

import org.echo.arithmetic.domain.TreeNode;

/**
 * @projectName: arithmetic
 * @package: org.echo.arithmetic
 * @className: Solution538
 * @author: xin
 * @description: TODO
 * @date: 2022/12/30 16:11
 * @version: 1.0
 */

public class Solution538 {
    public TreeNode convertBST(TreeNode root) {
        traverse(root);
        return root;
    }

    int sum = 0;

    private void traverse(TreeNode root) {
        if (root == null)
            return;
        //中序降序遍历二叉搜索树，此时结果是降序排列的，相加的值就是所有比该节点大的节点的累加和
        traverse(root.right);
        sum += root.val;
        root.val = sum;
        traverse(root.left);
    }
}
