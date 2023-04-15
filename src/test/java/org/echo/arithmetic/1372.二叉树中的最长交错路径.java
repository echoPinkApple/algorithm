import static org.mockito.ArgumentMatchers.refEq;

/*
 * @lc app=leetcode.cn id=1372 lang=java
 * @lcpr version=21906
 *
 * [1372] 二叉树中的最长交错路径
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
    int ans = 0;

    public int longestZigZag(TreeNode root) {
        longestZigZag(root, false, 0);
        longestZigZag(root, true, 0);
        return ans;
    }

    public void longestZigZag(TreeNode root, boolean flag, int len) {
        ans = Math.max(ans, len);
        if (flag) {
            if (root.left != null) {
                longestZigZag(root.left, !flag, len + 1);
            }
            if (root.right != null) {
                longestZigZag(root.right, flag, 1);
            }
        } else {
            if (root.right != null) {
                longestZigZag(root.right, !flag, len + 1);
            }
            if (root.left != null) {
                longestZigZag(root.left, flag, 1);
            }
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,null,1,1,1,null,null,1,1,null,1,null,null,null,1,null,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,1,1,null,1,null,null,1,1,null,1]\n
// @lcpr case=end

// @lcpr case=start
// [1]\n
// @lcpr case=end

 */

