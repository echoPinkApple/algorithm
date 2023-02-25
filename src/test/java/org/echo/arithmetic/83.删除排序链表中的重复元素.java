/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
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
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=new ListNode(-1);
        temp.next=head;
        ListNode pre=head;
        ListNode next=head;
        while(next!=null){
            if(pre.val!=next.val){
                pre.next=next;
                pre=pre.next;
                next=next.next;
            }
            else{
                next=next.next;
            }
        }
        if(pre!=null){
            pre.next=null;
        }
        return temp.next;
    }
}
// @lc code=end

