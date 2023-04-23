import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=剑指 Offer 34 lang=java
 * @lcpr version=21906
 *
 * [剑指 Offer 34] 二叉树中和为某一值的路径
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
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if(root==null){
            return res;
        }
        LinkedList<Integer> list=new LinkedList<>();
        pathSum(root,list,target);
        return res;
    }
    private void pathSum(TreeNode root, LinkedList<Integer> list, int target) {
        if(root==null){
            return;
        }
        list.addLast(root.val);
        if((target-root.val)==0 && root.left==null && root.right==null){
            res.add(new ArrayList<>(list));
        }
        pathSum(root.left, list, target-root.val);
        pathSum(root.right, list, target-root.val);
        list.removeLast();
    }
}
// @lc code=end



/*
// @lcpr case=start
// [5,4,8,11,null,13,4,7,2,null,null,5,1]\n22\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3]\n5\n
// @lcpr case=end

// @lcpr case=start
// [1,2]\n0\n
// @lcpr case=end

 */

