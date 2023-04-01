/*
 * @lc app=leetcode.cn id=860 lang=java
 * @lcpr version=21901
 *
 * [860] 柠檬水找零
 */

// @lc code=start
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] remain=new int[3];
        for (int i = 0; i < bills.length; i++) {
            if(!change(remain, bills[i])){
                return false;
            }
        }
        return true;
    }
    public boolean change(int[] remain,int pay){
        if(pay==5){
            remain[0]++;
            return true;
        }
        else if(pay==10){
             if(remain[0]>0){
                remain[0]--;
                remain[1]++;
                return true;
             }
             else{
                return false;
             }
        }
        else if(pay==20){
            if(remain[1]>0 && remain[0]>0){
                remain[1]--;
                remain[0]--;
                remain[2]++;
                return true;
            }
            else if(remain[0]>=3){
                remain[0]-=3;
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [5,5,5,10,20]\n
// @lcpr case=end

// @lcpr case=start
// [5,5,10,10,20]\n
// @lcpr case=end

 */


