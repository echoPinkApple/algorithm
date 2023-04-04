import java.security.cert.TrustAnchor;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.management.Query;

/*
 * @lc app=leetcode.cn id=103 lang=java
 * @lcpr version=21901
 *
 * [103] 二叉树的锯齿形层序遍历
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new LinkedList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        boolean flag=false;
        while(!queue.isEmpty()){
            LinkedList<Integer> list=new LinkedList<>();
            int size=queue.size();
            if(flag){
                for (int i = 0; i < size; i++) {
                    TreeNode node=queue.poll();
                    list.addFirst(node.val);
                    if(node.left!=null){
                        queue.offer(node.left);
                    }
                    if(node.right!=null){
                        queue.offer(node.right);
                    }
                }
            }
            else{
                for (int i = 0; i < size; i++) {
                    TreeNode node=queue.poll();
                    list.addLast(node.val);
                    if(node.left!=null){
                        queue.offer(node.left);
                    }
                    if(node.right!=null){
                        queue.offer(node.right);
                    }
                }
            }
            flag=!flag;
            res.add(list);
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,9,20,null,null,15,7]\n
// @lcpr case=end

// @lcpr case=start
// [1]\n
// @lcpr case=end

// @lcpr case=start
// []\n
// @lcpr case=end

 */


