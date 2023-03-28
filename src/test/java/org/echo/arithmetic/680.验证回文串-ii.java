/*
 * @lc app=leetcode.cn id=680 lang=java
 * @lcpr version=21901
 *
 * [680] 验证回文串 II
 */

// @lc code=start
class Solution {
    public boolean validPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return validPalindrome(s,left+1,right) || validPalindrome(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean validPalindrome(String s,int low,int hight){
        while(low<hight){
            if(s.charAt(low)!=s.charAt(hight)){
                return false;
            }
            low++;
            hight--;
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "deeee"
// @lcpr case=end

// @lcpr case=start
// "eeeeed"
// @lcpr case=end

// @lcpr case=start
// "abcbba"
// @lcpr case=end

 */


