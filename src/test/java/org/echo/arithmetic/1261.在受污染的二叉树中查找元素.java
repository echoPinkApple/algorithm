import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=1261 lang=java
 * @lcpr version=21906
 *
 * [1261] 在受污染的二叉树中查找元素
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
class FindElements {
    TreeNode root;
    Set<Integer> set=new HashSet<>();
    public FindElements(TreeNode root) {
        if(root==null){
            return;
        }
        this.root=root;
        root.val=0;
        set.add(root.val);
        dfs(root);
        
    }
    
    private void dfs(TreeNode node) {
        if(node==null){
            return;
        }
        if(node.left!=null){
            node.left.val=node.val*2+1;
            set.add(node.left.val);
            dfs(node.left);
        }
        if(node.right!=null){
            node.right.val=node.val*2+2;
            set.add(node.right.val);
            dfs(node.right);
        }

    }

    public boolean find(int target) {
        return set.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */
// @lc code=end



/*
// @lcpr case=start
// ["FindElements","find","find"][[[-1,null,-1]],[1],[2]]\n
// @lcpr case=end

// @lcpr case=start
// ["FindElements","find","find","find"][[[-1,-1,-1,-1,-1]],[1],[3],[5]]\n
// @lcpr case=end

// @lcpr case=start
// ["FindElements","find","find","find","find"][[[-1,null,-1,-1,null,-1]],[2],[3],[4],[5]]\n
// @lcpr case=end

 */

