import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=2196 lang=java
 * @lcpr version=21906
 *
 * [2196] 根据描述创建二叉树
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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer,TreeNode> nodes=new HashMap<>();
        Set<Integer> set=new HashSet<>();
        for (int[] des : descriptions) {
            int parent=des[0];
            int cur=des[1];
            int isLeft=des[2];
            if(!nodes.containsKey(parent))
                nodes.put(parent, new TreeNode(parent));
            if(!nodes.containsKey(cur))
                nodes.put(cur, new TreeNode(cur));
            if(isLeft==1){
                nodes.get(parent).left=nodes.get(cur);
            }
            else{
                nodes.get(parent).right=nodes.get(cur);
            }
            set.add(cur);
        }
        for (Integer key : nodes.keySet()) {
            if(!set.contains(key)){
                return nodes.get(key);
            }
        }
        return null;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[20,15,1],[20,17,0],[50,20,1],[50,80,0],[80,19,1]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,2,1],[2,3,0],[3,4,1]]\n
// @lcpr case=end

 */

