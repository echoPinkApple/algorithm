package org.echo.arithmetic;

import org.echo.arithmetic.domain.TreeNode;
import org.junit.Test;

/**
 * @projectName: arithmetic
 * @package: org.echo.arithmetic
 * @className: StreamTest
 * @author: xin
 * @description: TODO
 * @date: 2022/12/8 14:01
 * @version: 1.0
 */

public class StreamTest {
    @Test
    public void testPrint() {
        System.out.println("springboot application");
    }

//1、首先把前序遍历结果的第一个元素或者后序遍历结果的最后一个元素确定为根节点的值。
//
//2、然后把前序遍历结果的第二个元素作为左子树的根节点的值。
//
//3、在后序遍历结果中寻找左子树根节点的值，从而确定了左子树的索引边界，进而确定右子树的索引边界，递归构造左右子树即可。
    public TreeNode buildTreeByPrePost(int[] preOrder, int preStart, int preEnd, int[] postOrder, int postStart, int postEnd) {
        if (preStart > preEnd) {
            return null;
        }
        if (preStart == preEnd) {
            return new TreeNode(preOrder[preStart]);
        }
        //根节点值
        int rootVal = preOrder[preStart];
//        根节点左节点值
        int rootLeftVal = preOrder[preStart + 1];
        int index = 0;
//        获取根节点的左节点在后序遍历中的位置
        for (int i = postStart; i < postEnd; i++) {
            if (postOrder[i] == rootLeftVal) {
                index = i;
                break;
            }
        }
        int leftSize = index - postStart + 1;
        TreeNode root = new TreeNode(rootVal);
        root.left = buildTreeByPrePost(preOrder, preStart + 1, preStart + leftSize, postOrder, postStart, index);
        root.right = buildTreeByPrePost(preOrder, preStart + leftSize + 1, preEnd, postOrder, index + 1, postEnd - 1);
        return root;
    }


    //通过中序后序构造二叉树
    public TreeNode build(int[] postOrder, int postStart, int postEnd, int[] inOrder, int inStart, int inEnd) {
        if (inStart > inEnd) {
            return null;
        }
        //root节点为后序遍历的最后一个值
        int rootVal = postOrder[postEnd];
        int rootIndex = 0;
        //获取root在中序遍历数组的位置
        for (int i = inStart; i <= inEnd; i++) {
            if (inOrder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }
        TreeNode root = new TreeNode(rootVal);
        //计算左子树大小
        int leftSize = rootIndex - inStart;
        //递归构造左右子树
        root.left = build(postOrder, postStart, postStart + leftSize - 1, inOrder, inStart, rootIndex - 1);
        root.right = build(postOrder, postStart + leftSize, postEnd - 1, inOrder, rootIndex + 1, inEnd);
        return root;
    }


    public int traverse(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        int leftDepth = traverse(treeNode.left);
        int rightDepth = traverse(treeNode.right);
        System.out.println("left:" + leftDepth + "right" + rightDepth);
        return leftDepth + rightDepth + 1;
    }
}
