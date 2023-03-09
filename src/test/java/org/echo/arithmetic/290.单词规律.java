import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=290 lang=java
 * @lcpr version=21801
 *
 * [290] 单词规律
 */

// @lc code=start
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] split = s.split(" ");
        int size=pattern.length();
        if(split.length!=size)
            return false;
        Map<Character,String> relation=new HashMap<>();
        Map<String,Character> relation2=new HashMap<>();
        for (int i = 0; i < size; i++) {
            if(relation.containsKey(pattern.charAt(i))){
                String temp = relation.get(pattern.charAt(i));
                if(!temp.equals(split[i]) || !(pattern.charAt(i)==(relation2.get(temp)))){
                    return false;
                }
            }
            else{
                relation.put(pattern.charAt(i), split[i]);
                if(!relation2.containsKey(split[i])){
                    relation2.put(split[i], pattern.charAt(i));
                }
                else{
                    return false;
                }
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
// "abba"\n"dog dog dog dog"\n
// @lcpr case=end

// @lcpr case=start
// "abba"\n"dog cat cat fish"\n
// @lcpr case=end

// @lcpr case=start
// "abc"\n"dog cat dog"\n
// @lcpr case=end

 */


