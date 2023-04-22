import static org.mockito.Mockito.inOrder;

/*
 * @lc app=leetcode.cn id=剑指 Offer 07 lang=java
 * @lcpr version=21906
 *
 * [剑指 Offer 07] 重建二叉树
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

    private TreeNode build(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if(preStart>preEnd){
            return null;
        }
        TreeNode root=new TreeNode(preorder[preStart]);
        if(preStart==preEnd){
            return root;
        }
        int index=inStart;
        for (int i = inStart; i <= inEnd; i++) {
            if(inorder[i]==preorder[preStart]){
                index=i;
                break;
            }
        }
        int length=index-inStart;
        root.left=build(preorder, preStart+1, preStart+length, inorder, inStart, index-1);
        root.right=build(preorder, preStart+length+1, preEnd, inorder, index+1, inEnd);
        return root;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,9,20,15,7]\n[9,3,15,20,7]\n
// @lcpr case=end

// @lcpr case=start
// [1,2]\n[2,1]\n
// @lcpr case=end

 */

