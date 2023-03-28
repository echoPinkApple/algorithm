import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * @lc app=leetcode.cn id=671 lang=java
 * @lcpr version=21901
 *
 * [671] 二叉树中第二小的节点
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
    public int findSecondMinimumValue(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        traverse(root,list);
        List<Integer> collect = list.stream().distinct().sorted().collect(Collectors.toList());
        return collect.size()>=2? collect.get(1):-1;
    }
    public void traverse(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }
        list.add(root.val);
        traverse(root.left, list);
        traverse(root.right, list);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,2,5,null,null,5,7]\n
// @lcpr case=end

// @lcpr case=start
// [2,2,2]\n
// @lcpr case=end

 */


