import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * @lc app=leetcode.cn id=1104 lang=java
 * @lcpr version=21906
 *
 * [1104] 二叉树寻路
 */

// @lc code=start
class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        int depth=maxDepth(label);
        int[] res=new int[depth];
        while(depth>=1){
            res[depth-1] = label;
            int step= ((label-(1<<(depth-1)))/2)*3+1 +(label&1);
            label=label-step;
            depth--;
        }
        return Arrays.stream(res).boxed().collect(Collectors.toList());
    }
    public int maxDepth(int label){
        return 32-Integer.numberOfLeadingZeros(label);
    }
}
// @lc code=end



/*
// @lcpr case=start
// 14\n
// @lcpr case=end

// @lcpr case=start
// 26\n
// @lcpr case=end

 */

