import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=1382 lang=java
 * @lcpr version=21906
 *
 * [1382] 将二叉搜索树变平衡
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
    List<Integer> inorder=new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return build(0,inorder.size()-1);
    }
    private TreeNode build(int left,int right) {
        if(left>right){
            return null;
        }
        int mid=(left+right)>>1;
        TreeNode root=new TreeNode(inorder.get(mid));
        root.left=build(left, mid-1);
        root.right=build(mid+1, right);
        return root;
    }
    private void inorder(TreeNode root) {
        if(root==null){
            return;
        }
        inorder(root.left);
        inorder.add(root.val);
        inorder(root.right);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,null,2,null,3,null,4,null,null]\n
// @lcpr case=end

// @lcpr case=start
// [2,1,3]\n
// @lcpr case=end

 */

