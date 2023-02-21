/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        int index=s.length()-1;
        int length=0;
        while(index>=0 && s.charAt(index)==' '){
            index--;
        }
        while(index>=0 && s.charAt(index)!=' '){
            index--;
            length++;
        }
        return length;
    }
}
// @lc code=end

