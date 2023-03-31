import java.util.List;

/*
 * @lc app=leetcode.cn id=559 lang=java
 * @lcpr version=21901
 *
 * [559] N 叉树的最大深度
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
    public int maxDepth(Node root) {
        return traverse(root);
    }
    private int traverse(Node root) {
        if(root==null){
            return 0;
        }
        List<Node> children = root.children;
        int maxChildrenDepth=0;
        for (Node child : children) {
            maxChildrenDepth=Math.max(maxChildrenDepth, traverse(child));
        }
        return maxChildrenDepth+1;
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


