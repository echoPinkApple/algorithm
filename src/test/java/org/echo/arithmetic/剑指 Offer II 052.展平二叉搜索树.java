import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=剑指 Offer II 052 lang=java
 * @lcpr version=21906
 *
 * [剑指 Offer II 052] 展平二叉搜索树
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
    public TreeNode increasingBST(TreeNode root) {
        if(root==null){
            return root;
        }
        Deque<TreeNode> deque=new LinkedList<>();
        List<TreeNode> nodes=new ArrayList<>();
        while(root!=null || !deque.isEmpty()){
            while(root!=null){
                deque.push(root);
                root=root.left;
            }
            TreeNode pop = deque.pop();
            nodes.add(pop);
            root=pop.right;
        }
        TreeNode tmpHead=new TreeNode(-1);
        TreeNode next=tmpHead;
        for (TreeNode node : nodes) {
            node.left=null;
            node.right=null;
            next.right=node;
            next=next.right;
        }
        return tmpHead.right;

    }
}
// @lc code=end



/*
// @lcpr case=start
// [5,3,6,2,4,null,8,1,null,null,null,7,9]\n
// @lcpr case=end

// @lcpr case=start
// [5,1,7]\n
// @lcpr case=end

 */

