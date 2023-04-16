import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=2415 lang=java
 * @lcpr version=21906
 *
 * [2415] 反转二叉树的奇数层
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
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root==null){
            return root;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int depth=0;
        List<TreeNode> list=new ArrayList<>();
        while(!queue.isEmpty()){
            int size=queue.size();
            list.clear();
            for (int i = 0; i < size; i++) {
                TreeNode node=queue.poll();
                list.add(node);
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            if((depth&1)==1){
                int right=list.size()-1;
                int left=0;
                while(left<right){
                    TreeNode lnode=list.get(left);
                    TreeNode rnode=list.get(right);
                    int tmp=lnode.val;
                    lnode.val=rnode.val;
                    rnode.val=tmp;
                    left++;
                    right--;
                }
            }
            depth++;
        }
        return root;
    }

}
// @lc code=end



/*
// @lcpr case=start
// [2,3,5,8,13,21,34]\n
// @lcpr case=end

// @lcpr case=start
// [7,13,11]\n
// @lcpr case=end

// @lcpr case=start
// [0,1,2,0,0,0,0,1,1,1,1,2,2,2,2]\n
// @lcpr case=end

 */

