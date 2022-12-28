package org.echo.arithmetic;

import org.echo.arithmetic.domain.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @projectName: arithmetic
 * @package: org.echo.arithmetic
 * @className: CodeA
 * @author: xin
 * @description: TODO
 * @date: 2022/12/28 15:10
 * @version: 1.0
 */

public class CodeA {
    String SPE = ",";
    String NULL = "#";

    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (cur == null) {
                builder.append(NULL).append(SPE);
                continue;
            }
            builder.append(cur.val).append(SPE);
            queue.offer(cur.left);
            queue.offer(cur.right);
        }
        return builder.toString();
    }

    public TreeNode deSerialize(String s) {
        if (s.isEmpty()) {
            return null;
        }
        String[] data = s.split(SPE);
        TreeNode root = new TreeNode(Integer.parseInt(data[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        for (int i = 1; i < queue.size(); i++) {
            TreeNode parent = queue.poll();
            String left = data[i++];
            if (left.equals(NULL)) {
                parent.left = null;
            } else {
                parent.left = new TreeNode(Integer.parseInt(left));
                queue.offer(parent.left);
            }
            String right = data[i++];
            if (right.equals(NULL)) {
                parent.right = null;
            } else {
                parent.right = new TreeNode(Integer.parseInt(right));
                queue.offer(parent.right);
            }
        }
        return root;
    }
}
