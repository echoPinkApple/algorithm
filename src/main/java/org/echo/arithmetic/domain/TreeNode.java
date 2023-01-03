package org.echo.arithmetic.domain;

/**
 * @projectName: arithmetic
 * @package: org.echo.arithmetic.domain
 * @className: TreeNode
 * @author: xin
 * @description: TODO
 * @date: 2022/12/28 9:39
 * @version: 1.0
 */

public class TreeNode {
    public Integer val;
    //以当前节点为根节点的树的节点总数
    public int size;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {

    }

    public TreeNode(Integer val) {
        this.val = val;
    }
}
