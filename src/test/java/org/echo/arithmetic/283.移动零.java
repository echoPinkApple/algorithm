/*
 * @lc app=leetcode.cn id=283 lang=java
 * @lcpr version=21801
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int slow=0;
        int fast=0;
        int size=nums.length;
        while(fast<size){
            if(nums[fast]!=0){
                nums[slow++]=nums[fast++];
            }
            else{
                fast++;
            }
        }
        for (int i = slow; i < nums.length; i++) {
            nums[i]=0;
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
// [0,1,0,3,12]
// @lcpr case=end

// @lcpr case=start
// [0]
// @lcpr case=end

 */


