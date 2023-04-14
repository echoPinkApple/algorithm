import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=1361 lang=java
 * @lcpr version=21906
 *
 * [1361] 验证二叉树
 */

// @lc code=start
class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int[] in=new int[n];
        for (int i = 0; i < n; i++) {
            if(leftChild[i]!=-1){
                in[leftChild[i]]++;
            }
            if(rightChild[i]!=-1){
                in[rightChild[i]]++;
            }
        }
        int root=-1;
        for (int i = 0; i < n; i++) {
            if(in[i]==0){
                root=i;
                break;
            }
        }
        if(root==-1){
            return false;
        }
        //开始广搜
        Queue<Integer> queue=new LinkedList<>();
        Set<Integer> set=new HashSet<>();//记录访问过的节点  如果有重复说明不是二叉树
        queue.offer(root);
        set.add(root);
        while (!queue.isEmpty()){
            int temp=queue.poll();
            if (leftChild[temp]!=-1){
                //左子树不为空
                if (set.contains(leftChild[temp])){
                    //左子节点 被访问过
                    return false;
                }
                queue.offer(leftChild[temp]);
                set.add(leftChild[temp]);
            }
            if (rightChild[temp]!=-1){
                //右子树不为空
                if (set.contains(rightChild[temp])){
                    //有子节点 被访问过
                    return false;
                }
                queue.offer(rightChild[temp]);
                set.add(rightChild[temp]);
            }
        }
        //如果set里节点数量就为n那么说明全部节点被访问    因为上面有重复的已经判断了  只剩下没访问的没判断
        return set.size()==n;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 4\n[1,-1,3,-1]\n[2,-1,-1,-1]\n
// @lcpr case=end

// @lcpr case=start
// 4\n[1,-1,3,-1]\n[2,3,-1,-1]\n
// @lcpr case=end

// @lcpr case=start
// 2\n[1,0]\n[-1,-1]\n
// @lcpr case=end

// @lcpr case=start
// 6\n[1,-1,-1,4,-1,-1]\n[2,-1,-1,5,-1,-1]\n
// @lcpr case=end

 */

