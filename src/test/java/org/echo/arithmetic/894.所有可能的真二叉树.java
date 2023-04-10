import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=894 lang=java
 * @lcpr version=21901
 *
 * [894] 所有可能的真二叉树
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
    Map<Integer,List<TreeNode>> map=new HashMap<>();
    public List<TreeNode> allPossibleFBT(int n) {
        if(!map.containsKey(n)){
            List<TreeNode> list=new ArrayList<>();
            if(n==1){
                list.add(new TreeNode(0));
            }
            else if((n&1)==1){
                for (int x = 0; x < n; x++) {
                    int y=n-1-x;
                    for (TreeNode left : allPossibleFBT(x)) {
                        for (TreeNode right : allPossibleFBT(y)) {
                            TreeNode root=new TreeNode(0);
                            root.left=left;
                            root.right=right;
                            list.add(root);
                        }
                    }
                }
            }
            map.put(n, list);
        }
        return map.get(n);
    }
}
// @lc code=end



/*
// @lcpr case=start
// 7\n
// @lcpr case=end

// @lcpr case=start
// 3\n
// @lcpr case=end

 */


