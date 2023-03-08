import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * @lc app=leetcode.cn id=387 lang=java
 * @lcpr version=21801
 *
 * [387] 字符串中的第一个唯一字符
 */

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {
        int[] count=new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            count[ch-'a']=count[ch-'a']+1;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(count[ch-'a']==1){
                return i;
            }
        }
        return -1;
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
// "leetcode"\n
// @lcpr case=end

// @lcpr case=start
// "loveleetcode"\n
// @lcpr case=end

// @lcpr case=start
// "aabb"\n
// @lcpr case=end

 */


