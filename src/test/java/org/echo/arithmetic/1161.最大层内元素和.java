import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=1161 lang=java
 * @lcpr version=21906
 *
 * [1161] 最大层内元素和
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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int depth=0;
        int maxSum=Integer.MIN_VALUE;
        int res=1;
        while(!queue.isEmpty()){
            int size=queue.size();
            int tmpSum=0;
            depth++;
            for (int i = 0; i < size; i++) {
                TreeNode node=queue.poll();
                tmpSum+=node.val;
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            if(tmpSum>maxSum){
                res=depth;
                maxSum=tmpSum;
            }
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,7,0,7,-8,null,null]\n
// @lcpr case=end

// @lcpr case=start
// [989,null,10250,98693,-89388,null,null,null,-32127]\n
// @lcpr case=end

 */

