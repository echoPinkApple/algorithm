package org.echo.arithmetic;

import java.util.LinkedList;


public class Test129 {
    public static void main(String[] args) {
        Test129 test = new Test129();
        TreeNode root=new TreeNode(1);
        TreeNode left=new TreeNode(2);
        TreeNode right=new TreeNode(3);
        root.left=left;
        root.right=right;
        test.sumNumbers(root);
        System.out.println(test.res);
    }
    LinkedList<Integer> route=new LinkedList<>();
    int res=0;
    public int sumNumbers(TreeNode root) {
        traverse(root);
        return res;
    }
    private void traverse(TreeNode root) {
        if(root==null){
            return;
        }
        route.addLast(root.val);
        if(root.left==null && root.right==null){
            System.out.println(route);
            int sum=0;
            for (int i = 0; i < route.size(); i++) {
                System.out.println(route.get(i));
                sum=sum*10;
                sum+=route.get(i);
            }
            res+=sum;
        }
        traverse(root.left);
        traverse(root.right);
        route.removeLast();
    }
}
