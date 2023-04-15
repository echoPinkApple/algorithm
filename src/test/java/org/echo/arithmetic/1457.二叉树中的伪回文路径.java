import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=1457 lang=java
 * @lcpr version=21906
 *
 * [1457] 二叉树中的伪回文路径
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
    public int pseudoPalindromicPaths (TreeNode root) {
        dfs(root,0);
        return res;
    }
    private void dfs(TreeNode root,int count) {
        if(root==null){
            return;
        }
        count^=(1<<root.val);
        if (root.left == null && root.right == null) {
            if(count==0|| (count&(count-1))==0){
                res++;
            }
        }
        dfs(root.left,count);
        dfs(root.right,count);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [8,8,null,7,7,null,null,2,4,null,8,null,7,null,1]\n
// @lcpr case=end

// @lcpr case=start
// [2,1,1,1,3,null,null,null,null,null,1]\n
// @lcpr case=end

// @lcpr case=start
// [9]\n
// @lcpr case=end

 */

