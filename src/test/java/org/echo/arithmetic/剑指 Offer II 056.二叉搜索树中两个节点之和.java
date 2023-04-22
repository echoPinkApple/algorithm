import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=剑指 Offer II 056 lang=java
 * @lcpr version=21906
 *
 * [剑指 Offer II 056] 二叉搜索树中两个节点之和
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
    Set<Integer> set=new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        if(root==null){
            return false;
        }
        if(set.contains(k-root.val)){
            return true;
        }
        set.add(root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [8,6,10,5,7,9,11]\n12\n
// @lcpr case=end

// @lcpr case=start
// [8,6,10,5,7,9,11]\n22\n
// @lcpr case=end

 */

