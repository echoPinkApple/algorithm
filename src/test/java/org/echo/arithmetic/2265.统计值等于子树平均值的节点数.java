/*
 * @lc app=leetcode.cn id=2265 lang=java
 * @lcpr version=21906
 *
 * [2265] 统计值等于子树平均值的节点数
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
    int count=0;
    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return count;
    }
    public int[] dfs(TreeNode root){
        if(root==null){
            return new int[]{0,0};
        }
        int[] left=dfs(root.left);
        int[] right=dfs(root.right);
        int[] res=new int[2];
        res[0]=left[0]+right[0]+1;
        res[1]=left[1]+right[1]+root.val;
        if(root.val==(res[1]/res[0])){
            count++;
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,8,5,0,1,null,6]\n
// @lcpr case=end

// @lcpr case=start
// [1]\n
// @lcpr case=end

 */

