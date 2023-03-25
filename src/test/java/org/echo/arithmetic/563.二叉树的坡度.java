/*
 * @lc app=leetcode.cn id=563 lang=java
 * @lcpr version=21801
 *
 * [563] 二叉树的坡度
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
    int res=0;
    public int findTilt(TreeNode root) {
        traverse(root);
        return res;
    }

    public int traverse(TreeNode rNode){
        if(rNode==null){
            return 0;
        }
        int left=traverse(rNode.left);
        int right=traverse(rNode.right);
        res+=Math.abs(left-right);
        return left+right+rNode.val;
    }
}
// @lc code=end

// @lcpr-div-debug-arg-start
// funName=
// paramTypes= []
// returnType=
// @lcpr-div-debug-arg-end


/*
// @lcpr case=start
// [1,2,3]
// @lcpr case=end

// @lcpr case=start
// [4,2,9,3,5,null,7]
// @lcpr case=end

// @lcpr case=start
// [21,7,14,1,1,2,2,3,3]
// @lcpr case=end

 */


