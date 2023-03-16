import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=506 lang=java
 * @lcpr version=21801
 *
 * [506] 相对名次
 */

// @lc code=start
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int size = score.length;
        String[] desc = { "Gold Medal", "Silver Medal", "Bronze Medal" };
        int[][] arr = new int[size][2];
        for (int i = 0; i < size; i++) {
            arr[i][0] = score[i];
            arr[i][1] = i;
        }
        // 根据分数降序排列
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);
        String[] res = new String[size];
        for (int i = 0; i < size; i++) {
            if (i < 3) {
                //arr[i][1]记录运动员位置
                res[arr[i][1]] = desc[i];
            } else {
                res[arr[i][1]] = Integer.toString(i + 1);
            }
        }
        return res;
    }
}
// @lc code=end

// @lcpr-div-debug-arg-start
// funName=
// paramTypes= []
// returnType=
// @lcpr-div-debug-arg-end

/*
 * // @lcpr case=start
 * [5,4,3,2,1]
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * [10,3,8,9,4]
 * // @lcpr case=end
 * 
 */
