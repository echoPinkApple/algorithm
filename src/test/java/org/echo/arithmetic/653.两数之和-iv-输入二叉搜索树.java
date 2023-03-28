import java.util.ArrayList;
import java.util.List;

import ch.qos.logback.core.joran.conditional.ElseAction;


/*
 * @lc app=leetcode.cn id=653 lang=java
 * @lcpr version=21901
 *
 * [653] 两数之和 IV - 输入二叉搜索树
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
    List<Integer> list=new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        inorderTraverse(root);
        int left=0;
        int right=list.size()-1;
        while(left<right){
            int midVal=list.get(left)+list.get(right);
            if(midVal==k){
                return true;
            }
            else if(midVal<k){
                left++;
            }
            else if(midVal>k){
                right--;
            }
        }
        return false;
    }
    public void inorderTraverse(TreeNode rNode){
        if(rNode==null){
            return;
        }
        inorderTraverse(rNode.left);
        list.add(rNode.val);
        inorderTraverse(rNode.right);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [5,3,6,2,4,null,7]\n9\n
// @lcpr case=end

// @lcpr case=start
// [5,3,6,2,4,null,7]\n28\n
// @lcpr case=end

 */


