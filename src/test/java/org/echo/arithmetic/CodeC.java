package org.echo.arithmetic;

import org.echo.arithmetic.domain.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @projectName: arithmetic
 * @package: org.echo.arithmetic
 * @className: CodeC
 * @author: xin
 * @description: TODO
 * @date: 2022/12/28 14:21
 * @version: 1.0
 */

public class CodeC {
    String SPE = ",";
    String NULL = "#";

    public String serialize(TreeNode root) {
        StringBuilder builder = new StringBuilder();
        serialize(root, builder);
        return builder.toString();
    }

    public void serialize(TreeNode node, StringBuilder builder) {
        if (node == null) {
            builder.append(NULL).append(SPE);
            return;
        }
        builder.append(node.val).append(SPE);
        serialize(node.left, builder);
        serialize(node.right, builder);
    }

    public TreeNode deSerialize(String s) {
        LinkedList<String> nodes = new LinkedList<>(Arrays.asList(s.split(SPE)));
        return deSerialize(nodes);
    }

    private TreeNode deSerialize(LinkedList<String> nodes) {
        if (nodes.isEmpty()) {
            return null;
        }
        String first = nodes.removeFirst();
        if (first.equals(NULL)) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(first));
        node.left = deSerialize(nodes);
        node.right = deSerialize(nodes);
        return node;
    }
}
