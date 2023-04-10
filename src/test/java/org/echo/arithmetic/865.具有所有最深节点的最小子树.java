import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=865 lang=java
 * @lcpr version=21901
 *
 * [865] 具有所有最深节点的最小子树
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
    Map<Integer,TreeNode> parents=new HashMap<>();
    List<TreeNode> nodes=new ArrayList<>();
    int maxDepth=Integer.MIN_VALUE;
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        findParents(root,0);
        while(nodes.size()>1){
            Set<TreeNode> set=new HashSet<>();
            for (TreeNode node : nodes) {
                set.add(parents.get(node.val));
            }
            nodes.clear();
            nodes.addAll(set);
        }
        return nodes.get(0);

    }
    private void findParents(TreeNode root,int depth) {
        if(depth>maxDepth){
            maxDepth=depth;
            nodes.clear(); 
            nodes.add(root);
        }
        else if(depth==maxDepth){
            nodes.add(root);
        }
        if(root.left!=null){
            parents.put(root.left.val, root);
            findParents(root.left, depth+1);
        }
        if(root.right!=null){
            parents.put(root.right.val, root);
            findParents(root.right, depth+1);
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,5,1,6,2,0,8,null,null,7,4]\n
// @lcpr case=end

// @lcpr case=start
// [1]\n
// @lcpr case=end

// @lcpr case=start
// [0,1,3,null,2]\n
// @lcpr case=end

 */


