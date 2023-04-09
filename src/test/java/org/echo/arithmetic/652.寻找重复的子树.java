import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=652 lang=java
 * @lcpr version=21901
 *
 * [652] 寻找重复的子树
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
    Map<String,TreeNode> seen=new HashMap<>();
    Set<TreeNode> res=new HashSet<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);
        return new ArrayList<>(res);
    }
    private String dfs(TreeNode root) {
        if(root==null){
            return "";
        }
        StringBuilder builder = new StringBuilder();
        builder.append(root.val);
        builder.append("(");
        builder.append(dfs(root.left));
        builder.append(")(");
        builder.append(dfs(root.right));
        builder.append(")");
        String string = builder.toString();
        if(seen.containsKey(string)){
            res.add(seen.get(string));
        }
        else{
            seen.put(string, root);
        }
        return string;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4,null,2,4,null,null,4]\n
// @lcpr case=end

// @lcpr case=start
// [2,1,1]\n
// @lcpr case=end

// @lcpr case=start
// [2,2,2,3,null,3,null]\n
// @lcpr case=end

 */


