/*
 * @lc app=leetcode.cn id=1028 lang=java
 * @lcpr version=21906
 *
 * [1028] 从先序遍历还原二叉树
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
class Solution{
    //全局的，记录访问到字符串S的位置
    int index = 0;

    public TreeNode recoverFromPreorder(String S) {
        return helper(S, 0);
    }

    public TreeNode helper(String s, int depth) {
        int level = 0;
        //获取数字在树的第几层
        while (index + level < s.length() && s.charAt(index + level) == '-') {
            level++;
        }
        //如果遍历的深度和获取到的深度不一致，返回空
        if (level != depth)
            return null;
        int next = index + level;

        //获取数字
        while (next < s.length() && s.charAt(next) != '-')
            next++;
        int val = Integer.parseInt(s.substring(index + level, next));

        index = next;
        //创建结点
        TreeNode root = new TreeNode(val);
        root.left = helper(s, depth + 1);
        if (root.left == null) {//如果左子节点是空，那么右子节点肯定也是空的
            root.right = null;
        } else {
            root.right = helper(s, depth + 1);
        }
        return root;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "1-2--3--4-5--6--7"\n
// @lcpr case=end

// @lcpr case=start
// "1-2--3---4-5--6---7"\n
// @lcpr case=end

// @lcpr case=start
// "1-401--349---90--88"\n
// @lcpr case=end

 */

