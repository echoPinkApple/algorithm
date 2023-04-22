import java.util.Deque;
import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=剑指 Offer 37 lang=java
 * @lcpr version=21906
 *
 * [剑指 Offer 37] 序列化二叉树
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
    String NULL="#";
    String SEGMENT=",";
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder builder=new StringBuilder();
        if(root==null){
            builder.append(NULL).append(SEGMENT);
            return builder.toString();
        }
        Deque<TreeNode> stack=new LinkedList<>();
        stack.push(root);
        //先序遍历二叉树
        while(root!=null || !stack.isEmpty()){
            while(root!=null){
                builder.append(root.val);
                builder.append(SEGMENT);
                stack.push(root);
                root=root.left;
            }
            builder.append(NULL);
            builder.append(SEGMENT);
            TreeNode pop = stack.pop();
            root=pop.right;
        }
        return builder.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] split = data.split(SEGMENT);
        if(split.length<1){
            return null;
        }
        LinkedList<String> list=new LinkedList<>();
        for (String str : split) {
            list.add(str);
        }
        return deserialize(list);

    }

    public TreeNode deserialize(LinkedList<String> data){
        String first=data.removeFirst();
        if(NULL.equals(first)){
            return null;
        }
        TreeNode root=new TreeNode(Integer.valueOf(first));
        root.left=deserialize(data);
        root.right=deserialize(data);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,null,null,4,5]\n
// @lcpr case=end

 */

