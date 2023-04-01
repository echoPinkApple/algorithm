import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=821 lang=java
 * @lcpr version=21901
 *
 * [821] 字符的最短距离
 */

// @lc code=start
class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer> target=new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==c){
                target.add(i);
            }
        }
        int[] res=new int[s.length()];
        for (int i = 0; i < res.length; i++) {
            res[i]=minLength(target, i);
        }
        return res;
    }
    public int minLength(List<Integer> target,int i){
        int res=Integer.MAX_VALUE;
        for (Integer index : target) {
            res=Math.min(res, Math.abs(index-i));
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "loveleetcode"\n"e"\n
// @lcpr case=end

// @lcpr case=start
// "aaab"\n"b"\n
// @lcpr case=end

 */


