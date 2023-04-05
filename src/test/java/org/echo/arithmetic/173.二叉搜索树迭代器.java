import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;


/*
 * @lc app=leetcode.cn id=173 lang=java
 * @lcpr version=21901
 *
 * [173] 二叉搜索树迭代器
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
    int point=-1;
    public BSTIterator(TreeNode root) {
        Deque<TreeNode> stack=new LinkedList<>();
        TreeNode node=root;
        while(!stack.isEmpty() || node!=null){
            while(node!=null){
                stack.push(node);
                node=node.left;
            }
            node=stack.pop();
            list.add(node.val);
            node=node.right;
        }
    }
    
    public int next() {
        return list.get(++point);
    }
    
    public boolean hasNext() {
        return (point+1)>=list.size()?false:true;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
// @lc code=end




