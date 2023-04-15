import org.springframework.boot.devtools.tunnel.client.TunnelClient;

import net.bytebuddy.asm.Advice.Return;

/*
 * @lc app=leetcode.cn id=1373 lang=java
 * @lcpr version=21906
 *
 * [1373] 二叉搜索子树的最大键值和
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
    int max=0;
    public int maxSumBST(TreeNode root) {
        dfs(root);
        return max;
    }

    public int[] dfs(TreeNode root){
        if(root==null){
            return new int[]{1,Integer.MAX_VALUE,Integer.MIN_VALUE,0};
        }
        int[] l=dfs(root.left);
        int[] r=dfs(root.right);
        int[] res=new int[4];
        if(l[0]==1 && r[0]==1 && root.val>l[2] && root.val<r[1]){
            res[0]=1;
            res[1]=Math.min(l[1], root.val);
            res[2]=Math.max(r[2], root.val);
            res[3]=root.val+l[3]+r[3];
            max=Math.max(res[3], max);
            return res;
        }
        else{
            res[0]=0;
            return res;
        }
    }

}
// @lc code=end



/*
// @lcpr case=start
// [1,4,3,2,4,2,5,null,null,null,null,null,null,4,6]\n
// @lcpr case=end

// @lcpr case=start
// [4,3,null,1,2]\n
// @lcpr case=end

// @lcpr case=start
// [-4,-2,-5]\n
// @lcpr case=end

// @lcpr case=start
// [2,1,3]\n
// @lcpr case=end

// @lcpr case=start
// [5,4,8,3,null,6,3]\n
// @lcpr case=end

 */

