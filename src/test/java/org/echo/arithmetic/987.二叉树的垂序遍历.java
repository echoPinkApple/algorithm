import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import ch.qos.logback.core.joran.conditional.ElseAction;

/*
 * @lc app=leetcode.cn id=987 lang=java
 * @lcpr version=21901
 *
 * [987] 二叉树的垂序遍历
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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<int[]> nodes=new ArrayList<int[]>();
        dfs(root,0,0,nodes);
        Collections.sort(nodes,new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]!=o2[0]){
                    return o1[0]-o2[0];
                }
                else if(o1[1]!=o2[1]){
                    return o1[1]-o2[1];
                }
                else{
                    return o1[2]-o2[2];
                }
            }
        });
        List<List<Integer>> res=new ArrayList<>();
        int size=0;
        int preCol=Integer.MIN_VALUE;
        for (int[] node : nodes) {
            int col=node[0];
            int row=node[1];
            int val=node[2];
            if(col!=preCol){
                preCol=col;
                size++;
                res.add(new ArrayList<Integer>());
            }
            res.get(size-1).add(val);

        }
        return res;
    }

    private void dfs(TreeNode root, int row, int col, List<int[]> nodes) {
        if(root==null){
            return;
        }
        nodes.add(new int[]{col,row,root.val});
        dfs(root.left, row+1, col-1, nodes);
        dfs(root.right, row+1, col+1, nodes);
    }

    
}
// @lc code=end



/*
// @lcpr case=start
// [3,9,20,null,null,15,7]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4,5,6,7]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4,6,5,7]\n
// @lcpr case=end

 */


