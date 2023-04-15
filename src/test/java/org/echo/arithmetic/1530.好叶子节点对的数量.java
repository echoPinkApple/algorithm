import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=1530 lang=java
 * @lcpr version=21906
 *
 * [1530] 好叶子节点对的数量
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
    int res=0;
    public int countPairs(TreeNode root, int distance) {
        dfs(root,distance);
        return res;
    }
    private List<Integer> dfs(TreeNode root, int distance) {
        List<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }

        if(root.left==null && root.right==null){
            list.add(1);
            return list;
        }
        List<Integer> l=dfs(root.left, distance);
        List<Integer> r=dfs(root.right, distance);
        for (Integer ll : l) {
            for (Integer rr : r) {
                if((ll+rr)<=distance){
                    res++;
                }
            }
        }

        for (Integer ll : l) {
            if(ll+1<=distance){
                list.add(ll+1);
            }
        }
        for (Integer rr : r) {
            if(rr+1<=distance){
                list.add(rr+1);
            }
        }
        return list;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,null,4]\n3\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4,5,6,7]\n3\n
// @lcpr case=end

// @lcpr case=start
// [7,1,4,6,null,5,3,null,null,null,null,null,2]\n3\n
// @lcpr case=end

// @lcpr case=start
// [100]\n1\n
// @lcpr case=end

// @lcpr case=start
// [1,1,1]\n2\n
// @lcpr case=end

 */

