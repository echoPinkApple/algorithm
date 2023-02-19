/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int m=strs.length;
        int n=strs[0].length();
        for(int col=0;col<n;col++){
            for(int row=1;row<m;row++){
                String cur=strs[row];
                String pre=strs[row-1];
                //当某一个数组长度小于col或索引所在位置字符不相等的时候，返回结果
                if(col>cur.length() || col>pre.length()|| cur.charAt(col)!=pre.charAt(col)){
                    return strs[0].substring(0,col);
                }
            }
        }
        return strs[0];
    }
}
// @lc code=end

