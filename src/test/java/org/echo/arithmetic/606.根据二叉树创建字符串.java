/*
 * @lc app=leetcode.cn id=606 lang=java
 * @lcpr version=21801
 *
 * [606] 根据二叉树创建字符串
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
    StringBuilder res=new StringBuilder();
    public String tree2str(TreeNode root) {
        if(root==null){
            return "";
        }
        if(root.left==null && root.right==null){
            return Integer.toString(root.val);
        }
        if(root.right==null){
            return new StringBuilder().append(root.val).append("(").append(tree2str(root.left)).append(")").toString();
        }
        if(root.left==null){
            StringBuilder builder = new StringBuilder();
            builder.append(root.val);
            builder.append("(").append(")(");
            builder.append(tree2str(root.right));
            builder.append(")");
            return builder.toString();
        }
        return new StringBuilder().append(root.val).append("(").append(tree2str(root.left)).append(")(").append(tree2str(root.right)).append(")").toString();
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
// [1]
// @lcpr case=end

// @lcpr case=start
// [1,2,3,null,4]
// @lcpr case=end

 */


