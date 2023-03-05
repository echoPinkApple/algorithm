/*
 * @lc app=leetcode.cn id=234 lang=java
 * @lcpr version=21801
 *
 * [234] 回文链表
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
    public boolean isPalindrome(ListNode head) {
            if(head==null || head.next==null){
                return true;
            }
            ListNode  slow=head;
            ListNode fast=head;
            ListNode left=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            if(fast!=null){
                slow=slow.next;
            }
            ListNode right=reverse(slow);
            while(right!=null){
                if(right.val!=left.val){
                    return false;
                }
                left=left.next;
                right=right.next;
            }
            return true;
    }
// 反转链表
    private ListNode reverse(ListNode slow) {
        if(slow==null){
            return slow;
        }
        ListNode pre=null;
        ListNode cur=slow;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return pre;
    }
}
// @lc code=end

// @lcpr-div-debug-arg-start
// funName=
// paramTypes= []
// returnType=
// @lcpr-div-debug-arg-end


/*
// @lcpr case=start
// [1,2,2,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,2]\n
// @lcpr case=end

 */


