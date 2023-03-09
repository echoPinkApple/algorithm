import java.util.Arrays;
import java.util.Collections;

/*
 * @lc app=leetcode.cn id=414 lang=java
 * @lcpr version=21801
 *
 * [414] 第三大的数
 */

// @lc code=start
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int size=nums.length;
        if(size<3){
            return nums[size-1];
        }
        else{
            int index=0;
            for (int i = size-2; i >=0; i--) {
                if(nums[i]!=nums[i+1]){
                    index++;
                }
                if(index==2){
                    return nums[i];
                }
            }
            return nums[size-1];
        }
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
// 10
// @lcpr case=end

// @lcpr case=start
// 20
// @lcpr case=end

// @lcpr case=start
// 26
// @lcpr case=end

 */


