/*
 * @lc app=leetcode.cn id=109 lang=java
 * @lcpr version=21901
 *
 * [109] 有序链表转换二叉搜索树
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
    public TreeNode sortedListToBST(ListNode head) {
        return buildTree(head,null);
    }

    private TreeNode buildTree(ListNode head, ListNode  tail) {
        if(head==tail){
            return null;
        }
        ListNode medium = getMedium(head, tail);
        TreeNode root=new TreeNode(medium.val);
        root.left=buildTree(head, medium);
        root.right=buildTree(medium.next, tail);
        return root;
    }

    private ListNode getMedium(ListNode head,ListNode tail){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=tail && fast.next!=tail){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [-10,-3,0,5,9]\n
// @lcpr case=end

// @lcpr case=start
// []\n
// @lcpr case=end

 */


