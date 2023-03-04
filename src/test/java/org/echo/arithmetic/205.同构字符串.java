import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=205 lang=java
 *
 * [205] 同构字符串
 */

// @lc code=start
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> s2t=new HashMap<>();
        Map<Character,Character> t2s=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(s2t.containsKey(c1) && s2t.get(c1)!=c2 || t2s.containsKey(c2) && t2s.get(c2)!=c1){
                return false;
            }
            s2t.put(c1, c2);
            t2s.put(c2, c1);
        }
        return true;
    }
}
// @lc code=end

