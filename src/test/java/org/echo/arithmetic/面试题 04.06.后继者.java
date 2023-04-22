import java.util.ArrayDeque;
import java.util.Deque;

/*
 * @lc app=leetcode.cn id=面试题 04.06 lang=java
 * @lcpr version=21906
 *
 * [面试题 04.06] 后继者
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
        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        TreeNode prev = null, curr = root;
        while (!stack.isEmpty() || curr != null) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            if (prev == p) {
                return curr;
            }
            prev = curr;
            curr = curr.right;
        }
        return null;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,1,3]\n12/ \1   3\n
// @lcpr case=end

// @lcpr case=start
// [5,3,6,2,4,null,null,1]\n65/ \3   6/ \2   4/   1\n
// @lcpr case=end

 */

