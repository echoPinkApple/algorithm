/*
 * @lc app=leetcode.cn id=744 lang=java
 * @lcpr version=21901
 *
 * [744] 寻找比目标字母大的最小字母
 */

// @lc code=start
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left=0;
        int right=letters.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(letters[mid]<target){
                left=mid+1;
            }
            else if(letters[mid]==target){
                left=mid+1;
            }
            else if(letters[mid]>target){
                right=mid-1;
            }
        }
        if(left>=letters.length){
            return letters[0];
        }
        return letters[left]>target? letters[left]:letters[0];
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["c", "f"\n"a"\n
// @lcpr case=end

// @lcpr case=start
// ["c","f","j"]\n"c"\n
// @lcpr case=end

// @lcpr case=start
// ["x","x","y","y"]\n"z"\n
// @lcpr case=end

 */


