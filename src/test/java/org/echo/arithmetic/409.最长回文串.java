/*
 * @lc app=leetcode.cn id=409 lang=java
 * @lcpr version=21801
 *
 * [409] 最长回文串
 */

// @lc code=start
class Solution {
    public int longestPalindrome(String s) {
        char[] charArray = s.toCharArray();
        int[] count=new int[100];
        for (int i = 0; i < charArray.length; i++) {
            count[charArray[i]-'A']++;
        }
        int max=0;
        int odd=0;
        for (int index = 0; index < count.length; index++) {
            if((count[index]&1)==1){
                odd=count[index]>odd?count[index]:odd;
                max+=count[index]-1;
            }
            else{
                max+=count[index];
            }
        }
        return odd>0?max+1:max;
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
// "abccccdd"\n
// @lcpr case=end

// @lcpr case=start
// "a"\n
// @lcpr case=end

// @lcpr case=start
// "aaaaaccc"\n
// @lcpr case=end

 */


