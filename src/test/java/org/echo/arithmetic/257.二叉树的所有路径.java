import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=257 lang=java
 * @lcpr version=21801
 *
 * [257] 二叉树的所有路径
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
    List<String> res=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        buildRoute(root, new ArrayList<TreeNode>());
        return res;
    }
    public void buildRoute(TreeNode root,List<TreeNode> list ){
        if(root==null){
            return;
        }
        list.add(root);
        if(root.left==null && root.right==null){
            StringBuilder builder=new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                builder.append(list.get(i).val);
                if(i!=list.size()-1){
                    builder.append("->");
                }
            }
           res.add(builder.toString());
        }
        buildRoute(root.left, list);
        buildRoute(root.right, list);
        list.remove(root);
    }
}
// @lc code=end

// @lcpr-div-debug-arg-start
// funName=
// paramTypes= []
// returnType=
// @lcpr-div-debug-arg-end


/*
// @lcpr case=start
// [1,2,3,null,5]\n
// @lcpr case=end

// @lcpr case=start
// [1]\n
// @lcpr case=end

 */


