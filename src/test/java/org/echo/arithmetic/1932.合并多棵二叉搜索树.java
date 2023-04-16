import java.util.List;

/*
 * @lc app=leetcode.cn id=1932 lang=java
 * @lcpr version=21906
 *
 * [1932] 合并多棵二叉搜索树
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
    public TreeNode canMerge(List<TreeNode> trees) {
        if(trees.size()<1){
            return new TreeNode();
        }
        if(trees.size()==1){
            return trees.get(0);
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[2,1],[3,2,5],[5,4]]\n
// @lcpr case=end

// @lcpr case=start
// [[5,3,8],[3,2,6]]\n
// @lcpr case=end

// @lcpr case=start
// [[5,4],[3]]\n
// @lcpr case=end

 */

