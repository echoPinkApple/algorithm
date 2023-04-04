import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=98 lang=java
 * @lcpr version=21901
 *
 * [98] 验证二叉搜索树
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
    List<Integer> list=new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        traverse(root);
        if(list.size()<2){
            return true;
        }
        int pre=list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int cur=list.get(i);
            if(pre>=cur){
                return false;
            }
            pre=cur;
        }
        return true;
    }
    private void traverse(TreeNode root) {
        if(root==null){
            return;
        }
        traverse(root.left);
        list.add(root.val);
        traverse(root.right);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,1,3]\n
// @lcpr case=end

// @lcpr case=start
// [5,1,4,null,null,3,6]\n
// @lcpr case=end

 */


