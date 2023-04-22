import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=面试题 04.03 lang=java
 * @lcpr version=21906
 *
 * [面试题 04.03] 特定深度节点链表
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
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode[] listOfDepth(TreeNode tree) {
        List<ListNode> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(tree==null){
        return list.toArray(new ListNode[0]);
        }
        queue.offer(tree);
        while(!queue.isEmpty()){
            int size=queue.size();
            ListNode dummy=new ListNode(-1);
            ListNode next=dummy;
            for (int i = 0; i < size; i++) {
                TreeNode node=queue.poll();
                next.next=new ListNode(node.val);
                next=next.next;
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            list.add(dummy.next);
        }
        return list.toArray(new ListNode[0]);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4,5,null,7,8]1/  \ 2    3/ \    \ 4   5    7/8\n
// @lcpr case=end

 */

