import static org.mockito.ArgumentMatchers.nullable;

/*
 * @lc app=leetcode.cn id=889 lang=java
 * @lcpr version=21901
 *
 * [889] 根据前序和后序遍历构造二叉树
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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return constructFromPrePost(preorder,0,postorder.length-1, postorder,0,postorder.length-1);
    }

    private TreeNode constructFromPrePost(int[] preorder, int preStart, int preEnd, int[] postorder, int postStart, int postEnd) {
        if(preStart>preEnd){
            return null;
        }
        TreeNode root=new TreeNode(preorder[preStart]);
        if(preStart==preEnd){
            return root;
        }
        int leftSize=0;
        for (int i = postStart; i <= postEnd; i++) {
            if(postorder[i]==preorder[preStart+1]){
                leftSize=i-postStart;
                break;
            }
        }
        root.left=constructFromPrePost(preorder, preStart+1, preStart+leftSize+1, postorder, postStart, postStart+leftSize);
        root.right=constructFromPrePost(preorder, preStart+leftSize+2, preEnd, postorder, postStart+leftSize+1, postEnd-1);
        return root;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,4,5,3,6,7]\n[4,5,2,6,7,3,1]\n
// @lcpr case=end

// @lcpr case=start
// [1]\n[1]\n
// @lcpr case=end

 */


