import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=剑指 Offer II 043 lang=java
 * @lcpr version=21906
 *
 * [剑指 Offer II 043] 往完全二叉树添加节点
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
    TreeNode dummy;
    public CBTInserter(TreeNode root) {
        dummy=root;
        init(root);
    }
    
    private void init(TreeNode root) {
        if(root==null){
            return;
        }
        Queue<TreeNode> tmpQueue=new LinkedList<>();
        tmpQueue.offer(root);
        while(!tmpQueue.isEmpty()){
            int size=tmpQueue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node=tmpQueue.poll();
                if(node.left==null || node.right==null){
                    queue.offer(node);
                }
                if(node.left!=null){
                    tmpQueue.offer(node.left);
                }
                if(node.right!=null){
                    tmpQueue.offer(node.right);
                }
            }
        }
    }

    public int insert(int v) {
        while(queue.peek().left!=null && queue.peek().right!=null){
            queue.poll();
        }
        TreeNode node=queue.peek();
        if(node.left==null){
            node.left=new TreeNode(v);
            queue.offer(node.left);
        }
        else if(node.right==null){
            node.right=new TreeNode(v);
            queue.offer(node.right);
        }
        return node.val;
    }
    
    public TreeNode get_root() {
        return dummy;
    }
}

/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(v);
 * TreeNode param_2 = obj.get_root();
 */
// @lc code=end



/*
// @lcpr case=start
// ["CBTInserter","insert","get_root"]\n[[[1]],[2],[]]\n
// @lcpr case=end

// @lcpr case=start
// ["CBTInserter","insert","insert","get_root"]\n[[[1,2,3,4,5,6]],[7],[8],[]]\n
// @lcpr case=end

 */

