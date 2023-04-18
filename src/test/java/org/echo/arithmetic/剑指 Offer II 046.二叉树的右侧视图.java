import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=剑指 Offer II 046 lang=java
 * @lcpr version=21906
 *
 * [剑指 Offer II 046] 二叉树的右侧视图
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
    int maxDepth=-1;
    List<Integer> res=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        dfs(root,0);
        return res;
    }
    private void dfs(TreeNode root, int depth) {
        if(root==null){
            return;
        }
        if(depth>maxDepth){
            maxDepth=depth;
            res.add(root.val);
        }
        dfs(root.right,depth+1);
        dfs(root.left,depth+1);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,null,5,null,4]\n
// @lcpr case=end

// @lcpr case=start
// [1,null,3]\n
// @lcpr case=end

// @lcpr case=start
// []\n
// @lcpr case=end

 */

