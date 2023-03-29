import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=696 lang=java
 * @lcpr version=21901
 *
 * [696] 计数二进制子串
 */

// @lc code=start
class Solution {
    public int countBinarySubstrings(String s) {
            List<Integer> list=new ArrayList<>();
            int size=s.length();
            int slow=0;
            while(slow<size){
                char tmp = s.charAt(slow);
                int count=0;
                while(slow<size && s.charAt(slow)==tmp){
                    count++;
                    slow++;
                }
                list.add(count);
            }
            int res=0;
            for (int i = 1; i < list.size(); i++) {
                res+=Math.min(list.get(i), list.get(i-1));
            }
            return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "00110011"\n
// @lcpr case=end

// @lcpr case=start
// "10101"\n
// @lcpr case=end

 */


