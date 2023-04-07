import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.Track;

/*
 * @lc app=leetcode.cn id=530 lang=java
 * @lcpr version=21901
 *
 * [530] 二叉搜索树的最小绝对差
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
    List<Integer> res=new ArrayList<>();
    int min=Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        traverse(root);
        res.sort((a,b)->a-b);
        for (int i = 1; i < res.size(); i++) {
            int diff=Math.abs(res.get(i)-res.get(i-1));
            if(diff==0){
                return diff;
            }
            min=Math.min(min, diff);
        }
        return min;
    }
    private void traverse(TreeNode root) {
        if(root==null){
            return;
        }
        res.add(root.val);
        traverse(root.left);
        traverse(root.right);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,2,6,1,3]\n
// @lcpr case=end

// @lcpr case=start
// [1,0,48,null,null,12,49]\n
// @lcpr case=end

 */


