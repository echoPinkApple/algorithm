import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=144 lang=java
 *
 * [144] 二叉树的前序遍历
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){
            return new ArrayList<Integer>();
        }
        Deque<TreeNode> queue=new LinkedList<>();
        List<Integer> res=new ArrayList<>();
        TreeNode node=root;
        while(!queue.isEmpty() || node!=null){
            while(node!=null){
                res.add(node.val);
                queue.push(node);
                node=node.left;
            }
            TreeNode pop = queue.pop();
            node=pop.right;
        }
        return res;
    }
}
// @lc code=end

