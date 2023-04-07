import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=508 lang=java
 * @lcpr version=21901
 *
 * [508] 出现次数最多的子树元素和
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
    Map<Integer,Integer> map=new HashMap<>();
    int maxCount=Integer.MIN_VALUE;
    public int[] findFrequentTreeSum(TreeNode root) {
        traverse(root);
        List<Integer> res=new ArrayList<>();
        for (Integer keySet : map.keySet()) {
            Integer count = map.get(keySet);
            if(count>maxCount){
                maxCount=count;
                res.clear();
                res.add(keySet);
            }
            else if(count==maxCount){
                res.add(keySet);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    private int traverse(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftSum=traverse(root.left);
        int rightSum=traverse(root.right);
        int sum=root.val+leftSum+rightSum;
        map.put(sum, map.getOrDefault(sum, 0)+1);
        return sum;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [5,2,-3]\n
// @lcpr case=end

// @lcpr case=start
// [5,2,-5]\n
// @lcpr case=end

 */


