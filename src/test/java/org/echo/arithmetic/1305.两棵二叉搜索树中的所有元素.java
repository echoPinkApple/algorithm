import java.util.ArrayList;
import java.util.List;

import net.minidev.json.reader.ArrayWriter;

/*
 * @lc app=leetcode.cn id=1305 lang=java
 * @lcpr version=21906
 *
 * [1305] 两棵二叉搜索树中的所有元素
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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> res=new ArrayList<>();
        dfs(root1,res);
        dfs(root2,res);
        res.sort((a,b)->a-b);
        return res;
    }

    private void dfs(TreeNode root1, List<Integer> res) {
        if(root1==null){
            return;
        }
        dfs(root1.left, res);
        res.add(root1.val);
        dfs(root1.right, res);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,1,4]\n[1,0,3]\n
// @lcpr case=end

// @lcpr case=start
// [1,null,8]\n[8,1]\n
// @lcpr case=end

 */

