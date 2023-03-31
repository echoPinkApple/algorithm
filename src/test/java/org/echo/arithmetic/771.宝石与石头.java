import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=771 lang=java
 * @lcpr version=21901
 *
 * [771] 宝石与石头
 */

// @lc code=start
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set=new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }
        int res=0;
        for (int i = 0; i < stones.length(); i++) {
            if(set.contains(stones.charAt(i))){
                res++;
            }
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "aA"\n"aAAbbbb"\n
// @lcpr case=end

// @lcpr case=start
// "z"\n"ZZ"\n
// @lcpr case=end

 */


