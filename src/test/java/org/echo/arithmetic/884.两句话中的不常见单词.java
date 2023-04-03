import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=884 lang=java
 * @lcpr version=21901
 *
 * [884] 两句话中的不常见单词
 */

// @lc code=start
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        String[] split1 = s1.split(" ");
        for (String sp : split1) {
            map1.put(sp, map1.getOrDefault(sp, 0) + 1);
        }
        String[] split2 = s2.split(" ");
        for (String sp : split2) {
            map2.put(sp, map2.getOrDefault(sp, 0) + 1);
        }
        List<String> res = new ArrayList<>();
        for (String keySet : map1.keySet()) {
            Integer count = map1.get(keySet);
            if (count == 1 && !map2.containsKey(keySet)) {
                res.add(keySet);
            }
        }
        for (String keySet : map2.keySet()) {
            Integer count = map2.get(keySet);
            if (count == 1 && !map1.containsKey(keySet)) {
                res.add(keySet);
            }
        }
        return res.toArray(new String[0]);
    }
}
// @lc code=end



/*
// @lcpr case=start
// "this apple is sweet"\n"this apple is sour"\n
// @lcpr case=end

// @lcpr case=start
// "apple apple"\n"banana"\n
// @lcpr case=end

 */


