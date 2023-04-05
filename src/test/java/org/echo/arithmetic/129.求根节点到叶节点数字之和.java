import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=129 lang=java
 * @lcpr version=21901
 *
 * [129] 求根节点到叶节点数字之和
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
    LinkedList<Integer> route=new LinkedList<>();
    int res=0;
    public int sumNumbers(TreeNode root) {
        traverse(root);
        return res;
    }
    private void traverse(TreeNode root) {
        if(root==null){
            return;
        }
        route.addLast(root.val);
        if(root.left==null && root.right==null){
            int sum=0;
            for (int i = 0; i < route.size(); i++) {
                sum=sum*10+route.get(i);
            }
            res+=sum;
        }
        traverse(root.left);
        traverse(root.right);
        route.removeLast();
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3]\n
// @lcpr case=end

// @lcpr case=start
// [4,9,0,5,1]\n
// @lcpr case=end

 */


