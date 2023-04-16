import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=2385 lang=java
 * @lcpr version=21906
 *
 * [2385] 感染二叉树需要的总时间
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
    Map<Integer,TreeNode> parents=new HashMap<>();
    TreeNode starNode=null;
    Set<Integer> seen=new HashSet<>();
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
// @lc code=end



/*
// @lcpr case=start
// [1,5,3,null,4,10,6,9,2]\n3\n
// @lcpr case=end

// @lcpr case=start
// [1,2,null,3,null,4,null,5]\n4\n
// @lcpr case=end

 */

