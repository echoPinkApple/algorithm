import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=594 lang=java
 * @lcpr version=21801
 *
 * [594] 最长和谐子序列
 */

// @lc code=start
class Solution {
    public int findLHS(int[] nums) {
        int res=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for (Integer keySet : map.keySet()) {
            if(map.containsKey(keySet+1)){
                res=Math.max(res, map.get(keySet)+map.get(keySet+1));
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
// [1,3,2,2,5,2,3,7]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4]\n
// @lcpr case=end

// @lcpr case=start
// [1,1,1,1]\n
// @lcpr case=end

 */


