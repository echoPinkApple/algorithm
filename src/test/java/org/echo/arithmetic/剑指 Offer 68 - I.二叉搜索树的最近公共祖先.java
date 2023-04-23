/*
 * @lc app=leetcode.cn id=剑指 Offer 68 - I lang=java
 * @lcpr version=21906
 *
 * [剑指 Offer 68 - I] 二叉搜索树的最近公共祖先
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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ans=root;
        while(true){
            if(ans.val<p.val&&ans.val<q.val){
                ans=ans.right;
            }
            else if(ans.val>p.val && ans.val>q.val){
                ans=ans.left;
            }
            else{
                break;
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [6,2,8,0,4,7,9,null,null,3,5]\n2\n8\n
// @lcpr case=end

// @lcpr case=start
// [6,2,8,0,4,7,9,null,null,3,5]\n2\n4\n
// @lcpr case=end

 */

