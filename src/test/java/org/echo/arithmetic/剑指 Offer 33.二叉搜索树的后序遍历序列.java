/*
 * @lc app=leetcode.cn id=剑指 Offer 33 lang=java
 * @lcpr version=21906
 *
 * [剑指 Offer 33] 二叉搜索树的后序遍历序列
 */

// @lc code=start
class Solution {
    public boolean verifyPostorder(int[] postorder) {
        return verifyPostorder(postorder, 0, postorder.length-1);
    }
    public boolean verifyPostorder(int[] postorder,int start,int end){
        if(start>=end){
            return true;
        }
        int rootVal=postorder[end];
        int index=end;
        for (int i = start; i < end; i++) {
            if(postorder[i]>rootVal){
                index=i;
                break;
            }
        }
        for (int i = index; i < end; i++) {
            if(postorder[i]<rootVal){
                return false;
            }
        }
        for (int i = start; i < index; i++) {
            if(postorder[i]>rootVal){
                return false;
            }
        }
        return verifyPostorder(postorder, start, index-1) && verifyPostorder(postorder, index, end-1);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,6,3,2,5]\n
// @lcpr case=end

// @lcpr case=start
// [4,6,7,5]\n
// @lcpr case=end

 */

