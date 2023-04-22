import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.devtools.tunnel.client.TunnelClient;

/*
 * @lc app=leetcode.cn id=面试题 04.05 lang=java
 * @lcpr version=21906
 *
 * [面试题 04.05] 合法二叉搜索树
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<Integer> list=new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
        dfs(root);
        int size=list.size();
        if(size<=1){
            return true;
        }
        int pre=list.get(0);
        for (int i = 1; i < size; i++) {
            int cur=list.get(i);
            if(cur<=pre){
                return false;
            }
            pre=cur;
        }
        return true;
    }
    private void dfs(TreeNode root) {
        if(root==null){
            return;
        }
        dfs(root.left);
        list.add(root.val);
        dfs(root.right);
    }
}
// @lc code=end



