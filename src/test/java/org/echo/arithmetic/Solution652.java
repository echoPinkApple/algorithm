package org.echo.arithmetic;

import org.echo.arithmetic.domain.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


/**
 * @projectName: arithmetic
 * @package: org.echo.arithmetic
 * @className: Solution652
 * @author: xin
 * @description: TODO
 * @date: 2022/12/28 15:48
 * @version: 1.0
 */

public class Solution652 {
    //记录子树出现的次数
    HashMap<String, Integer> memo = new HashMap<>();
    //记录返回的节点
    LinkedList<TreeNode> res = new LinkedList<>();

    List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        traverse(root);
        return res;
    }

    private String traverse(TreeNode root) {
        if (root == null) {
            return "#";
        }
        String left = traverse(root.left);
        String right = traverse(root.right);
        String subTree = left + "," + right + "," + root.val;
        int freq = memo.getOrDefault(subTree, 0);
        if (freq == 1) {
            res.add(root);
        }
        memo.put(subTree, freq + 1);
        return subTree;
    }
}
