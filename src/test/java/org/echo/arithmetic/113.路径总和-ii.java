import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=113 lang=java
 * @lcpr version=21901
 *
 * [113] 路径总和 II
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        LinkedList<Integer> list=new LinkedList<>();
        traverse(root,targetSum,list);
        return res;
    }
    public void traverse(TreeNode root,int targetSum,LinkedList<Integer> list){
        if(root==null){
            return;
        }
        list.add(root.val);
        if(root.val==targetSum && root.left==null && root.right==null){
            res.add(new ArrayList<>(list));
        }
        traverse(root.left, targetSum-root.val, list);
        traverse(root.right, targetSum-root.val, list);
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


