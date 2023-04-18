/*
 * @lc app=leetcode.cn id=剑指 Offer II 048 lang=java
 * @lcpr version=21906
 *
 * [剑指 Offer II 048] 序列化与反序列化二叉树
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    private String SPE=",";
    private String NULL="#";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder builder=new StringBuilder();
        dfs(root,builder);
        return builder.toString();
    }

    private void dfs(TreeNode root, StringBuilder builder) {
        if(root==null){
            builder.append(NULL).append(SPE);
            return;
        }
        builder.append(root.val).append(SPE);
        dfs(root.left, builder);
        dfs(root.right, builder);

    }

    int left=0;
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] nodes=data.split(",");
        left=0;
        return deserialize(nodes,nodes.length-1);
    }

    private TreeNode deserialize(String[] nodes,int right) {
        if(left>right){
            return null;
        }
        String val= nodes[left++];
        if("#".equals(val)){
            return null;
        }
        TreeNode root=new TreeNode(Integer.valueOf(val));
        TreeNode leftNode=deserialize(nodes, right);
        TreeNode rightNode=deserialize(nodes, right);
        root.left=leftNode;
        root.right=rightNode;
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,null,null,4,5]\n
// @lcpr case=end

// @lcpr case=start
// []\n
// @lcpr case=end

// @lcpr case=start
// [1]\n
// @lcpr case=end

// @lcpr case=start
// [1,2]\n
// @lcpr case=end

 */

