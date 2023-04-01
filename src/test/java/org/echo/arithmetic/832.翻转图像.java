/*
 * @lc app=leetcode.cn id=832 lang=java
 * @lcpr version=21901
 *
 * [832] 翻转图像
 */

// @lc code=start
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            int left=0;
            int right=row.length-1;
            while(left<=right){
                int tmp=row[left]==1?0:1;
                row[left]=row[right]==1?0:1;
                row[right]=tmp;
                left++;
                right--;
            }
        }
        return image;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,1,0],[1,0,1],[0,0,0]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]\n
// @lcpr case=end

 */


