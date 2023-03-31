import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=589 lang=java
 * @lcpr version=21901
 *
 * [589] N 叉树的前序遍历
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> res=new ArrayList<>();
    public List<Integer> preorder(Node root) {
        traverse(root);
        return res;
    }
    public void traverse(Node root){
        if(root==null){
            return;
        }
        res.add(root.val);
        for(Node node : root.children){
            traverse(node);
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,null,3,2,4,null,5,6]\n
// @lcpr case=end

// @lcpr case=start
// [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]\n
// @lcpr case=end

 */


