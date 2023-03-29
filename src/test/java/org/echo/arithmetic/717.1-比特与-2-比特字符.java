/*
 * @lc app=leetcode.cn id=717 lang=java
 * @lcpr version=21901
 *
 * [717] 1 比特与 2 比特字符
 */

// @lc code=start
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        if (bits[bits.length - 1] != 0) {
            return false;
        }
        if (bits.length == 1) {
            return bits[0] == 0;
        }
        return isOneBitCharacter(bits, bits.length - 2);
    }

    public boolean isOneBitCharacter(int[] bits, int index) {
        if (index == 1) {
            return bits[0] == 1 || (bits[0] == 0 && bits[1] == 0);
        }
        if (index == 0) {
            return bits[0] == 0;
        }
        return (bits[index] == 0 && isOneBitCharacter(bits, index - 1))
                || (bits[index - 1] == 1) && isOneBitCharacter(bits, index - 2);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [0, 0,1,0]
// @lcpr case=end

// @lcpr case=start
// [1,0]
// @lcpr case=end

 */


