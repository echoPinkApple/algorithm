import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.when;

import java.util.Deque;
import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=剑指 Offer II 053 lang=java
 * @lcpr version=21906
 *
 * [剑指 Offer II 053] 二叉搜索树中的中序后继
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        Deque<TreeNode> deque=new LinkedList<>();
        TreeNode pre=null;
        while(root!=null || !deque.isEmpty()){
            while(root!=null){
                deque.push(root);
                root=root.left;
            }
            TreeNode top=deque.pop();
            if(pre!=null && pre.val==p.val){
                return top;
            }
            pre=top;
            root=top.right;
        }
        return null;
    }


}
// @lc code=end



/*
// @lcpr case=start
// [2,1,3]\n1\n
// @lcpr case=end

// @lcpr case=start
// [5,3,6,2,4,null,null,1]\n6\n
// @lcpr case=end

 */

