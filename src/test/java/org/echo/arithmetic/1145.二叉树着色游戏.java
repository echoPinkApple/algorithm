/*
 * @lc app=leetcode.cn id=1145 lang=java
 * @lcpr version=21906
 *
 * [1145] 二叉树着色游戏
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
    int lNode=0;
    int rNode=0;
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        dfs(root, x);
        int pNode=n-lNode-rNode-1;
        int tmp=n/2;
        if(pNode>tmp || lNode>tmp || rNode>tmp){
            return true;
        }
        return false;
    }
    int dfs(TreeNode node ,int k){
        if(node==null){
            return 0;
        }
        int l=dfs(node.left, k);
        int r=dfs(node.right, k);
        if(node.val==k){
            lNode=l;
            rNode=r;
        }
        return l+r+1;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4,5,6,7,8,9,10,11]\n11\n3\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3]\n3\n1\n
// @lcpr case=end

 */

