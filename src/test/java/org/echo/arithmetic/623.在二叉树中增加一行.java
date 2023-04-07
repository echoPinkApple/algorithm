import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=623 lang=java
 * @lcpr version=21901
 *
 * [623] 在二叉树中增加一行
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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode curRoot=new TreeNode(val);
            curRoot.left=root;
            return curRoot;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int curDepth=1;
        while(!queue.isEmpty()){
            int size=queue.size();
            if(curDepth==depth-1){
                for (int i = 0; i < size; i++) {
                    TreeNode cur=queue.poll();
                    TreeNode left=cur.left;
                    TreeNode curLeft=new TreeNode(val);
                    cur.left=curLeft;
                    curLeft.left=left;

                    TreeNode right=cur.right;
                    TreeNode curRight=new TreeNode(val);
                    cur.right=curRight;
                    curRight.right=right;
                }
                break;
            }
            else{
                for (int i = 0; i < size; i++) {
                    TreeNode cur=queue.poll();
                    if(cur.left!=null){
                        queue.offer(cur.left);
                    }
                    if(cur.right!=null){
                        queue.offer(cur.right);
                    }
                }
            }
            curDepth++;
        }
        return root;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,2,6,3,1,5]\n1\n1\n
// @lcpr case=end

// @lcpr case=start
// [4,2,null,3,1]\n1\n3\n
// @lcpr case=end

 */


