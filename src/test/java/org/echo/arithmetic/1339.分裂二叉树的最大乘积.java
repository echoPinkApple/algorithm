import java.util.ArrayList;
import java.util.List;

import com.jayway.jsonpath.internal.filter.ValueNodes.ValueListNode;

/*
 * @lc app=leetcode.cn id=1339 lang=java
 * @lcpr version=21906
 *
 * [1339] 分裂二叉树的最大乘积
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
    long sum=0;
    int mod=1000000007;
    long half=0;
    public int maxProduct(TreeNode root) {
        sum(root);
        dfs(root);
        return (int) (((half)*(sum-half))%mod);
    }
    private void sum(TreeNode root) {
        if(root==null){
            return;
        }
        sum+=root.val;
        sum(root.left);
        sum(root.right);
    }
    private long dfs(TreeNode root) {
        if(root==null){
            return 0;
        }
        long val=dfs(root.left)+dfs(root.right)+root.val;
        if(Math.abs(val*2-sum)<Math.abs(half*2-sum)){
            half=val;
        }
        return val;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4,5,6]\n
// @lcpr case=end

// @lcpr case=start
// [1,null,2,3,4,null,null,5,6]\n
// @lcpr case=end

// @lcpr case=start
// [2,3,9,10,7,8,6,5,4,11,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,1]\n
// @lcpr case=end

 */

