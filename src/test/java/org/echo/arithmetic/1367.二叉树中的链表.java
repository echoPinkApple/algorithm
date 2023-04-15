/*
 * @lc app=leetcode.cn id=1367 lang=java
 * @lcpr version=21906
 *
 * [1367] 二叉树中的链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    ListNode dummy;
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(head==null){
            return true;
        }
        if(root==null){
            return false;
        }
        return isSub(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }
    public boolean isSub(ListNode head,TreeNode root){
        if(head==null){
            return true;
        }
        if(root==null){
            return false;
        }
        if(root.val!=head.val){
            return false;
        }
        return isSub(head.next, root.left) || isSub(head.next, root.right);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,2,8]\n[1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]\n
// @lcpr case=end

// @lcpr case=start
// [1,10]\n[1,null,1,10,1,9]\n
// @lcpr case=end

// @lcpr case=start
// [10,6,6,5,5,9]\n[7,9,10,7,6,6,3,null,4,10,2,6,8,1,9,null,null,5,null,10,6,5,6,5,3,4,2,null,null,3,9,null,null,6,null,6,4,5,6,8,null,4,null,null,3,null,7,10,9,null,10,null,null,1,10,null,9,null,10,null,10,null,null,7,6,null,null,null,6,null,null,null,null,null,null,null,null,7,null,3,null,null,null,1,null,5,null,null,null,null,null,null,null,1]\n
// @lcpr case=end

 */

