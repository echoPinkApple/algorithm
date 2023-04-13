import static org.mockito.ArgumentMatchers.nullable;

/*
 * @lc app=leetcode.cn id=1080 lang=java
 * @lcpr version=21906
 *
 * [1080] 根到叶路径上的不足节点
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
    int sum=0;
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        if(root==null){
            return root;
        }
        if(root.left==null && root.right==null){
            if(limit>root.val){
                return null;
            }
            else{
                return root;
            }
        }
        root.left=sufficientSubset(root.left, limit-root.val);
        root.right=sufficientSubset(root.right, limit-root.val);
        if(root.left==null && root.right==null){
            return null;
        }
        return root;
    }

}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4,3,-99,7,8,9,-99,-99,12,13,-99,14]\n1\n
// @lcpr case=end

// @lcpr case=start
// [5,4,8,11,null,17,4,7,1,null,null,5,3]\n22\n
// @lcpr case=end

// @lcpr case=start
// [5,-6,-6]\n0\n
// @lcpr case=end

 */

