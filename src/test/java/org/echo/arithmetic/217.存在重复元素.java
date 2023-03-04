import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;

/*
 * @lc app=leetcode.cn id=217 lang=java
 *
 * [217] 存在重复元素
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int sum= Arrays.stream(nums).distinct().reduce(0, (a,b)->{return a+1;});
        return sum!=nums.length;
    }
}
// @lc code=end

