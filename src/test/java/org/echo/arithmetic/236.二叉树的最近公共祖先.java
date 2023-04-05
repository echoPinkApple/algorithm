import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=236 lang=java
 * @lcpr version=21901
 *
 * [236] 二叉树的最近公共祖先
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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        LinkedList<TreeNode> pathP=new LinkedList<>();
        LinkedList<TreeNode> pathQ=new LinkedList<>();
        getPath(root,p,pathP);
        getPath(root, q, pathQ);

        for(int i=0;i < pathP.size();i++){
            System.out.print(pathP.get(i).val);
            System.out.print(" ");
        }
        System.out.println();
        for(int i=0;i < pathQ.size();i++){
            System.out.print(pathQ.get(i).val);
            System.out.print(" ");
        }
        System.out.println();
        TreeNode res=root;
        for (int i = 0; i < pathP.size() && i<pathQ.size(); i++) {
            if(pathP.get(i)==pathQ.get(i)){
                res=pathP.get(i);
            }
            else{
                break;
            }
        }
        return res;
    }

    private void getPath(TreeNode root, TreeNode p,LinkedList<TreeNode> path) {
        if(root==null){
            return;
        }
        path.add(root);
        if(root==p){
            return;
        }
        getPath(root.left, p, path);
        if(path.getLast()==p){
            return;
        }
        getPath(root.right, p, path);
        if(path.getLast()==p){
            return;
        }
        path.removeLast();

    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,5,1,6,2,0,8,null,null,7,4]\n5\n1\n
// @lcpr case=end

// @lcpr case=start
// [3,5,1,6,2,0,8,null,null,7,4]\n5\n4\n
// @lcpr case=end

// @lcpr case=start
// [1,2]\n1\n2\n
// @lcpr case=end

 */


