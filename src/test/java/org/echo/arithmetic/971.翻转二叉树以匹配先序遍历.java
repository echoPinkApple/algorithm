import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

/*
 * @lc app=leetcode.cn id=971 lang=java
 * @lcpr version=21901
 *
 * [971] 翻转二叉树以匹配先序遍历
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
    int index=0;
    boolean flag=true;
    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        dfs(root,voyage);
        if(flag){
            return list;
        }
        list.clear();
        list.add(-1);
        return list;
    }

    private void dfs(TreeNode root,int[] voyage) {
        if(root==null){
            return;
        }
        if(root.val!=voyage[index++]){
            flag=false;
            list.clear();
            return;
        }
        
        if(root.left!=null && root.left.val!=voyage[index]){
            list.add(root.val);
            dfs(root.right, voyage);
            dfs(root.left, voyage);
        }
        else {
            dfs(root.left, voyage);
            dfs(root.right, voyage);
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2]\n[2,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3]\n[1,3,2]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3]\n[1,2,3]\n
// @lcpr case=end

 */


