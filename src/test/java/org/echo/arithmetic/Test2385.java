package org.echo.arithmetic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Test2385 {
    Map<Integer,TreeNode> parents=new HashMap<>();
    TreeNode starNode=null;
    Set<Integer> seen=new HashSet<>();
    public static void main(String[] args) {
        Test2385 test = new Test2385();
        TreeNode node1=new TreeNode(1);
        TreeNode node2=new TreeNode(2);
        TreeNode node3=new TreeNode(3);
        TreeNode node4=new TreeNode(4);
        TreeNode node5=new TreeNode(5);
        node1.left=node2;
        node2.left=node3;
        node3.left=node4;
        node4.left=node5;
        int num= test.amountOfTime(node1, 4);
        System.out.println(num);
   
    }
    public int amountOfTime(TreeNode root, int start) {
        dfs(root,null,start);
        int minute=0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(starNode);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode cuTreeNode = queue.poll();
                seen.add(cuTreeNode.val);
                if (cuTreeNode.left != null && !seen.contains(cuTreeNode.left.val)) {
                    queue.offer(cuTreeNode.left);
                }
                if (cuTreeNode.right != null && !seen.contains(cuTreeNode.right.val)) {
                    queue.offer(cuTreeNode.right);
                }
                TreeNode pNode = parents.get(cuTreeNode.val);
                if (pNode != null && !seen.contains(pNode.val)) {
                    queue.offer(pNode);
                }
            }
            minute++;

        }
        return minute-1;
    }

    private void dfs(TreeNode root, TreeNode pre, int start) {
        if (root == null) {
            return;
        }
        if (root.val == start) {
            starNode = root;
        }
        parents.put(root.val, pre);
        dfs(root.left, root, start);
        dfs(root.right, root, start);
    }
}
