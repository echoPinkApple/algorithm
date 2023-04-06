import java.util.Deque;
import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=449 lang=java
 * @lcpr version=21901
 *
 * [449] 序列化和反序列化二叉搜索树
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
    String SEP=",";
    String NULL="#";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder builder=new StringBuilder();
        if(root==null){
            builder.append(NULL).append(SEP);
            return builder.toString();
        }
        Deque<TreeNode> stack=new LinkedList<>();
        while(!stack.isEmpty() || root!=null){
            while(root!=null){
                builder.append(root.val).append(SEP);
                stack.push(root);
                root=root.left;
            }
            builder.append(NULL).append(SEP);
            TreeNode node=stack.pop();
            root=node.right;
        }
        return builder.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        LinkedList<String> list=new LinkedList<>();
        String[] split = data.split(SEP);
        for (String str : split) {
            list.add(str);
        }
        return deserialize(list);
    }

    private TreeNode deserialize(LinkedList<String> list) {
        if(list.size()<1){
            return null;
        }
        String first = list.removeFirst();
        if(NULL.equals(first)){
            return null;
        }
        TreeNode root=new TreeNode(Integer.valueOf(first));
        root.left=deserialize(list);
        root.right=deserialize(list);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;
// @lc code=end



/*
// @lcpr case=start
// [2,1,3]\n
// @lcpr case=end

// @lcpr case=start
// []\n
// @lcpr case=end

 */


