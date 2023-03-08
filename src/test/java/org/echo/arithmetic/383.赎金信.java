import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=383 lang=java
 * @lcpr version=21801
 *
 * [383] 赎金信
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> magaMap=new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
                magaMap.put( magazine.charAt(i),magaMap.getOrDefault(magazine.charAt(i), 0)+1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char charAt = ransomNote.charAt(i);
            if(!magaMap.containsKey(charAt)){
                return false;
            }
            else{
                Integer sum = magaMap.get(charAt);
                if(sum<1){
                    return false;
                }
                else{
                    magaMap.put(charAt, sum-1);
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
// "a"\n"b"\n
// @lcpr case=end

// @lcpr case=start
// "aa"\n"ab"\n
// @lcpr case=end

// @lcpr case=start
// "aa"\n"aab"\n
// @lcpr case=end

 */


