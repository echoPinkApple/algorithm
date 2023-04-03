import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BiConsumer;

/*
 * @lc app=leetcode.cn id=888 lang=java
 * @lcpr version=21901
 *
 * [888] 公平的糖果交换
 */

// @lc code=start
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum = Arrays.stream(aliceSizes).sum();
        int bobSum=Arrays.stream(bobSizes).sum();
        int delta=(aliceSum-bobSum)/2;
        Set<Integer> aliceSet=new HashSet<>();
        for (int tmp : aliceSizes) {
            aliceSet.add(tmp);
        }
        int[] res=new int[2];
        for (int tmp : bobSizes) {
            int alice=tmp+delta;
            if(aliceSet.contains(alice)){
                res[0]=alice;
                res[1]=tmp;
                return res;
            }
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,1]\n[2,2]\n
// @lcpr case=end

// @lcpr case=start
// [1,2]\n[2,3]\n
// @lcpr case=end

// @lcpr case=start
// [2]\n[1,3]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,5]\n[2,4]\n
// @lcpr case=end

 */


