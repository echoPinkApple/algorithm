import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=1110 lang=java
 * @lcpr version=21906
 *
 * [1110] 删点成林
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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Set<Integer> set=new HashSet<>();
        for (int num : to_delete) {
            set.add(num);
        }
        res.add(root);
        delNodes(null,root,res, set);
        return res;
    }

    private void delNodes(TreeNode pre, TreeNode root, List<TreeNode> res, Set<Integer> set) {
        if(root==null){
            return;
        }
        delNodes(root, root.left, res, set);
        delNodes(root, root.right, res, set);
        if(set.contains(root.val)){
            if(root.left!=null){
                res.add(root.left);
            }
            if(root.right!=null){
                res.add(root.right);
            }
            if(res.contains(root)){
                res.remove(root);
            }
            if(pre!=null && pre.left==root){
                pre.left=null;
            }
            else if(pre!=null && pre.right==root){
                pre.right=null;
            }
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4,5,6,7]\n[3,5]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,4,null,3]\n[3]\n
// @lcpr case=end

 */

