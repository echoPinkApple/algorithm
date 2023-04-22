/*
 * @lc app=leetcode.cn id=剑指 Offer 26 lang=java
 * @lcpr version=21906
 *
 * [剑指 Offer 26] 树的子结构
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
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A==null || B==null){
            return false;
        }
        return isSub(A,B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private boolean isSub(TreeNode a, TreeNode b) {
        if(a==b || b==null){
            return true;
        }
        if(a==null){
            return false;
        }
        return a.val==b.val && isSub(a.left, b.left) && isSub(a.right, b.right);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3]\n[3,1]\n
// @lcpr case=end

// @lcpr case=start
// [3,4,5,1,2]\n[4,1]\n
// @lcpr case=end

 */

