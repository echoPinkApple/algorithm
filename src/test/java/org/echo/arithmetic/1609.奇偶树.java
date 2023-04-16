import static org.mockito.ArgumentMatchers.nullable;

import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=1609 lang=java
 * @lcpr version=21906
 *
 * [1609] 奇偶树
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
    public boolean isEvenOddTree(TreeNode root) {
        if(root==null){
            return true;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int depth=0;
        int preVal=Integer.MIN_VALUE;
        while(!queue.isEmpty()){
            int size=queue.size();
            if((depth&1)==0){
                preVal=Integer.MIN_VALUE;
                for (int i = 0; i < size; i++) {
                    TreeNode curNode=queue.poll();
                    if(curNode.val<=preVal || (curNode.val&1)==0){
                        return false;
                    }
                    preVal=curNode.val;
                    if(curNode.left!=null){
                        queue.offer(curNode.left);
                    }
                    if(curNode.right!=null){
                        queue.offer(curNode.right);
                    }
                }
            }
            else{
                preVal=Integer.MAX_VALUE;
                for (int i = 0; i < size; i++) {
                    TreeNode curNode=queue.poll();
                    if(curNode.val>=preVal || (curNode.val&1)==1){
                        return false;
                    }
                    preVal=curNode.val;
                    if(curNode.left!=null){
                        queue.offer(curNode.left);
                    }
                    if(curNode.right!=null){
                        queue.offer(curNode.right);
                    }
                }
            }
            depth++;
        }
        return true;
    }


}
// @lc code=end



/*
// @lcpr case=start
// [1,10,4,3,null,7,9,12,8,6,null,null,2]\n
// @lcpr case=end

// @lcpr case=start
// [5,4,2,3,3,7]\n
// @lcpr case=end

// @lcpr case=start
// [5,9,1,3,5,7]\n
// @lcpr case=end

// @lcpr case=start
// [1]\n
// @lcpr case=end

// @lcpr case=start
// [11,8,6,1,3,9,11,30,20,18,16,12,10,4,2,17]\n
// @lcpr case=end

 */

