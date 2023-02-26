import static org.mockito.ArgumentMatchers.nullable;

import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=112 lang=java
 *
 * [112] 路径总和
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
    int flag=0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        Queue<TreeNode> node=new LinkedList<>();
        Queue<Integer> nodeSum=new LinkedList<>();
        node.offer(root);
        nodeSum.offer(root.val);
        while(node.size()>0){
            TreeNode poll = node.poll();
            Integer sumTemp = nodeSum.poll();
            if(poll.left==null && poll.right==null){
                if(sumTemp==targetSum){
                    return true;
                }
            }
            if(poll.left!=null){
                node.offer(poll.left);
                nodeSum.offer(sumTemp+poll.left.val);
            }
            if(poll.right!=null){
                node.offer(poll.right);
                nodeSum.offer(sumTemp+poll.right.val);
            }
        }
        return false;
        // if(root==null){
        //     return false;
        // }
        // targetSum-=root.val;
        // if(targetSum==0 && root.left==null && root.right==null){
        //     return true;
        // }
        // return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}
// @lc code=end

