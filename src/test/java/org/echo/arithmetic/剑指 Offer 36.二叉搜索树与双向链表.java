import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=剑指 Offer 36 lang=java
 * @lcpr version=21906
 *
 * [剑指 Offer 36] 二叉搜索树与双向链表
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/
class Solution {
    public Node treeToDoublyList(Node root) {
        if(root==null){
            return null;
        }
        Node head=new Node(-1);
        Node pre=head;
        Deque<Node> stack=new LinkedList<>();
        while(root!=null || !stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            Node tmp=stack.pop();
            if(tmp!=null){
                pre.right=tmp;
                tmp.left=pre;
                pre=tmp;
            }
            root=tmp.right;
        }
        Node last=pre;
        Node first=head.right;
        first.left=last;
        last.right=first;
        return first;
    }
}
// @lc code=end



