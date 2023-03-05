import java.util.HashMap;
import java.util.Map;
/*
 * @lc app=leetcode.cn id=242 lang=java
 * @lcpr version=21801
 *
 * [242] 有效的字母异位词
 */
import java.util.Set;

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> s1=new HashMap<>();
        Map<Character,Integer> t1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char temp = s.charAt(i);
            s1.put(temp, s1.getOrDefault(temp, 0)+1);
        }
        for(int i=0;i<t.length();i++){
            char temp = t.charAt(i);
            t1.put(temp, t1.getOrDefault(temp, 0)+1);
        }
        Set<Character> keySet1 = s1.keySet();
        for (Character c : keySet1) {
            if(s1.get(c)!=t1.get(c)){
                return false;
            }
        }        
        return true;
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
// "anagram"\n"nagaram"\n
// @lcpr case=end

// @lcpr case=start
// "rat"\n"car"\n
// @lcpr case=end

 */


