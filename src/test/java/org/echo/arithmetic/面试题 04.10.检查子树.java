/*
 * @lc app=leetcode.cn id=面试题 04.10 lang=java
 * @lcpr version=21906
 *
 * [面试题 04.10] 检查子树
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
    public boolean checkSubTree(TreeNode t1, TreeNode t2) {
        if(t1==null){
            return false;
        }
        if(t2==null){
            return true;
        }
        return check(t1, t2) || checkSubTree(t1.left, t2) || checkSubTree(t1.right, t2);
        
    }
    public boolean check(TreeNode t1,TreeNode t2){
        if(t1==t2){
            return true;
        }
        if(t1==null || t2==null){
            return false;
        }
        return t1.val==t2.val && check(t1.left, t2.left)&& check(t1.right, t2.right);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1, 2, 3]\n[2]\n
// @lcpr case=end

// @lcpr case=start
// [1, null, 2, 4]\n[3, 2]\n
// @lcpr case=end

 */

