import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;

/*
 * @lc app=leetcode.cn id=228 lang=java
 * @lcpr version=21801
 *
 * [228] 汇总区间
 */

// @lc code=start
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        int slow = 0;
        int fast = 0;
        while (fast < nums.length) {
            while ((fast<nums.length-1)&&(nums[fast] + 1 == nums[fast + 1])) {
                fast++;
            }

            StringBuilder builder = new StringBuilder();
            if (fast == slow) {
                builder.append(Integer.toString(nums[fast]));
                res.add(builder.toString());
                slow++;
                fast++;
            } else if (slow < fast) {
                builder.append(Integer.toString(nums[slow]));
                builder.append("->");
                builder.append(Integer.toString(nums[fast]));
                res.add(builder.toString());
                slow = ++fast;
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
// @lcpr case=start
// [0,1,2,4,5,7]\n
// @lcpr case=end

// @lcpr case=start
// [0,2,3,4,6,8,9]\n
// @lcpr case=end

 */


