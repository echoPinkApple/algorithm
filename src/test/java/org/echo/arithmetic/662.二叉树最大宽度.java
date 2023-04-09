import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=662 lang=java
 * @lcpr version=21901
 *
 * [662] 二叉树最大宽度
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
    int max=Integer.MIN_VALUE;
    Map<Integer,Integer> map=new HashMap<>();
    public int widthOfBinaryTree(TreeNode root) {
        dfs(root,1,0);
        return max;
    }
    private void dfs(TreeNode root, int index, int depth) {
        if(root==null){
            return;
        }
        map.putIfAbsent(depth, index);
        max=Math.max(max, index-map.get(depth)+1);
        dfs(root.left, index*2, depth+1);
        dfs(root.right, index*2+1, depth+1);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,3,2,5,3,null,9]\n
// @lcpr case=end

// @lcpr case=start
// [1,3,2,5,null,null,9,6,null,7]\n
// @lcpr case=end

// @lcpr case=start
// [1,3,2,5]\n
// @lcpr case=end

 */


