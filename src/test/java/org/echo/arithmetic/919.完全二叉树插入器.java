import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=919 lang=java
 * @lcpr version=21901
 *
 * [919] 完全二叉树插入器
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
class CBTInserter {

    Queue<TreeNode> queue=new LinkedList<>();
    TreeNode root=null;
    public CBTInserter(TreeNode root) {
        this.root=root;
        TreeNode node=root;
        Queue<TreeNode> tmpQueue=new LinkedList<>();
        tmpQueue.offer(node);
        while(!tmpQueue.isEmpty()){
            int size=tmpQueue.size();
            for (int i = 0; i < size; i++) {
                TreeNode tmpNode=tmpQueue.poll();
                queue.offer(tmpNode);
                if(tmpNode.left!=null){
                    tmpQueue.offer(tmpNode.left);
                }
                if(tmpNode.right!=null){
                    tmpQueue.offer(tmpNode.right);
                }
            }
        }
    }
    
    public int insert(int val) {
        TreeNode peek=queue.peek();
        while(peek.left!=null && peek.right!=null){
            queue.poll();
            peek=queue.peek();
        }
        if(peek.left==null){
            peek.left=new TreeNode(val);
            queue.offer(peek.left);
            return peek.val;
        }
        if(peek.right==null){
            peek.right=new TreeNode(val);
            queue.offer(peek.right);
            return peek.val;
        }
        return peek.val;
    }
    
    public TreeNode get_root() {
        return root;
    }
}

/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(val);
 * TreeNode param_2 = obj.get_root();
 */
// @lc code=end




