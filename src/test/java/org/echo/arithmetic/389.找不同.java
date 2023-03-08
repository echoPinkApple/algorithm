/*
 * @lc app=leetcode.cn id=389 lang=java
 * @lcpr version=21801
 *
 * [389] 找不同
 */

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {
        int[] count=new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            int index=ch-'a';
            count[index]=count[index]+1;
        }
        for (int i = 0; i < t.length(); i++) {
            char ch=t.charAt(i);
            int index=ch-'a';
            count[index]=count[index]-1;
            if(count[index]==-1){
                return ch;
            }
        }
        return ' ';
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
// "abcd"\n"abcde"\n
// @lcpr case=end

// @lcpr case=start
// ""\n"y"\n
// @lcpr case=end

 */


