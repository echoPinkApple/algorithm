import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=剑指 Offer II 055 lang=java
 * @lcpr version=21906
 *
 * [剑指 Offer II 055] 二叉搜索树迭代器
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
class BSTIterator {
    List<Integer> list=new ArrayList<>();
    int index=-1;
    public BSTIterator(TreeNode root) {
        dfs(root);
    }
    
    private void dfs(TreeNode root) {
        if(root==null){
            return;
        }
        dfs(root.left);
        list.add(root.val);
        dfs(root.right);
    }

    public int next() {
        index++;
        if(index<list.size()){
            return list.get(index);
        }
        return 0;
    }
    
    public boolean hasNext() {
        return index<list.size()-1;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
// @lc code=end



