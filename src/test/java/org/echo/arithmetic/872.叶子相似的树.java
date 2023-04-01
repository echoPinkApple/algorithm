import static org.mockito.ArgumentMatchers.nullable;

import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=872 lang=java
 * @lcpr version=21901
 *
 * [872] 叶子相似的树
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaf1=new ArrayList<>();
        List<Integer> leaf2=new ArrayList<>();
        traverse(root1, leaf1);
        traverse(root2, leaf2);
        if(leaf1.size()!=leaf2.size()){
            return false;
        }
        for (int i = 0; i < leaf1.size(); i++) {
            if(!leaf1.get(i).equals(leaf2.get(i))){
                return false;
            }
        }
        return true;
    }

    public void traverse(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }
        traverse(root.left, list);
        if(root.left==null && root.right==null){
            list.add(root.val);
        }
        traverse(root.right, list);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,5,1,6,2,9,8,null,null,7,4]\n[3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3]\n[1,3,2]\n
// @lcpr case=end

 */


